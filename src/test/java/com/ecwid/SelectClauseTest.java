package com.ecwid;

import com.ecwid.query.Query;
import com.ecwid.sqlparser.SqlQueryService;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SelectClauseTest {
    private final SqlQueryService sqlQueryService = new SqlQueryService();

    @Test
    public void shouldReturnCorrectSimpleColumns() {
        String sql = "SELECT CustomerName, LastName, Company FROM Customer;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        List<String> columns = query.getColumns();
        assertEquals(3, query.getColumns().size(), "There should be 3 columns");
        assertTrue(columns.contains("CustomerName"), "Query should contain 'CustomerName'");
        assertTrue(columns.contains("LastName"), "Query should contain 'LastName'");
        assertTrue(columns.contains("Company"), "Query should contain 'Company'");
    }

    @Test
    public void shouldIdentifyAsterixParamater() {
        String sql = "SELECT * FROM Customer;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        assertTrue(query.getColumns().contains("*"), "Query should contain '*' for all columns");
    }

    // ORDER BY tests
    @Test
    public void shouldReturnQualifiedColumnNames() {
        String sql = "SELECT author.name, author.age FROM author;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        assertEquals(2, query.getColumns().size(), "There should be 2 columns");
        assertTrue(query.getColumns().contains("author.name"), "Query should contain 'author.name'");
        assertTrue(query.getColumns().contains("author.age"), "Query should contain 'author.age'");
    }
}