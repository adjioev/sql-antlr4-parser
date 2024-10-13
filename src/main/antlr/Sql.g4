grammar Sql;

@header {
    package com.ecwid.antlrparser;
}

selectStatement
    : SELECT selectElements FROM tableName ';'?
    ;

selectElements
    : columnName (',' columnName)*
    ;

columnName
    : IDENTIFIER
    ;

tableName
    : IDENTIFIER
    ;

SELECT: 'SELECT';
FROM: 'FROM';

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip;