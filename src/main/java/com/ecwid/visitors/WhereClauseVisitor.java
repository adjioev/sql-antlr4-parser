package com.ecwid.visitors;

import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.antlrparser.SqlParser;
import com.ecwid.query.where.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WhereClauseVisitor extends SqlParserBaseVisitor<WhereComponent> {

    @Override
    public WhereComponent visitOrOperation(SqlParser.OrOperationContext ctx) {
        WhereComponent left = visit(ctx.orExpression());
        WhereComponent right = visit(ctx.andExpression());
        return new OrCondition(Arrays.asList(left, right));
    }

    @Override
    public WhereComponent visitAndOperation(SqlParser.AndOperationContext ctx) {
        WhereComponent left = visit(ctx.andExpression());
        WhereComponent right = visit(ctx.unaryExpression());
        return new AndCondition(Arrays.asList(left, right));
    }

    @Override
    public WhereComponent visitNotOperation(SqlParser.NotOperationContext ctx) {
        WhereComponent condition = visit(ctx.unaryExpression());
        return new NotCondition(condition);
    }

    @Override
    public WhereComponent visitNestedExpr(SqlParser.NestedExprContext ctx) {
        return visit(ctx.orExpression());
    }

    @Override
    public WhereComponent visitSimpleCondition(SqlParser.SimpleConditionContext ctx) {
        return visit(ctx.whereClause());
    }

    @Override
    public WhereComponent visitComparisonCondition(SqlParser.ComparisonConditionContext ctx) {
        String column = ctx.IDENTIFIER().getText();
        String operator = ctx.COMP_OPERATOR().getText();
        Object value = parseValue(ctx.whereValue());
        return new WhereClause(column, operator, value);
    }

    @Override
    public WhereComponent visitLikeCondition(SqlParser.LikeConditionContext ctx) {
        String column = ctx.IDENTIFIER().getText();
        Object value = parseValue(ctx.whereValue());
        return new LikeCondition(column, value);
    }

    @Override
    public WhereComponent visitBetweenCondition(SqlParser.BetweenConditionContext ctx) {
        String column = ctx.IDENTIFIER().getText();
        Object lower = parseValue(ctx.whereValue(0));
        Object upper = parseValue(ctx.whereValue(1));
        return new BetweenCondition(column, lower, upper);
    }

    @Override
    public WhereComponent visitInCondition(SqlParser.InConditionContext ctx) {
        String column = ctx.IDENTIFIER().getText();
        List<Object> values = ctx.whereValueList().whereValue().stream()
                .map(this::parseValue)
                .collect(Collectors.toList());
        return new InCondition(column, values);
    }

    private Object parseValue(SqlParser.WhereValueContext ctx) {
        if (ctx.NUMBER() != null) {
            String numberText = ctx.NUMBER().getText();
            if (numberText.contains(".")) {
                return Double.parseDouble(numberText);
            } else {
                return Integer.parseInt(numberText);
            }
        } else if (ctx.STRING() != null) {
            String text = ctx.STRING().getText();
            return text.substring(1, text.length() - 1);
        } else if (ctx.IDENTIFIER() != null) {
            return ctx.IDENTIFIER().getText();
        }
        return null;
    }
}