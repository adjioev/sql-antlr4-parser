package com.ecwid.visitors;

import com.ecwid.antlrparser.SqlParser;
import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.query.select.*;
import java.util.List;
import java.util.stream.Collectors;

public class SelectClauseVisitor extends SqlParserBaseVisitor<SelectComponent> {

    @Override
    public SelectComponent visitAsteriskSelect(SqlParser.AsteriskSelectContext ctx) {
        return new AsteriskSelect();
    }

    @Override
    public SelectComponent visitSelectList(SqlParser.SelectListContext ctx) {
        List<SelectElement> elements = ctx.selectElement().stream()
                .map(this::visitSelectElement)
                .collect(Collectors.toList());
        return new SelectList(elements);
    }

    @Override
    public SelectElement visitSelectElement(SqlParser.SelectElementContext ctx) {
        Expression expression = visitExpression(ctx.expression());
        String alias = ctx.alias() != null ? ctx.alias().getText() : null;
        return new SelectElement(expression, alias);
    }

    public ColumnExpression visitExpression(SqlParser.ExpressionContext ctx) {
        if (ctx instanceof SqlParser.ColumnNameExprContext) {
            String columnName = ctx.getText();
            return new ColumnExpression(columnName);
        }
        else if (ctx instanceof SqlParser.QualifiedColumnNameExprContext) {
            String qualifiedName = ctx.getText();
            return new ColumnExpression(qualifiedName);
        }
//        else if (ctx instanceof SqlParser.TableAsteriskExprContext) {
//            String tableName = ((SqlParser.TableAsteriskExprContext) ctx).IDENTIFIER().getText();
//            return new TableAsteriskExpression(tableName);
//        } else if (ctx instanceof SqlParser.LiteralExprContext) {
//            Object value = parseLiteral(((SqlParser.LiteralExprContext) ctx).literal());
//            return new LiteralExpression(value);
//        }
//        else if (ctx instanceof SqlParser.FunctionCallExprContext) {
//            return visitFunctionCall(((SqlParser.FunctionCallExprContext) ctx).functionCall());
//        } else if (ctx instanceof SqlParser.ParenthesizedExprContext) {
//            return visitExpression(((SqlParser.ParenthesizedExprContext) ctx).expression());
//        } else if (ctx instanceof SqlParser.BinaryOperationExprContext) {
//            SqlParser.BinaryOperationExprContext binOpCtx = (SqlParser.BinaryOperationExprContext) ctx;
//            Expression left = visitExpression(binOpCtx.expression(0));
//            String operator = binOpCtx.operator().getText();
//            Expression right = visitExpression(binOpCtx.expression(1));
//            return new BinaryExpression(left, operator, right);
//        }
        else {
            // Handle any other expression types
            return null;
        }
    }


    /*
    public FunctionCallExpression visitFunctionCall(SqlParser.FunctionCallContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        List<Expression> arguments = ctx.expression().stream()
                .map(this::visitExpression)
                .collect(Collectors.toList());
        return new FunctionCallExpression(functionName, arguments);
    }

    private Object parseLiteral(SqlParser.LiteralContext ctx) {
        if (ctx.NUMBER() != null) {
            String numberText = ctx.NUMBER().getText();
            if (numberText.contains(".")) {
                return Double.parseDouble(numberText);
            } else {
                return Integer.parseInt(numberText);
            }
        } else if (ctx.STRING() != null) {
            String text = ctx.STRING().getText();
            return text.substring(1, text.length() - 1); // Remove quotes
        }
        return null;
    }
     */
}