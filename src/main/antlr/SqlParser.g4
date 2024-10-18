parser grammar SqlParser;
options {tokenVocab = SqlLexer;}

statement
    : select
    ; // TODO: insert, delete. e.c.

select
    : SELECT selectElements FROM tableName (WHERE whereExpression)? ';'?
    ;

selectElements : ASTERIX | columnName (',' columnName)*;

whereExpression : whereClauses (logicalOperator whereClauses)*;

whereClauses
    : whereClause (logicalOperator whereClause)*
    | '(' whereExpression ')'  // Allow nesting of expressions inside parentheses
    ;

whereClause : IDENTIFIER COMP_OPERATOR value;

columnName : IDENTIFIER;

tableName : IDENTIFIER;

logicalOperator: AND | OR;
value: NUMBER | IDENTIFIER | STRING;



// WHERE logic: whereClause -> whereClauses -> whereExpression

//whereExpression : whereClauses (LOGICAL_OPERATOR whereClauses)*;
//
//whereClauses
//    : whereClause (LOGICAL_OPERATOR whereClause)*
//    | '(' whereExpression ')'  // Allow nesting of expressions inside parentheses
//    ;
