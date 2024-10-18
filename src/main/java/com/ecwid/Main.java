package com.ecwid;

import com.ecwid.query.Query;
import com.ecwid.sqlparser.SqlQueryService;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT * FROM Students WHERE age > 30";
//        String sql = "SELECT * FROM Customer;";

        // Use the SqlQueryService to get a Query object
        SqlQueryService sqlQueryService = new SqlQueryService();
        Query query = sqlQueryService.getQueryFromSql(sql);
        System.out.println(query);


    }
}