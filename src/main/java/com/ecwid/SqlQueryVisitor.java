package com.ecwid;

import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.antlrparser.SqlParser;
import com.ecwid.query.*;

public class SqlQueryVisitor extends SqlParserBaseVisitor<Query> {
    @Override
    public Query visitSelect(SqlParser.SelectContext ctx) {
        Query query = new Query();

        // Visit selectElements to get columns
        visitSelectElements(ctx.selectElements(), query);

        // Visit whereExpression to get where clauses
        visitWhereExpression(ctx.whereExpression(), query);

        // Get table name from the FROM clause
        String tableName = ctx.tableName().getText();
        query.setTableName(tableName);

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

    private void visitWhereExpression(SqlParser.WhereExpressionContext ctx, Query query) {
        System.out.println("Visitning where expression" + ctx);
        // add whereExpression
        WhereExpression whereExpression = new WhereExpression();
        for (SqlParser.WhereClausesContext expressionCtx : ctx.whereClauses()) {
            visitWhereClauses(expressionCtx, whereExpression);
        }
        query.setWhereExpression(whereExpression);
    }

    private void visitWhereClauses(SqlParser.WhereClausesContext ctx, WhereExpression whereExpression) {
        System.out.println("Visitning where clauses" + ctx);
        WhereClauses whereClauses = new WhereClauses();
        for (SqlParser.WhereClauseContext whereClauseCtx : ctx.whereClause()) {
           WhereClause whereClause = visitWhereClause(whereClauseCtx,  null);
        }
        whereExpression.addWhereComponent(whereClause);
    }
    private WhereComponent visitWhereClause(SqlParser.WhereClauseContext ctx, WhereExpression whereExpression) {
        String column = ctx.IDENTIFIER().getText();
        String operator = ctx.COMP_OPERATOR().getText();
        Object value = ctx.whereValue().getText();
        return new WhereClause(column, operator, value);
    }


}
