package com.ecwid;

import com.ecwid.query.Query;
import com.ecwid.sqlparser.SqlQueryService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqlQueryTest {
    private final SqlQueryService sqlQueryService = new SqlQueryService();

    @Test
    public void testSimpleSelectQuery() {
        String sql = "SELECT CustomerName, LastName, Company FROM Customer;";
        Query query = sqlQueryService.getQueryFromSql(sql);

        assertEquals("Customer", query.getTableName());
        assertEquals(3, query.getColumns().size());
        assertTrue(query.getColumns().contains("CustomerName"));
        assertTrue(query.getColumns().contains("LastName"));
        assertTrue(query.getColumns().contains("Company"));
    }

}