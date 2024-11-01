package com.ecwid;

import com.ecwid.query.Query;
import com.ecwid.query.join.Join;
import com.ecwid.query.condition.JoinCondition;
import com.ecwid.sqlparser.SqlQueryService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SqlQueryTest {
    private final SqlQueryService sqlQueryService = new SqlQueryService();

    @Test
    public void shouldReturnCorrectTableNameAndColumnsForSimpleSelectQuery() {
        String sql = "SELECT CustomerName, LastName, Company FROM Customer;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        assertEquals("Customer", query.getTableName(), "Table name should be 'Customer'");
        List<String> columns = query.getColumns();
        assertEquals(3, query.getColumns().size(), "There should be 3 columns");
        assertTrue(columns.contains("CustomerName"), "Query should contain 'CustomerName'");
        assertTrue(columns.contains("LastName"), "Query should contain 'LastName'");
        assertTrue(columns.contains("Company"), "Query should contain 'Company'");
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

    // Joins tests

    @Test
    public void shouldHandleInnerJoin() {
        String sql = "SELECT Customer.CustomerName, Orders.OrderID FROM Customer INNER JOIN Orders ON Customer.CustomerID = Orders.CustomerID;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        List<Join> joins = query.getJoins();
//        JoinCondition joinCondition = joins.getFirst().getJoinCondition();
        JoinCondition joinCondition = joins.getFirst().getJoinCondition();

        assertEquals("Customer", query.getTableName(), "Table name should be 'Customer'");
        assertEquals(2, query.getColumns().size(), "There should be 2 columns");
        assertTrue(query.getColumns().contains("Customer.CustomerName"), "Query should contain 'Customer.CustomerName'");
        assertTrue(query.getColumns().contains("Orders.OrderID"), "Query should contain 'Orders.OrderID'");

        assertNotNull(joins, "There should be a join");
        assertEquals("Orders", joins.getFirst().getTableName(), "Joined table should be 'Orders'");
        assertEquals("INNERJOIN", joins.getFirst().getJoinType(), "Join type should be 'INNER'");

        assertEquals("=", joinCondition.operator(), "Join condition should match");
        assertEquals("Customer.CustomerID", joinCondition.leftCondition(), "Join condition should match");
        assertEquals("Orders.CustomerID", joinCondition.rightCondition(), "Join condition should match");
    }

    @Test
    public void shouldHandleLeftJoin() {
        String sql = "SELECT Customer.CustomerName, Orders.OrderID FROM Customer LEFT JOIN Orders ON Customer.CustomerID = Orders.CustomerID;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        List<Join> joins = query.getJoins();
        JoinCondition joinCondition = joins.getFirst().getJoinCondition();

        assertEquals("Customer", query.getTableName(), "Table name should be 'Customer'");
        assertEquals(2, query.getColumns().size(), "There should be 2 columns");
        assertTrue(query.getColumns().contains("Customer.CustomerName"), "Query should contain 'Customer.CustomerName'");
        assertTrue(query.getColumns().contains("Orders.OrderID"), "Query should contain 'Orders.OrderID'");

        assertNotNull(joins, "There should be a join");
        assertEquals("Orders", joins.getFirst().getTableName(), "Joined table should be 'Orders'");
        assertEquals("LEFTJOIN", joins.getFirst().getJoinType(), "Join type should be 'LEFT'");

        assertEquals("=", joinCondition.operator(), "Join condition should match");
        assertEquals("Customer.CustomerID", joinCondition.leftCondition(), "Join condition should match");
        assertEquals("Orders.CustomerID", joinCondition.rightCondition(), "Join condition should match");
    }

    @Test
    public void shouldHandleRightJoin() {
        String sql = "SELECT Customer.CustomerName, Orders.OrderID FROM Customer RIGHT JOIN Orders ON Customer.CustomerID = Orders.CustomerID;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        List<Join> joins = query.getJoins();
        JoinCondition joinCondition = joins.getFirst().getJoinCondition();

        assertEquals("Customer", query.getTableName(), "Table name should be 'Customer'");
        assertEquals(2, query.getColumns().size(), "There should be 2 columns");
        assertTrue(query.getColumns().contains("Customer.CustomerName"), "Query should contain 'Customer.CustomerName'");
        assertTrue(query.getColumns().contains("Orders.OrderID"), "Query should contain 'Orders.OrderID'");

        assertNotNull(joins, "There should be a join");
        assertEquals("Orders", joins.getFirst().getTableName(), "Joined table should be 'Orders'");
        assertEquals("RIGHTJOIN", joins.getFirst().getJoinType(), "Join type should be 'RIGHT'");

        assertEquals("=", joinCondition.operator(), "Join condition should match");
        assertEquals("Customer.CustomerID", joinCondition.leftCondition(), "Join condition should match");
        assertEquals("Orders.CustomerID", joinCondition.rightCondition(), "Join condition should match");
    }

    @Test
    public void shouldHandleFullJoin() {
        String sql = "SELECT Customer.CustomerName, Orders.OrderID FROM Customer FULL OUTER JOIN Orders ON Customer.CustomerID = Orders.CustomerID;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        List<Join> joins = query.getJoins();
        JoinCondition joinCondition = joins.getFirst().getJoinCondition();

        assertEquals("Customer", query.getTableName(), "Table name should be 'Customer'");
        assertEquals(2, query.getColumns().size(), "There should be 2 columns");
        assertTrue(query.getColumns().contains("Customer.CustomerName"), "Query should contain 'Customer.CustomerName'");
        assertTrue(query.getColumns().contains("Orders.OrderID"), "Query should contain 'Orders.OrderID'");

        assertNotNull(joins, "There should be a join");
        assertEquals("Orders", joins.getFirst().getTableName(), "Joined table should be 'Orders'");
        assertEquals("FULLOUTERJOIN", joins.getFirst().getJoinType(), "Join type should be 'FULL OUTER'");

        assertEquals("=", joinCondition.operator(), "Join condition should match");
        assertEquals("Customer.CustomerID", joinCondition.leftCondition(), "Join condition should match");
        assertEquals("Orders.CustomerID", joinCondition.rightCondition(), "Join condition should match");
    }

    @Test
    public void shouldHandleMultipleJoins() {
        String sql = "SELECT Customer.CustomerName, Orders.OrderID, Product.ProductName FROM Customer " +
                "INNER JOIN Orders ON Customer.CustomerID = Orders.CustomerID " +
                "LEFT JOIN Product ON Orders.ProductID = Product.ProductID;";
        Query query = sqlQueryService.getQueryFromSql(sql);
        List<Join> joins = query.getJoins();

        assertEquals("Customer", query.getTableName(), "Table name should be 'Customer'");
        assertEquals(3, query.getColumns().size(), "There should be 3 columns");
        assertTrue(query.getColumns().contains("Customer.CustomerName"), "Query should contain 'Customer.CustomerName'");
        assertTrue(query.getColumns().contains("Orders.OrderID"), "Query should contain 'Orders.OrderID'");
        assertTrue(query.getColumns().contains("Product.ProductName"), "Query should contain 'Product.ProductName'");

        assertNotNull(joins, "There should be joins");
        assertEquals(2, joins.size(), "There should be 2 joins");

        // Check first join (INNER JOIN)
        JoinCondition joinCondition1 = joins.getFirst().getJoinCondition();
        assertEquals("Orders", joins.getFirst().getTableName(), "First joined table should be 'Orders'");
        assertEquals("INNERJOIN", joins.getFirst().getJoinType(), "First join type should be 'INNER'");
        assertEquals("=", joinCondition1.operator(), "Join condition should match");
        assertEquals("Customer.CustomerID", joinCondition1.leftCondition(), "Join condition should match");
        assertEquals("Orders.CustomerID", joinCondition1.rightCondition(), "Join condition should match");

        // Check second join (LEFT JOIN)
        JoinCondition joinCondition2 = joins.get(1).getJoinCondition();
        assertEquals("Product", joins.get(1).getTableName(), "Second joined table should be 'Product'");
        assertEquals("LEFTJOIN", joins.get(1).getJoinType(), "Second join type should be 'LEFT'");
        assertEquals("=", joinCondition2.operator(), "Join condition should match");
        assertEquals("Orders.ProductID", joinCondition2.leftCondition(), "Join condition should match");
        assertEquals("Product.ProductID", joinCondition2.rightCondition(), "Join condition should match");
    }



}