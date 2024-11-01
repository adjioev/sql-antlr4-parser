## Abstract (notes for reviewer)

This project is a SQL query parser that can parse a SQL query and represent it as a class.

There were several ways to implement this project, here some of them that I considered:
- Go nuts with regular expressions and try to parse the query manually. Bad idea - SQL is a complex language 
  and regular expressions are not powerful enough to parse it. It might be easy at first, but it we will end up with spaghetti code at the end.
- _JSqlParser_ is a SQL parser that can parse SQL queries and represent them as a class. It is a good choice for this kind of task, 
  but I guess it's what we have to crack in this project, so I considered it as a cheating.
- Use a parser generator like _ANTLR_ or _JavaCC_ to generate a parser for SQL queries. Looks like _ANTLR_ is the most popular choice for this kind of task, 
  _JavaCC_ is a bit older and less popular but might be a good choice too.

**Conclusion**: I picked _Antlr4_ to generate a parser for SQL queries. It is a powerful tool that can generate a parser for a wide range of languages. It used
in multiple Apache projects and has "enterprise" feel.  I guess this is the best balance for learning something **new** and **useful** and at the same time 
solving the task.

## About Project
- Java 21, Gradle, Antlr4
- Antlr grammar file is located in `src/main/antlr4/SqlQuery.g4`. To rebuild run _rebuildAntlr_ gradle task. It will rebuild lexer and parser help classes 
  into _/src/main/java/com/ecwid/antlrparser_ directory.
- Antlr uses visitor pattern to traverse the parse tree. Custom visitor classes can be found in /sr/main/java/com/ecwid/visitors directory.
- _/src/main/java/com/ecwid/query_ contains Query class that represents SQL query. 
- _/src/test directory contains tests for the parser with the vast amount of test cases for different SQL clauses.
- _Main.java_ class contains SQL from the task description and demonstrates how to use the parser. I also added "WHERE" clause to increase complexity.
- I haven't done much work on the error handling, let me know if you want me to add it.

## Code demo
```java
        String sql = """
           SELECT author.name, COUNT(book.id), SUM(book.cost)
           FROM author
           LEFT JOIN book ON author.id = book.author_id
           WHERE age > 30 OR age < 20
           GROUP BY author.name
           HAVING COUNT(book.id) > 1 AND SUM(book.cost) > 500
           LIMIT 10;
        """;

SqlQueryService sqlQueryService = new SqlQueryService();
Query query = sqlQueryService.getQueryFromSql(sql);
System.out.println(query);
```

Output for `System.out.println(query);`
```
Query{
    columns='author.name, COUNT(book.id), SUM(book.cost)',
    sources='author',
    joins='[LEFT JOIN book ON author.id = book.author_id]',
    Where='(age > 30 OR age < 20)',
    GroupBy='GroupBy{
    columns='[author.name]',
}',
    Having='(COUNT(book.id) > 1 AND SUM(book.cost) > 500)',
    Limit='10'
}
```


## Supported SQL constructs

### SELECT clause
- [x] SELECT * FROM table (asterisk)
- [x] SELECT field1, field2 FROM table (common fields)
- [x] SELECT field1 AS alias1, field2 AS alias2 FROM table (aliases)
- [x] SELECT field.* FROM table (fields with asterisk)
- [x] SELECT COUNT(field) FROM table (aggregate functions)
- [x] SELECT SUM(*) FROM table (aggregate functions with asterisk)

### FROM clause (source)
- [x] FROM table (single table)
- [x] FROM table1, table2 (multiple tables)
- [x] FROM (SELECT * FROM table) AS alias (subquery)

### WHERE clause
- [x] Comparison operators: =, <>, >, <, >=, <=
- [x] Logical operators: AND, OR, NOT and combinations
- [x] Parentheses for grouping conditions
- [x] IN operator
- [x] BETWEEN operator
- [x] LIKE operator
- [x] IS NULL operator
- [x] IS NOT NULL operator
- 
### JOINs
- [x] INNER, LEFT, RIGHT, FULL OUTER, CROSS, NATURAL Joins
- [ ] AND and OR conditions in JOIN clause (not done)
- [ ] USING clause (not done)

### GROUP BY clause
- [x] GROUP BY field1, field2 (single and multiple fields)
- [ ] Group by expressions (not done)
 
### HAVING clause
- [x] Aggregate functions in HAVING clause (COUNT, SUM, AVG, MIN, MAX)
- [x] Logical operators: AND, OR, NOT and combinations
- [x] Parentheses for grouping conditions
- [x] Comparison operators: =, <>, >, <, >=, <=
- [x] IN operator
- [x] BETWEEN operator
- [x] LIKE operator
- [x] IS NULL operator
- [x] IS NOT NULL operator

### ORDER BY clause
- [x] ORDER BY field1, field2 (single and multiple fields)

### LIMIT and OFFSET
- [x] LIMIT clause
- [x] OFFSET clause

#### Subqueries
- [x] SELECT * FROM (SELECT * FROM table) AS alias (subquery)

#### TODO:
- [ ] Support exceptions for invalid SQL queries (not done)


## SQL Query Parser min requirements: 
- [x] Enumeration of sample fields explicitly (with aliases) or *
- [x] Aggregation functions (count, sum, avg, min, max) for selected fields
- [x] Implicit join of several tables (select * from A,B,C)
- [x] Subqueries (select * from (select * from A) a_alias)
- [x] Explicit join of tables (inner, left, right, full join)
- [x] Filter conditions (where a = 1 and b > 100)
- [x] Grouping by one or several fields (group by)
- [x] Having clause 
- [x] Sorting by one or more fields (order by)
- [x] Selection truncation (limit, offset)

-------------------

# SQL Query Parser
SQL query parser

In SQL, the most syntactically complex and tricky query is probably the SELECT query. It has explicit and implicit joins, groupings,
subqueries, sorting and truncation of selects - all this beauty can occur repeatedly even in one single
select query.

For example, like this:
```sql
SELECT * FROM book
```
or like this:

```sql
SELECT author.name, count(book.id), sum(book.cost) 
FROM author 
LEFT JOIN book ON (author.id = book.author_id) 
GROUP BY author.name 
HAVING COUNT(*) > 1 AND SUM(book.cost) > 500
LIMIT 10;
```


### SQL Join examples
INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID;
LEFT JOIN table2 ON table1.column_name = table2.column_name;

Please write a parser for an arbitrary SELECT query, representing it as a class of approximately this structure:
```java
class Query {
	private List<String> columns;
	private List<Source> fromSources;
	private List<Join> joins;
	private List<WhereClause> whereClauses;
	private List<String> groupByColumns;
	private List<Sort> sortColumns;
	private Integer limit;
	private Integer offset;
}
```

The structure of this class is not a requirement, but a guide to action :)
If you have invented a class that reflects the SQL query structure better than the one given here - feel free to use your solution.

What constructs the parser must support in a mandatory way:
- Enumeration of sample fields explicitly (with aliases) or *
- Implicit join of several tables (select * from A,B,C)
- Explicit join of tables (inner, left, right, full join)
- Filter conditions (where a = 1 and b > 100)
- Subqueries (select * from (select * from A) a_alias)
- Grouping by one or several fields (group by)
- Sorting by one or more fields (order by)
- Selection truncation (limit, offset)

What can be ignored:
- Complementing selections (union and union all)
- CTE
- Window functions

Some details:
- The assignment should be done in Kotlin or Java (version 21 or higher).
- The assignment must have a working main() method, to demonstrate how it works
- If you have any questions, feel free to write to join-ecom@lightspeedhq.com.
- The completed assignment should be posted on GitHub