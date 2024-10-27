package com.ecwid.visitors;

import com.ecwid.antlrparser.SqlParser;
import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.query.GroupBy;

public class GroupByClauseVisitor extends SqlParserBaseVisitor<GroupBy> {

    @Override
    public GroupBy visitGroupByClause(SqlParser.GroupByClauseContext ctx) {
        GroupBy groupBy = new GroupBy();
        ctx.groupColumn().forEach(groupByColumnCtx -> {
            groupBy.addColumn(groupByColumnCtx.getText());
        });
        return groupBy;
    }
}
