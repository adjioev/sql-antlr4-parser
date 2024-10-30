package com.ecwid;

import com.ecwid.query.Query;
import com.ecwid.sqlparser.SqlQueryService;

public class Main {
    public static void main(String[] args) {
        // SQL query from the task with added WHERE clause

        String sql = """
                   SELECT author.name, COUNT(book.id), SUM(book.cost)
                   FROM author
                   LEFT JOIN book ON author.id = book.author_id
                   WHERE age > 30
                   GROUP BY author.name
                   HAVING COUNT(book.id) > 1 AND SUM(book.cost) > 500
                   LIMIT 10;
                """;
        // Use the SqlQueryService to get a Query object
        SqlQueryService sqlQueryService = new SqlQueryService();
        Query query = sqlQueryService.getQueryFromSql(sql);
        System.out.println(query);
    }
}