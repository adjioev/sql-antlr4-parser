parser grammar SqlParser;
options {tokenVocab = SqlLexer;}

statement
    : select
    ; // TODO: insert, delete. e.c.

select
    : SELECT selectElements FROM tableName (WHERE orExpression)? ';'?
    ;

selectElements : ASTERIX | columnName (',' columnName)*;

//whereExpression : whereClauses (logicalOperator whereClauses)*;
//
//whereClauses
//    : whereClause (logicalOperator whereClause)*
//    | '(' whereExpression ')'  // Allow nesting of expressions inside parentheses
//    ;



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

whereClause
    : IDENTIFIER COMP_OPERATOR whereValue            # ComparisonCondition
    | IDENTIFIER LIKE whereValue                     # LikeCondition
    | IDENTIFIER BETWEEN whereValue AND whereValue   # BetweenCondition
    | IDENTIFIER IN '(' whereValueList ')'           # InCondition
    ;

whereValueList : whereValue (',' whereValue)*;

columnName : IDENTIFIER;

tableName : IDENTIFIER;

logicalOperator: AND | OR;
whereValue: NUMBER | IDENTIFIER | STRING;

// age > 30 AND (department = 'Sales' OR (status = 'Active' AND city = 'New York'));
// A AND (B OR (C AND D));

// WHERE logic: whereClause -> whereClauses -> whereExpression

//whereExpression : whereClauses (LOGICAL_OPERATOR whereClauses)*;
//
//whereClauses
//    : whereClause (LOGICAL_OPERATOR whereClause)*
//    | '(' whereExpression ')'  // Allow nesting of expressions inside parentheses
//    ;
