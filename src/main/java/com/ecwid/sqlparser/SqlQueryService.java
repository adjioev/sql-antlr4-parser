package com.ecwid.sqlparser;

import com.ecwid.visitors.SqlQueryVisitor;
import com.ecwid.antlrparser.SqlParser;
import com.ecwid.query.Query;
import org.antlr.v4.runtime.tree.ParseTree;

public class SqlQueryService {

    public Query getQueryFromSql(String sql) {
        SqlParser parser = SqlParserFactory.getParser(sql);
        ParseTree tree = parser.statement();
        SqlQueryVisitor visitor = new SqlQueryVisitor();
        return visitor.visit(tree);
    }
}