package com.ecwid;
//
import com.ecwid.antlrparser.SqlLexer;
import com.ecwid.antlrparser.SqlParser;
import com.ecwid.query.Query;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT CustomerName, LastName FROM Customer;";

        CharStream input = CharStreams.fromString(sql);
        SqlLexer lexer = new SqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlParser parser = new SqlParser(tokens);
        ParseTree tree = parser.selectStatement();
        // Print tree
         System.out.println(tree.toStringTree(parser));
        // Use the visitor to construct the Query object

        SqlQueryVisitor visitor = new SqlQueryVisitor();
//        Query query = visitor.visit(tree);
        Query query = visitor.visitSelectStatement((SqlParser.SelectStatementContext) tree);

        // Print the Query object
        System.out.println(query);
    }
}