package com.ecwid.visitors;

import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.antlrparser.SqlParser;
import com.ecwid.query.condition.*;
import com.ecwid.query.condition.Condition;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WhereClauseVisitor extends SqlParserBaseVisitor<Condition> {

    @Override
    public Condition visitOrOperation(SqlParser.OrOperationContext ctx) {
        Condition left = visit(ctx.orExpression());
        Condition right = visit(ctx.andExpression());
        return new OrCondition(Arrays.asList(left, right));
    }

    @Override
    public Condition visitAndOperation(SqlParser.AndOperationContext ctx) {
        Condition left = visit(ctx.andExpression());
        Condition right = visit(ctx.unaryExpression());
        return new AndCondition(Arrays.asList(left, right));
    }

    @Override
    public Condition visitNotOperation(SqlParser.NotOperationContext ctx) {
        Condition condition = visit(ctx.unaryExpression());
        return new NotCondition(condition);
    }

    @Override
    public Condition visitNestedExpr(SqlParser.NestedExprContext ctx) {
        return visit(ctx.orExpression());
    }

    @Override
    public Condition visitSimpleCondition(SqlParser.SimpleConditionContext ctx) {
        return visit(ctx.whereClause());
    }

    @Override
    public Condition visitComparisonCondition(SqlParser.ComparisonConditionContext ctx) {
        String column = ctx.IDENTIFIER().getText();
        String operator = ctx.COMP_OPERATOR().getText();
        Object value = parseValue(ctx.whereValue());
        return new ComparisonCondition(column, operator, value);
    }

    @Override
    public Condition visitLikeCondition(SqlParser.LikeConditionContext ctx) {
        String column = ctx.IDENTIFIER().getText();
        Object value = parseValue(ctx.whereValue());
        return new LikeCondition(column, value);
    }

    @Override
    public Condition visitBetweenCondition(SqlParser.BetweenConditionContext ctx) {
        String column = ctx.IDENTIFIER().getText();
        Object lower = parseValue(ctx.whereValue(0));
        Object upper = parseValue(ctx.whereValue(1));
        return new BetweenCondition(column, lower, upper);
    }

    @Override
    public Condition visitInCondition(SqlParser.InConditionContext ctx) {
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