package com.ecwid;

import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.antlrparser.SqlParser;
import com.ecwid.query.Query;

public class SqlQueryVisitor extends SqlParserBaseVisitor<Query> {
    @Override
    public Query visitSelect(SqlParser.SelectContext ctx) {
        Query query = new Query();

        // Visit selectElements to get columns
        visitSelectElements(ctx.selectElements(), query);

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


}
