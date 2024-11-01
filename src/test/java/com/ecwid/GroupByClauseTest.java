package com.ecwid;

import com.ecwid.query.GroupBy;
import com.ecwid.query.Query;
import com.ecwid.sqlparser.SqlQueryService;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class GroupByClauseTest {
    private final SqlQueryService sqlQueryService = new SqlQueryService();

    // Test for simple GROUP BY clause with one column
    @Test
    public void shouldParseSimpleGroupByClause() {
        String sql = "SELECT department_id, COUNT(*) FROM employees GROUP BY department_id;";
        Query query = sqlQueryService.getQueryFromSql(sql);

        GroupBy groupBy = query.getGroupBy();
        assertNotNull(groupBy, "GROUP BY clause should not be null");

        List<String> groupByColumns = groupBy.getColumns();
        assertEquals(1, groupByColumns.size(), "There should be one column in GROUP BY");
        assertEquals("department_id", groupByColumns.getFirst(), "GROUP BY column should be 'department_id'");
    }

    // Test for GROUP BY clause with multiple columns
    @Test
    public void shouldParseGroupByClauseWithMultipleColumns() {
        String sql = "SELECT department_id, job_id, COUNT(*) FROM employees GROUP BY department_id, job_id;";
        Query query = sqlQueryService.getQueryFromSql(sql);

        GroupBy groupBy = query.getGroupBy();
        assertNotNull(groupBy, "GROUP BY clause should not be null");

        List<String> groupByColumns = groupBy.getColumns();
        assertEquals(2, groupByColumns.size(), "There should be two columns in GROUP BY");
        assertEquals("department_id", groupByColumns.get(0), "First GROUP BY column should be 'department_id'");
        assertEquals("job_id", groupByColumns.get(1), "Second GROUP BY column should be 'job_id'");
    }

    // Test for GROUP BY clause with alias (Note: Standard SQL does not allow aliases in GROUP BY)
    @Test
    public void shouldParseGroupByClauseWithAlias() {
        String sql = "SELECT department_id AS dept, COUNT(*) FROM employees GROUP BY dept;";
        Query query = sqlQueryService.getQueryFromSql(sql);

        GroupBy groupBy = query.getGroupBy();
        assertNotNull(groupBy, "GROUP BY clause should not be null");

        List<String> groupByColumns = groupBy.getColumns();
        assertEquals(1, groupByColumns.size(), "There should be one column in GROUP BY");
        assertEquals("dept", groupByColumns.getFirst(), "GROUP BY column should be 'dept'");
    }

    // Test for GROUP BY clause with HAVING clause
    @Test
    public void shouldParseGroupByClauseWithHaving() {
        String sql = "SELECT department_id, COUNT(*) FROM employees GROUP BY department_id HAVING COUNT(*) > 5;";
        Query query = sqlQueryService.getQueryFromSql(sql);

        // Verify GROUP BY
        GroupBy groupBy = query.getGroupBy();
        assertNotNull(groupBy, "GROUP BY clause should not be null");
        List<String> groupByColumns = groupBy.getColumns();
        assertEquals(1, groupByColumns.size(), "There should be one column in GROUP BY");
        assertEquals("department_id", groupByColumns.getFirst(), "GROUP BY column should be 'department_id'");

        // Verify HAVING clause (though focus is on GROUP BY)
        assertNotNull(query.getHavingComponent(), "HAVING clause should not be null");
    }

    // Test for GROUP BY clause with ORDER BY
    @Test
    public void shouldParseGroupByClauseWithOrderBy() {
        String sql = "SELECT department_id, COUNT(*) FROM employees GROUP BY department_id ORDER BY COUNT(*) DESC;";
        Query query = sqlQueryService.getQueryFromSql(sql);

        // Verify GROUP BY
        GroupBy groupBy = query.getGroupBy();
        assertNotNull(groupBy, "GROUP BY clause should not be null");
        List<String> groupByColumns = groupBy.getColumns();
        assertEquals(1, groupByColumns.size(), "There should be one column in GROUP BY");
        assertEquals("department_id", groupByColumns.getFirst(), "GROUP BY column should be 'department_id'");

        // Verify ORDER BY clause (though focus is on GROUP BY)
        assertNotNull(query.getSort(), "ORDER BY clause should not be null");
    }

    // Test for GROUP BY clause with WHERE clause
    @Test
    public void shouldParseGroupByClauseWithWhere() {
        String sql = "SELECT department_id, COUNT(*) FROM employees WHERE salary > 50000 GROUP BY department_id;";
        Query query = sqlQueryService.getQueryFromSql(sql);

        // Verify GROUP BY
        GroupBy groupBy = query.getGroupBy();
        assertNotNull(groupBy, "GROUP BY clause should not be null");
        List<String> groupByColumns = groupBy.getColumns();
        assertEquals(1, groupByColumns.size(), "There should be one column in GROUP BY");
        assertEquals("department_id", groupByColumns.getFirst(), "GROUP BY column should be 'department_id'");

        // Verify WHERE clause (though focus is on GROUP BY)
        assertNotNull(query.getWhereComponent(), "WHERE clause should not be null");
    }

    // Test for GROUP BY clause with aggregate functions in SELECT
    @Test
    public void shouldParseGroupByClauseWithAggregateFunctions() {
        String sql = "SELECT department_id, AVG(salary), MAX(salary), MIN(salary) FROM employees GROUP BY department_id;";
        Query query = sqlQueryService.getQueryFromSql(sql);

        // Verify GROUP BY
        GroupBy groupBy = query.getGroupBy();
        assertNotNull(groupBy, "GROUP BY clause should not be null");
        List<String> groupByColumns = groupBy.getColumns();
        assertEquals(1, groupByColumns.size(), "There should be one column in GROUP BY");
        assertEquals("department_id", groupByColumns.getFirst(), "GROUP BY column should be 'department_id'");
    }
}