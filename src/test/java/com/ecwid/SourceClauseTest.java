package com.ecwid;

import com.ecwid.query.Query;
import com.ecwid.query.source.SourceList;
import com.ecwid.query.source.SubquerySource;
import com.ecwid.sqlparser.SqlQueryService;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SourceClauseTest {
    private final SqlQueryService sqlQueryService = new SqlQueryService();

    @Test
    public void shouldReturnSimpleSource() {
        String sql = "SELECT CustomerName, LastName, Company FROM Customer;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        assertEquals("Customer", query.getSourceComponent().toString(), "Source should be 'Customer'");
    }

    @Test
    public void shouldReturnQualifiedSource() {
        String sql = "SELECT author.name, author.age FROM author;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        assertEquals("author", query.getSourceComponent().toString(), "Source should be 'author'");
    }

    @Test
    public void shouldReturnAliasSource() {
        String sql = "SELECT author.name, author.age FROM author AS a;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        assertEquals("author AS a", query.getSourceComponent().toString(), "Source should be 'author AS a'");
    }

    @Test
    public void shouldHandleSubquerySource() {
        String sql = "SELECT * FROM (SELECT field1, field2, field3 FROM author) AS a;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        SourceList sourceList = (SourceList) query.getSourceComponent();
        SubquerySource subQuerySource = (SubquerySource) sourceList.getSources().getFirst();
        Query subQuery = subQuerySource.getSubquery();
        List<String> columns = subQuery.getColumns();
        assertEquals(3, columns.size(), "There should be 3 columns");
        assertTrue(columns.contains("field1"), "Subquery should contain 'field1'");
        assertTrue(columns.contains("field2"), "Subquery should contain 'field2'");
        assertTrue(columns.contains("field3"), "Subquery should contain 'field3'");
        assertEquals("a", subQuerySource.getAlias(), "Alias should be 'a'");
    }
}