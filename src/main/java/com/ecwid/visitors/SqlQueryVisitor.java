package com.ecwid.visitors;

import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.antlrparser.SqlParser;
import com.ecwid.query.*;
import com.ecwid.query.join.Join;
import com.ecwid.query.select.SelectComponent;
import com.ecwid.query.source.SourceComponent;
import com.ecwid.query.where.WhereComponent;

public class SqlQueryVisitor extends SqlParserBaseVisitor<Query> {

    @Override
    public Query visitSelect(SqlParser.SelectContext ctx) {
        Query query = new Query();

        // SELECT
        if (ctx.SELECT() != null  && ctx.selectElements() != null) {
            SelectClauseVisitor selectClauseVisitor = new SelectClauseVisitor();
            SelectComponent selectComponent = selectClauseVisitor.visit(ctx.selectElements());
            query.setSelectComponent(selectComponent);
        }

        // TODO: move join clause here
        if (ctx.FROM() != null  && ctx.tableList() != null) {
            SourceClauseVisitor sourceClauseVisitor = new SourceClauseVisitor();
            SourceComponent sourceComponent = sourceClauseVisitor.visit(ctx.tableList());
            query.setSourceComponent(sourceComponent);
        }

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
}