grammar Sql;

statement
    : select
    ; // TODO: insert, delete. e.c.

select
    : SELECT selectElements FROM tableName ';'? ;

selectElements : ASTERIX | columnName (',' columnName)*;

columnName : IDENTIFIER;

tableName : IDENTIFIER;


// Lexer Rules
SELECT: 'SELECT';
FROM: 'FROM';

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: '-'? [0-9]+ ('.' [0-9]+)?;
STRING: '\'' ~'\''* '\'';
ASTERIX: '*';
WS: [ \t\r\n]+ -> skip;