package com.ecwid.visitors;

import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.antlrparser.SqlParser;
import com.ecwid.query.condition.*;
import com.ecwid.query.condition.Condition;
import com.ecwid.query.condition.having.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HavingClauseVisitor extends SqlParserBaseVisitor<Condition> {

    @Override
    public Condition visitHavingOrOperation(SqlParser.HavingOrOperationContext ctx) {
        Condition left = visit(ctx.havingOrExpression());
        Condition right = visit(ctx.havingAndExpression());
        return new OrCondition(Arrays.asList(left, right));
    }

    @Override
    public Condition visitHavingAndOperation(SqlParser.HavingAndOperationContext ctx) {
        Condition left = visit(ctx.havingAndExpression());
        Condition right = visit(ctx.havingUnaryExpression());
        return new AndCondition(Arrays.asList(left, right));
    }

    @Override
    public Condition visitHavingNotOperation(SqlParser.HavingNotOperationContext ctx) {
        Condition condition = visit(ctx.havingUnaryExpression());
        return new NotCondition(condition);
    }

    @Override
    public Condition visitHavingNestedExpr(SqlParser.HavingNestedExprContext ctx) {
        return visit(ctx.havingOrExpression());
    }

    @Override
    public Condition visitHavingSimpleCondition(SqlParser.HavingSimpleConditionContext ctx) {
        return visit(ctx.havingClause());
    }

    @Override
    public Condition visitHavingComparisonCondition(SqlParser.HavingComparisonConditionContext ctx) {
        String func = ctx.aggregateFunction().getText();
        String column = ctx.havingColumn().getText();
        String operator = ctx.COMP_OPERATOR().getText();
        Object value = parseValue(ctx.havingValue());
        return new HavingComparisonCondition(func, column, operator, value);
    }

    @Override
    public Condition visitHavingLikeCondition(SqlParser.HavingLikeConditionContext ctx) {
        String func = ctx.aggregateFunction().getText();
        String column = ctx.havingColumn().getText();
        Object value = parseValue(ctx.havingValue());
        return new HavingLikeCondition(func, column, value);
    }

    @Override
    public Condition visitHavingBetweenCondition(SqlParser.HavingBetweenConditionContext ctx) {
        String func = ctx.aggregateFunction().getText();
        String column = ctx.havingColumn().getText();
        Object lower = parseValue(ctx.havingValue(0));
        Object upper = parseValue(ctx.havingValue(1));
        return new HavingBetweenCondition(func, column, lower, upper);
    }

    @Override
    public Condition visitHavingInCondition(SqlParser.HavingInConditionContext ctx) {
        String func = ctx.aggregateFunction().getText();
        String column = ctx.havingColumn().getText();
        List<Object> values = ctx.havingValueList().havingValue().stream()
                .map(this::parseValue)
                .collect(Collectors.toList());
        return new HavingInCondition(func, column, values);
    }

    @Override
    public Condition visitHavingIsNullCondition(SqlParser.HavingIsNullConditionContext ctx) {
        String func = ctx.aggregateFunction().getText();
        String column = ctx.havingColumn().getText();
        boolean isNot = ctx.NOT() != null;
        return new HavingIsNullCondition(func, column, isNot);
    }

    private Object parseValue(SqlParser.HavingValueContext ctx) {
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
