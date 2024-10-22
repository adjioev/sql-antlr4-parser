package com.ecwid;

import com.ecwid.query.Query;
import com.ecwid.sqlparser.SqlQueryService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqlQueryTest {
    private final SqlQueryService sqlQueryService = new SqlQueryService();

    @Test
    public void shouldReturnCorrectTableNameAndColumnsForSimpleSelectQuery() {
        String sql = "SELECT CustomerName, LastName, Company FROM Customer;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        assertEquals("Customer", query.getTableName(), "Table name should be 'Customer'");
        assertEquals(3, query.getColumns().size(), "There should be 3 columns");
        assertTrue(query.getColumns().contains("CustomerName"), "Query should contain 'CustomerName'");
        assertTrue(query.getColumns().contains("LastName"), "Query should contain 'LastName'");
        assertTrue(query.getColumns().contains("Company"), "Query should contain 'Company'");
    }

    @Test
    public void shouldIdentifyWhereClause() {
        String sql = "SELECT * FROM Users WHERE age > 30;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        assertEquals("Users", query.getTableName(), "Table name should be 'Users'");
        assertTrue(query.getColumns().contains("*"), "Query should contain '*' for all columns");
    }

    @Test
    public void shouldHandleAsteriskInSelectStatement() {
        String sql = "SELECT * FROM Customer;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        assertEquals("Customer", query.getTableName(), "Table name should be 'Customer'");
        assertTrue(query.getColumns().contains("*"), "Query should contain '*' for all columns");
    }

    // ORDER BY tests
    @Test
    public void shouldHandleOrderByClause() {
        String sql = "SELECT author.name, author.age FROM author ORDER BY column1, column2 DESC;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        assertEquals(2, query.getSort().getColumns().size(), "There should be 2 columns in the sort");
        assertTrue(query.getSort().getColumns().contains("column1"), "Sort should contain 'column1'");
        assertTrue(query.getSort().getColumns().contains("column2"), "Sort should contain 'column2'");
        assertEquals("DESC", query.getSort().getOrder().name(), "Sort order should be 'DESC'");
    }

    @Test
    public void shouldHandleMissingOrderParam() {
        String sql = "SELECT author.name, author.age FROM author ORDER BY column1;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        assertEquals(1, query.getSort().getColumns().size(), "There should be 1 column in the sort");
        assertTrue(query.getSort().getColumns().contains("column1"), "Sort should contain 'column1'");
        assertEquals("ASC", query.getSort().getOrder().name(), "Sort order should be 'ASC'");
    }

    // LIMIT and OFFSET tests
    @Test
    public void shouldHandleLimitAndOffset() {
        String sql = "SELECT author.name, author.age FROM author ORDER BY column1, column2 DESC LIMIT 10 OFFSET 20;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        assertEquals(10, query.getLimit(), "Limit should be 10");
        assertEquals(20, query.getOffset(), "Offset should be 20");
    }

}