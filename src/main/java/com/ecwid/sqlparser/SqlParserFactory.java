package com.ecwid.sqlparser;

import com.ecwid.antlrparser.SqlLexer;
import com.ecwid.antlrparser.SqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class SqlParserFactory {
    public static SqlParser getParser(String sql) {
        CharStream input = CharStreams.fromString(sql);
        SqlLexer lexer = new SqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new SqlParser(tokens);
    }
}