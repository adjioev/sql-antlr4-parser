package com.ecwid;

import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.antlrparser.SqlParser;
import com.ecwid.query.*;
import com.ecwid.query.join.Join;
import com.ecwid.query.where.WhereComponent;

public class SqlQueryVisitor extends SqlParserBaseVisitor<Query> {

    @Override
    public Query visitSelect(SqlParser.SelectContext ctx) {
        Query query = new Query();

        // Process select elements
        visitSelectElements(ctx.selectElements(), query);

        // Get table name
        String tableName = ctx.tableName().getText();
        query.setTableName(tableName);

        // Use WhereClauseVisitor to process the WHERE clause
        if (ctx.WHERE() != null && ctx.orExpression() != null) {
            WhereClauseVisitor whereVisitor = new WhereClauseVisitor();
            WhereComponent whereComponent = whereVisitor.visit(ctx.orExpression());
            query.setWhereComponent(whereComponent);
        }

        if (ctx.joinClause() != null) {
            JoinClauseVisitor joinVisitor = new JoinClauseVisitor();
            ctx.joinClause().forEach(joinCtx -> {
                Join join = joinVisitor.visit(joinCtx);
                query.addJoin(join);
            });
//            Join join = joinVisitor.visit(ctx.joinClause());
//            query.addJoin(join);
        }

        // ORDER BY
        if (ctx.orderByClause() != null) {
            Sort sort = new Sort();
            SqlParser.OrderByClauseContext orderByCtx = ctx.orderByClause();
            if (orderByCtx.order() != null) {
                String order = orderByCtx.order().getText();
                sort.setOrder(order);
            }
            for (SqlParser.OrderColumnContext orderColumnCtx : orderByCtx.orderColumn()) {
                sort.addColumn( orderColumnCtx.getText());
            }
            query.setSort(sort);
        }

        // Set LIMIT and OFFSET
        if (ctx.limitClause() != null) {
            query.setLimit(Integer.parseInt(ctx.limitClause().NUMBER().getText()));
        }
        if (ctx.offsetClause() != null) {
            query.setOffset(Integer.parseInt(ctx.offsetClause().NUMBER().getText()));
        }

        return query;
    }

    // Helper method to visit selectElements and extract columns
    private void visitSelectElements(SqlParser.SelectElementsContext ctx, Query query) {
        if (ctx.ASTERIX() != null) {
            query.addColumn("*");
        } else {
            // Loop through each columnName in selectElements
            for (SqlParser.ColumnNameContext columnCtx : ctx.columnName()) {
                String columnName = columnCtx.getText();
                query.addColumn(columnName);
            }
        }
    }
}