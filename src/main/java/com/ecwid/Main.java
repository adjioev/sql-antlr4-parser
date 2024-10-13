package com.ecwid;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT CustomerName, LastName FROM Customer;";
//
//        CharStream input = CharStreams.fromString(sql);
//        SqlLexer lexer = new SqlLexer(input);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        SqlParser parser = new SqlParser(tokens);
//        ParseTree tree = parser.selectStatement();
//
//        System.out.println(tree.toStringTree(parser));
    }
}