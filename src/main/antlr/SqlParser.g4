parser grammar SqlParser;
options {tokenVocab = SqlLexer;}

statement
    : select
    ; // TODO: insert, delete. e.c. Out of scope for this project

select
    : SELECT selectElements
      FROM tableList
      (joinClause)*
      (WHERE orExpression)?
      (GROUPBY groupByClause)?
      (HAVING havingOrExpression)?
      (orderByClause)?
      (limitClause)?
      (offsetClause)?
      ';'?
    ;



// TODO: group clauses limited to columnName and table.columnName
groupColumn
    : IDENTIFIER                                   # GroupByColumnName
    | IDENTIFIER '.' IDENTIFIER                    # GroupByQualifiedColumnName
    ;


// SELECT items
selectElements
    : ASTERIX                                      # AsteriskSelect
    | selectElement (',' selectElement)*           # SelectList
    ;


selectElement
    : expression (AS? alias)?
    ;

alias: IDENTIFIER;

//TODO: extend for other types of expressions
expression
    : IDENTIFIER                                   # ColumnNameExpr
    | IDENTIFIER '.' IDENTIFIER                    # QualifiedColumnNameExpr
    | IDENTIFIER '.' ASTERIX                       # TableAsteriskExpr
    | functionCall                                  # FunctionCallExpr
    ;

// functions like COUNT, SUM, AVG, MAX, MIN
functionCall
    : aggregateFunction '(' (expression (',' expression)*)? ')'
    ;

// FROM Sources
tableList
    : tableElement (',' tableElement)*
    ;

tableElement
    : tableSource (AS? alias)? // (joinClause)* should be here
    ;

tableSource
    : tableName                                     # TableNameSource
    | '(' select ')'                                # SubquerySource
    ;

tableName
    : IDENTIFIER;




// ------------------ JOIN Clause ------------------
// Hiarchy - joinClause -> joinType -> tableName -> joinCondition
joinClause
    : joinType tableName ON joinCondition
    ;

joinType
    : INNER JOIN
    | LEFT JOIN
    | RIGHT JOIN
    | FULL  OUTER JOIN
    ;

joinCondition
    : joinElements COMP_OPERATOR joinElements
    ;

joinElements
    : selectElements (',' selectElements)*
    ;

//------------------GROUP BY Clause ------------------

groupByClause
    : groupColumn (',' groupColumn)*
    ;

//------------------HAVING Clause ------------------

havingOrExpression
    : havingOrExpression OR havingAndExpression        # HavingOrOperation
    | havingAndExpression                               # HavingAndExpressionInOr
    ;

// Handles AND operations
havingAndExpression
    : havingAndExpression AND havingUnaryExpression      # HavingAndOperation
    | havingUnaryExpression                              # HavingUnaryExpressionInAnd
    ;

// Handles NOT operations and primary expressions
havingUnaryExpression
    : NOT havingUnaryExpression                  # HavingNotOperation
    | havingPrimaryExpression                    # HavingPrimaryExpr
    ;

// Handles nested expressions and simple conditions
havingPrimaryExpression
    : '(' havingOrExpression ')'                 # HavingNestedExpr
    | havingClause                          # HavingSimpleCondition
    ;



havingColumn
    : IDENTIFIER                                   # HavingColumnName
    | IDENTIFIER '.' IDENTIFIER                    # HavingQualifiedColumnName
    ;

havingValue: NUMBER | IDENTIFIER | STRING;

// Simplest form of a condition for HAVING clause, like
// HAVING AGGREGATE_FUNCTION(column_name) OPERATOR value
havingClause
      : aggregateFunction'(' havingColumn ')' COMP_OPERATOR havingValue
      ;


// ------------------ WHERE Clause ------------------
// Just for fun, full-ish  implementation for SQL WHERE clause
// Hiarchy - orExpression -> andExpression -> unaryExpression -> primaryExpression -> whereClause
// SQL has OR -> AND -> NOT precedence. so we need to handle that in the grammar

// Handles OR operations
orExpression
    : orExpression OR andExpression        # OrOperation
    | andExpression                        # AndExpressionInOr
    ;

// Handles AND operations
andExpression
    : andExpression AND unaryExpression    # AndOperation
    | unaryExpression                      # UnaryExpressionInAnd
    ;

// Handles NOT operations and primary expressions
unaryExpression
    : NOT unaryExpression                  # NotOperation
    | primaryExpression                    # PrimaryExpr
    ;

// Handles nested expressions and simple conditions
primaryExpression
    : '(' orExpression ')'                 # NestedExpr
    | whereClause                          # SimpleCondition
    ;

// Simplest form of a condition, like
// column_name = value
// column_name LIKE value
// column_name BETWEEN value AND value
// column_name IN (value, value, ...)
// TODO: replace IDENTIFIER with columnName?
whereClause
    : IDENTIFIER COMP_OPERATOR whereValue            # ComparisonCondition
    | IDENTIFIER LIKE whereValue                     # LikeCondition
    | IDENTIFIER BETWEEN whereValue AND whereValue   # BetweenCondition
    | IDENTIFIER IN '(' whereValueList ')'           # InCondition
    ;

whereValue: NUMBER | IDENTIFIER | STRING;

whereValueList : whereValue (',' whereValue)*;

// ------------------------- ORDER BY Clause ------------------

orderByClause
    : ORDERBY orderColumn (',' orderColumn)* (order)?
    ;
orderColumn: IDENTIFIER;
order: ASC | DESC;

// ------------------ LIMIT and OFFSET Clause ------------------
limitClause
     : LIMIT NUMBER;

 offsetClause
     : OFFSET NUMBER;

// Common
aggregateFunction
    : COUNT
    | SUM
    | AVG
    | MIN
    | MAX
    ;

