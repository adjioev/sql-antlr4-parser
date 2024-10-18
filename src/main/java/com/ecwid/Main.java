package com.ecwid;

import com.ecwid.query.Query;
import com.ecwid.sqlparser.SqlQueryService;

public class Main {
    public static void main(String[] args) {
//        String sql = "SELECT * FROM Students WHERE age > 30";
        String sql = "SELECT name, age FROM users WHERE (age > 30 AND status = 'active') OR role = 'admin'";
//        String sql = "SELECT * FROM Customer;";

        // Use the SqlQueryService to get a Query object
        SqlQueryService sqlQueryService = new SqlQueryService();
        Query query = sqlQueryService.getQueryFromSql(sql);
        System.out.println(query);


//        WhereClause clause1 = new WhereClause("age", ">", 30);
//        WhereClause clause2 = new WhereClause("status", "=", "'active'");
//
//        WhereExpression whereExpression = new WhereExpression(
//                Arrays.asList(clause1, clause2),
//                Arrays.asList("AND")
//        );

        // Lombok will generate the toString() method
//        System.out.println(whereExpression);

    }
}