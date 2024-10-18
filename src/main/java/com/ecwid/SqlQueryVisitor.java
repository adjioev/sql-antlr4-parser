package com.ecwid;

import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.antlrparser.SqlParser;
import com.ecwid.query.*;

import java.util.Arrays;

public class SqlQueryVisitor extends SqlParserBaseVisitor<Object> {
    @Override
    public Query visitSelect(SqlParser.SelectContext ctx) {
        Query query = new Query();

        // Visit selectElements to get columns
        visitSelectElements(ctx.selectElements(), query);
        // Get table name from the FROM clause
        String tableName = ctx.tableName().getText();
        // Visit whereExpression to get where clauses
        WhereComponent whereComponent = visitWhereExpression(ctx.whereExpression());

        query.setTableName(tableName);
        query.setWhereComponent(whereComponent);
        return query;
    }

    // Helper method to visit selectElements and extract columns
    private void visitSelectElements(SqlParser.SelectElementsContext ctx, Query query) {
        // Loop through each columnName in selectElements
        for (SqlParser.ColumnNameContext columnCtx : ctx.columnName()) {
            String columnName = columnCtx.getText();
            query.addColumn(columnName);
        }
    }

    public WhereComponent visitWhereExpression(SqlParser.WhereExpressionContext ctx) {
        // Visit the first whereClauses
        WhereComponent left = (WhereComponent) visit(ctx.whereClauses(0));

        // If there are more whereClauses connected by logical operators
        for (int i = 1; i < ctx.whereClauses().size(); i++) {
            String operator = ctx.logicalOperator(i - 1).getText().toUpperCase();
            WhereComponent right = (WhereComponent) visit(ctx.whereClauses(i));

            if (operator.equals("AND")) {
                left = new AndCondition(Arrays.asList(left, right));
            } else if (operator.equals("OR")) {
                left = new OrCondition(Arrays.asList(left, right));
            }
        }
        return left;
    }


    @Override
    public WhereComponent visitWhereClauses(SqlParser.WhereClausesContext ctx) {
        if (ctx.whereClause() != null && ctx.whereClause().size() > 0) {
            // Multiple whereClauses connected by logical operators
            WhereComponent left = (WhereComponent) visit(ctx.whereClause(0));

            for (int i = 1; i < ctx.whereClause().size(); i++) {
                String operator = ctx.logicalOperator(i - 1).getText().toUpperCase();
                WhereComponent right = (WhereComponent) visit(ctx.whereClause(i));

                if (operator.equals("AND")) {
                    left = new AndCondition(Arrays.asList(left, right));
                } else if (operator.equals("OR")) {
                    left = new OrCondition(Arrays.asList(left, right));
                }
            }
            return left;
        } else if (ctx.whereExpression() != null) {
            // It's a nested expression in parentheses
            return (WhereComponent) visit(ctx.whereExpression());
        } else {
            // Should not reach here
            return null;
        }
    }

    public WhereComponent visitWhereClause(SqlParser.WhereClauseContext ctx) {
        String column = ctx.IDENTIFIER().getText();
        String operator = ctx.COMP_OPERATOR().getText();
        Object value = ctx.whereValue().getText();
        return new WhereClause(column, operator, value);
    }
}
