package com.ecwid;

import com.ecwid.query.Query;
import com.ecwid.query.condition.Condition;
import com.ecwid.sqlparser.SqlQueryService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WhereClauseTest {
    private final SqlQueryService sqlQueryService = new SqlQueryService();

    // Test for a simple WHERE clause with a comparison condition
    @Test
    public void shouldParseSimpleWhereClause() {
        String sql = "SELECT * FROM employees WHERE age > 30;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition whereCondition = query.getWhereComponent();
        assertNotNull(whereCondition, "WHERE condition should not be null");
        String conditionString = whereCondition.toString();
        assertEquals("age > 30", conditionString, "WHERE condition should be 'age > 30'");
    }

    // Test for WHERE clause with AND condition
    @Test
    public void shouldParseWhereClauseWithAndCondition() {
        String sql = "SELECT * FROM employees WHERE department = 'Sales' AND salary > 50000;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition whereCondition = query.getWhereComponent();
        assertNotNull(whereCondition, "WHERE condition should not be null");
        String conditionString = whereCondition.toString();
        assertEquals("(department = 'Sales' AND salary > 50000)", conditionString, "WHERE condition should be '(department = 'Sales' AND salary > 50000)'");
    }

    // Test for WHERE clause with OR condition
    @Test
    public void shouldParseWhereClauseWithOrCondition() {
        String sql = "SELECT * FROM employees WHERE position = 'Manager' OR salary > 80000;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition whereCondition = query.getWhereComponent();
        assertNotNull(whereCondition, "WHERE condition should not be null");
        String conditionString = whereCondition.toString();
        assertEquals("(position = 'Manager' OR salary > 80000)", conditionString, "WHERE condition should be '(position = 'Manager' OR salary > 80000)'");
    }

    // Test for WHERE clause with nested conditions
    @Test
    public void shouldParseWhereClauseWithNestedConditions() {
        String sql = "SELECT * FROM employees WHERE (age < 25 OR age > 60) AND status = 'Active';";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition whereCondition = query.getWhereComponent();
        assertNotNull(whereCondition, "WHERE condition should not be null");
        String conditionString = whereCondition.toString();
        assertEquals("((age < 25 OR age > 60) AND status = 'Active')", conditionString, "WHERE condition should be '((age < 25 OR age > 60) AND status = 'Active')'");
    }

    // Test for WHERE clause with NOT condition
    @Test
    public void shouldParseWhereClauseWithNotCondition() {
        String sql = "SELECT * FROM employees WHERE NOT department = 'HR';";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition whereCondition = query.getWhereComponent();
        assertNotNull(whereCondition, "WHERE condition should not be null");
        String conditionString = whereCondition.toString();
        assertEquals("NOT (department = 'HR')", conditionString, "WHERE condition should be 'NOT (department = 'HR')'");
    }

    // Test for WHERE clause with IS NULL condition
    @Test
    public void shouldParseWhereClauseWithIsNullCondition() {
        String sql = "SELECT * FROM employees WHERE manager_id IS NULL;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition whereCondition = query.getWhereComponent();
        assertNotNull(whereCondition, "WHERE condition should not be null");
        String conditionString = whereCondition.toString();
        assertEquals("manager_id IS NULL", conditionString, "WHERE condition should be 'manager_id IS NULL'");
    }

    // Test for WHERE clause with IS NOT NULL condition
    @Test
    public void shouldParseWhereClauseWithIsNotNullCondition() {
        String sql = "SELECT * FROM employees WHERE manager_id IS NOT NULL;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition whereCondition = query.getWhereComponent();
        assertNotNull(whereCondition, "WHERE condition should not be null");
        String conditionString = whereCondition.toString();
        assertEquals("manager_id IS NOT NULL", conditionString, "WHERE condition should be 'manager_id IS NOT NULL'");
    }

    // Test for WHERE clause with BETWEEN condition
    @Test
    public void shouldParseWhereClauseWithBetweenCondition() {
        String sql = "SELECT * FROM products WHERE price BETWEEN 50 AND 100;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition whereCondition = query.getWhereComponent();
        assertNotNull(whereCondition, "WHERE condition should not be null");
        String conditionString = whereCondition.toString();
        assertEquals("price BETWEEN 50 AND 100", conditionString, "WHERE condition should be 'price BETWEEN 50 AND 100'");
    }

    // Test for WHERE clause with IN condition
    @Test
    public void shouldParseWhereClauseWithInCondition() {
        String sql = "SELECT * FROM employees WHERE department IN ('Sales', 'Marketing', 'HR');";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition whereCondition = query.getWhereComponent();
        assertNotNull(whereCondition, "WHERE condition should not be null");
        String conditionString = whereCondition.toString();
        assertEquals("department IN ('Sales', 'Marketing', 'HR')", conditionString, "WHERE condition should be 'department IN ('Sales', 'Marketing', 'HR')'");
    }

    // Test for WHERE clause with LIKE condition
    @Test
    public void shouldParseWhereClauseWithLikeCondition() {
        String sql = "SELECT * FROM customers WHERE name LIKE 'A%';";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition whereCondition = query.getWhereComponent();
        assertNotNull(whereCondition, "WHERE condition should not be null");
        String conditionString = whereCondition.toString();
        assertEquals("name LIKE 'A%'", conditionString, "WHERE condition should be 'name LIKE 'A%''");
    }

    // Test for WHERE clause with complex conditions
    @Test
    public void shouldParseWhereClauseWithComplexConditions() {
        String sql = "SELECT * FROM orders WHERE (status = 'Pending' OR status = 'Processing') AND total > 100 AND customer_id IS NOT NULL;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        Condition whereCondition = query.getWhereComponent();
        assertNotNull(whereCondition, "WHERE condition should not be null");
        String conditionString = whereCondition.toString();
        assertEquals("(((status = 'Pending' OR status = 'Processing') AND total > 100) AND customer_id IS NOT NULL)", conditionString, "WHERE condition should be '((status = 'Pending' OR status = 'Processing') AND total > 100 AND customer_id IS NOT NULL)'");
    }
}