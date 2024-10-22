parser grammar SqlParser;
options {tokenVocab = SqlLexer;}

statement
    : select
    ; // TODO: insert, delete. e.c. Out of scope for this project

select
    :   SELECT selectElements
        FROM tableName
        (WHERE orExpression)?
        (orderByClause)?
        (limitClause)?
        (offsetClause)?
        ';'?
    ;

selectElements
    : ASTERIX
    | columnName (',' columnName)*;

columnName
    : IDENTIFIER ('.' IDENTIFIER)?;

tableName : IDENTIFIER;

logicalOperator: AND | OR;


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

//------------------ ORDER BY Clause ------------------

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