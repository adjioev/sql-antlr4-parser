package com.ecwid.visitors;

import com.ecwid.antlrparser.SqlParser;
import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.query.Query;
import com.ecwid.query.source.*;

public class SourceClauseVisitor extends SqlParserBaseVisitor<SourceComponent> {

    @Override
    public SourceList visitTableList(SqlParser.TableListContext ctx) {
        SourceList sourceList = new SourceList();
        for (SqlParser.TableElementContext tableElementCtx : ctx.tableElement()) {
            Source source = visitTableElement(tableElementCtx);
            sourceList.add(source);
        }
        return sourceList;
    }

    public Source visitTableElement(SqlParser.TableElementContext ctx) {
        Source source = visitTableSource(ctx.tableSource());
        if (ctx.alias() != null) {
            source.setAlias(ctx.alias().getText());
        }
        return source;
    }

    public Source visitTableSource(SqlParser.TableSourceContext ctx) {
        if (ctx instanceof SqlParser.TableNameSourceContext) {
            return visitTableNameSource((SqlParser.TableNameSourceContext) ctx);
        } else if (ctx instanceof SqlParser.SubquerySourceContext) {
            return visitSubquerySource((SqlParser.SubquerySourceContext) ctx);
        } else {
            throw new UnsupportedOperationException("Unknown table source type: " + ctx.getClass().getName());
        }
    }


    public TableSource visitTableNameSource(SqlParser.TableNameSourceContext ctx) {
        String tableName = ctx.tableName().getText();
        return new TableSource(tableName);
    }

    public SubquerySource visitSubquerySource(SqlParser.SubquerySourceContext ctx) {
        // Process the subquery
        SqlQueryVisitor subqueryVisitor = new SqlQueryVisitor();
        Query subquery = subqueryVisitor.visit(ctx.select());
        return new SubquerySource(subquery);
    }

}
