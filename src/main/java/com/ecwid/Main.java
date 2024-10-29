package com.ecwid;

import com.ecwid.query.Query;
import com.ecwid.sqlparser.SqlQueryService;

public class Main {
    public static void main(String[] args) {
//        String sql = "SELECT * FROM Students WHERE age > 30";
//        String sql = "SELECT name, age FROM users WHERE (age > 30 AND status = 'active') OR role = 'admin'";
//        String sql = "SELECT * FROM employees WHERE age > 30 AND (department = 'Sales' OR (status = 'Active' AND city = 'New York'));";
//        String sql = "SELECT * FROM Customer;";


        String sql = "SELECT author.name, COUNT(book.id), SUM(book.cost) " +
                "FROM author " +
                "LEFT JOIN book ON author.id = book.author_id " +
                "WHERE age > 30 " + // what about author.age?
                "GROUP BY author.name " +
                "HAVING COUNT(book.id) > 1 AND SUM(book.cost) > 500 " +
                "LIMIT 10;";

//        String sql = "SELECT author.name, author.age FROM author ORDER BY column1, column2 DESC LIMIT 10 OFFSET 20;";

//        String sql = "SELECT author.name " +
//                "FROM author " +
//                "LEFT JOIN book ON author.id = book.author_id " +
//                "LEFT JOIN book ON author.id = book.author_id " +
//                "GROUP BY author.name " +
//                "HAVING COUNT(book.id) > 1 AND SUM(book.cost) > 500 " +
//                "LIMIT 10;";
//

//        String sql = "SELECT Customers AS c, Orders AS o FROM Customers, Orders;";
//        String sql = "SELECT * FROM (SELECT id, name FROM users WHERE active = 1) active_users;";
//        String sql = "SELECT * FROM col1, col2, col3, t;";
//        String sql = "SELECT *  FROM Customers;";

        // Use the SqlQueryService to get a Query object
        SqlQueryService sqlQueryService = new SqlQueryService();
        Query query = sqlQueryService.getQueryFromSql(sql);
        System.out.println(query);
    }
}