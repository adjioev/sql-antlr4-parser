package com.ecwid;

import com.ecwid.query.Query;
import com.ecwid.query.condition.Condition;
import com.ecwid.query.join.Join;
import com.ecwid.query.join.JoinType;
import com.ecwid.sqlparser.SqlQueryService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class JoinClauseTest {
    private final SqlQueryService sqlQueryService = new SqlQueryService();

    // Test for INNER JOIN
    @Test
    public void shouldParseInnerJoin() {
        String sql = "SELECT * FROM employees INNER JOIN departments ON employees.department_id = departments.id;";
        Query query = sqlQueryService.getQueryFromSql(sql);

        List<Join> joins = query.getJoins();
        assertNotNull(joins, "Joins should not be null");
        assertEquals(1, joins.size(), "There should be one join");

        Join join = joins.getFirst();
        assertEquals(JoinType.INNER, join.getJoinType(), "Join type should be INNER");
        assertEquals("departments", join.getTableName(), "Joined table should be 'departments'");

        Condition joinCondition = join.getJoinCondition();
        assertNotNull(joinCondition, "Join condition should not be null");
        String joinConditionStr = joinCondition.toString();
        assertEquals("employees.department_id = departments.id", joinConditionStr, "Join condition should be 'employees.department_id = departments.id'");
    }
    // Test for LEFT JOIN
    @Test
    public void shouldParseLeftJoin() {
        String sql = "SELECT * FROM orders LEFT JOIN customers ON orders.customer_id = customers.id;";
        Query query = sqlQueryService.getQueryFromSql(sql);

        List<Join> joins = query.getJoins();
        assertNotNull(joins, "Joins should not be null");
        assertEquals(1, joins.size(), "There should be one join");

        Join join = joins.get(0);
        assertEquals(JoinType.LEFT, join.getJoinType(), "Join type should be LEFT");
        assertEquals("customers", join.getTableName(), "Joined table should be 'customers'");
        String joinCondition = join.getJoinCondition().toString();
        assertEquals("orders.customer_id = customers.id", joinCondition, "Join condition should be 'orders.customer_id = customers.id'");
    }

    // Test for RIGHT JOIN
    @Test
    public void shouldParseRightJoin() {
        String sql = "SELECT * FROM orders RIGHT JOIN suppliers ON orders.supplier_id = suppliers.id;";
        Query query = sqlQueryService.getQueryFromSql(sql);

        List<Join> joins = query.getJoins();
        assertNotNull(joins, "Joins should not be null");
        assertEquals(1, joins.size(), "There should be one join");

        Join join = joins.get(0);
        assertEquals(JoinType.RIGHT, join.getJoinType(), "Join type should be RIGHT");
        assertEquals("suppliers", join.getTableName(), "Joined table should be 'suppliers'");
        String joinCondition = join.getJoinCondition().toString();
        assertEquals("orders.supplier_id = suppliers.id", joinCondition, "Join condition should be 'orders.supplier_id = suppliers.id'");
    }

    // Test for FULL OUTER JOIN
    @Test
    public void shouldParseFullOuterJoin() {
        String sql = "SELECT * FROM tableA FULL OUTER JOIN tableB ON tableA.id = tableB.a_id;";
        Query query = sqlQueryService.getQueryFromSql(sql);

        List<Join> joins = query.getJoins();
        assertNotNull(joins, "Joins should not be null");
        assertEquals(1, joins.size(), "There should be one join");

        Join join = joins.get(0);
        assertEquals(JoinType.FULL_OUTER, join.getJoinType(), "Join type should be FULL_OUTER");
        assertEquals("tableB", join.getTableName(), "Joined table should be 'tableB'");
        String joinCondition = join.getJoinCondition().toString();
        assertEquals("tableA.id = tableB.a_id", joinCondition, "Join condition should be 'tableA.id = tableB.a_id'");
    }

    // Test for multiple joins
    @Test
    public void shouldParseMultipleJoins() {
        String sql = "SELECT * FROM orders " +
                "INNER JOIN customers ON orders.customer_id = customers.id " +
                "LEFT JOIN shipments ON orders.id = shipments.order_id;";
        Query query = sqlQueryService.getQueryFromSql(sql);

        List<Join> joins = query.getJoins();
        assertNotNull(joins, "Joins should not be null");
        assertEquals(2, joins.size(), "There should be two joins");

        // First join
        Join firstJoin = joins.get(0);
        assertEquals(JoinType.INNER, firstJoin.getJoinType(), "First join type should be INNER");
        assertEquals("customers", firstJoin.getTableName(), "First joined table should be 'customers'");
        String firstJoinCondition = firstJoin.getJoinCondition().toString();
        assertEquals("orders.customer_id = customers.id", firstJoinCondition, "First join condition should be 'orders.customer_id = customers.id'");

        // Second join
        Join secondJoin = joins.get(1);
        assertEquals(JoinType.LEFT, secondJoin.getJoinType(), "Second join type should be LEFT");
        assertEquals("shipments", secondJoin.getTableName(), "Second joined table should be 'shipments'");
        String secondJoinCondition = secondJoin.getJoinCondition().toString();
        assertEquals("orders.id = shipments.order_id", secondJoinCondition, "Second join condition should be 'orders.id = shipments.order_id'");
    }

    // Test for CROSS JOIN
    @Test
    public void shouldParseCrossJoin() {
        String sql = "SELECT * FROM products CROSS JOIN categories;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        List<Join> joins = query.getJoins();
        assertNotNull(joins, "Joins should not be null");
        assertEquals(1, joins.size(), "There should be one join");
        Join join = joins.getFirst();
        assertEquals(JoinType.CROSS, join.getJoinType(), "Join type should be CROSS");
        assertEquals("categories", join.getTableName(), "Joined table should be 'categories'");
        assertNull(join.getJoinCondition(), "CROSS JOIN should not have an ON condition");
    }
    // Test for NATURAL JOIN
    @Test
    public void shouldParseNaturalJoin() {
        String sql = "SELECT * FROM employees NATURAL JOIN departments;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        List<Join> joins = query.getJoins();
        assertNotNull(joins, "Joins should not be null");
        assertEquals(1, joins.size(), "There should be one join");
        Join join = joins.getFirst();
        assertEquals(JoinType.NATURAL, join.getJoinType(), "Join type should be NATURAL");
        assertEquals("departments", join.getTableName(), "Joined table should be 'departments'");
        // NATURAL JOIN does not have an ON condition or USING clause
        assertNull(join.getJoinCondition(), "NATURAL JOIN should not have an ON condition");
    }
}