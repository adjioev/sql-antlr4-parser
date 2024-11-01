package com.ecwid.visitors;

import com.ecwid.antlrparser.SqlParser;
import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.query.expression.ColumnExpression;
import com.ecwid.query.expression.Expression;
import com.ecwid.query.expression.FunctionCallExpression;
import com.ecwid.query.select.*;
import org.antlr.v4.runtime.tree.TerminalNode;

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

    public Expression visitExpression(SqlParser.ExpressionContext ctx) {
        if (ctx instanceof SqlParser.ColumnNameExprContext) {
            String columnName = ctx.getText();
            return new ColumnExpression(null, columnName);
        } else if (ctx instanceof SqlParser.QualifiedColumnNameExprContext) {
            List<TerminalNode> identifiers = ((SqlParser.QualifiedColumnNameExprContext) ctx).IDENTIFIER();
            String tableName = identifiers.get(0).getText();
            String columnName = identifiers.get(1).getText();
            return new ColumnExpression(tableName, columnName);
        } else if (ctx instanceof SqlParser.AsteriskExprContext) {
            return new ColumnExpression(null, "*");
        } else if (ctx instanceof SqlParser.TableAsteriskExprContext) {
            String tableName = ((SqlParser.TableAsteriskExprContext) ctx).IDENTIFIER().getText();
            return new ColumnExpression(tableName, "*");
        } else if (ctx instanceof SqlParser.FunctionCallExprContext functionCallCtx) {
            SqlParser.FunctionCallContext functionCallContext =  functionCallCtx.functionCall();
            return visitFunctionalExpression(functionCallContext);
        }
        else {
            return null;
        }
    }
    public FunctionCallExpression visitFunctionalExpression(SqlParser.FunctionCallContext ctx) {
        String functionName = ctx.aggregateFunction().getText();
        List<Expression> arguments = ctx.expression().stream()
                .map(this::visitExpression)
                .collect(Collectors.toList());
        return new FunctionCallExpression(functionName, arguments);
    }

}