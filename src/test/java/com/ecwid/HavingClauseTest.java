package com.ecwid;

import com.ecwid.query.Query;
import com.ecwid.query.condition.Condition;
import com.ecwid.sqlparser.SqlQueryService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HavingClauseTest {
    private final SqlQueryService sqlQueryService = new SqlQueryService();

    // Test for a simple HAVING clause with an aggregate function
    @Test
    public void shouldParseSimpleHavingClause() {
        String sql = "SELECT department_id FROM employees GROUP BY department_id HAVING COUNT(*) > 5;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition havingCondition = query.getHavingComponent();
        assertNotNull(havingCondition, "HAVING condition should not be null");
        String conditionString = havingCondition.toString();
        assertEquals("COUNT(*) > 5", conditionString, "HAVING condition should be 'COUNT(*) > 5'");
    }

    // Test for HAVING clause with AND condition
    @Test
    public void shouldParseHavingClauseWithAndCondition() {
        String sql = "SELECT department_id FROM employees GROUP BY department_id HAVING AVG(salary) > 50000 AND COUNT(*) > 10;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition havingCondition = query.getHavingComponent();
        assertNotNull(havingCondition, "HAVING condition should not be null");
        String conditionString = havingCondition.toString();
        assertEquals("(AVG(salary) > 50000 AND COUNT(*) > 10)", conditionString, "HAVING condition should be '(AVG(salary) > 50000 AND COUNT(*) > 10)'");
    }

    // Test for HAVING clause with OR condition
    @Test
    public void shouldParseHavingClauseWithOrCondition() {
        String sql = "SELECT department_id FROM employees GROUP BY department_id HAVING SUM(sales) > 100000 OR COUNT(*) > 50;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition havingCondition = query.getHavingComponent();
        assertNotNull(havingCondition, "HAVING condition should not be null");
        String conditionString = havingCondition.toString();
        assertEquals("(SUM(sales) > 100000 OR COUNT(*) > 50)", conditionString, "HAVING condition should be '(SUM(sales) > 100000 OR COUNT(*) > 50)'");
    }

    // Test for HAVING clause with nested conditions
    @Test
    public void shouldParseHavingClauseWithNestedConditions() {
        String sql = "SELECT department_id FROM employees GROUP BY department_id HAVING (MIN(salary) < 30000 OR MIN(salary) > 70000) AND COUNT(*) > 5;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition havingCondition = query.getHavingComponent();
        assertNotNull(havingCondition, "HAVING condition should not be null");
        String conditionString = havingCondition.toString();
        assertEquals("((MIN(salary) < 30000 OR MIN(salary) > 70000) AND COUNT(*) > 5)", conditionString, "HAVING condition should be '((MIN(salary) < 30000 OR MIN(salary) > 70000) AND COUNT(*) > 5)'");
    }

    // Test for HAVING clause with NOT condition
    @Test
    public void shouldParseHavingClauseWithNotCondition() {
        String sql = "SELECT department_id FROM employees GROUP BY department_id HAVING AVG(salary) IS NOT NULL;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition havingCondition = query.getHavingComponent();
        assertNotNull(havingCondition, "HAVING condition should not be null");
        String conditionString = havingCondition.toString();
        assertEquals("AVG(salary) IS NOT NULL", conditionString, "HAVING condition should be 'AVG(salary) IS NOT NULL'");
    }

    // Test for HAVING clause using aggregate functions with aliases
    @Test
    public void shouldParseHavingClauseWithAggregateFunctionAlias() {
        String sql = "SELECT department_id, SUM(sales) AS total_sales FROM sales_data GROUP BY department_id HAVING SUM(sales) > 50000;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition havingCondition = query.getHavingComponent();
        assertNotNull(havingCondition, "HAVING condition should not be null");
        String conditionString = havingCondition.toString();
        assertEquals("SUM(sales) > 50000", conditionString, "HAVING condition should be 'SUM(sales) > 50000'");
    }

    // Test for HAVING clause with IS NULL condition
    @Test
    public void shouldParseHavingClauseWithIsNullCondition() {
        String sql = "SELECT department_id FROM employees GROUP BY department_id HAVING AVG(salary) IS NULL;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition havingCondition = query.getHavingComponent();
        assertNotNull(havingCondition, "HAVING condition should not be null");
        String conditionString = havingCondition.toString();
        assertEquals("AVG(salary) IS NULL", conditionString, "HAVING condition should be 'AVG(salary) IS NULL'");
    }
}