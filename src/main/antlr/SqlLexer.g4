lexer grammar SqlLexer;
options { caseInsensitive = true; }

SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
BETWEEN: 'BETWEEN';
LIKE: 'LIKE';
IN: 'IN';
AND: 'AND';
OR: 'OR';

LOGICAL_OPERATOR: AND | OR;

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
COMP_OPERATOR
    : '=' | '>' | '<' | '>=' | '<=' | '<>'
    ;

// Define the missing tokens for literals used in parser
SEMICOLON: ';';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';

NUMBER: '-'? [0-9]+ ('.' [0-9]+)?;
STRING: '\'' ~'\''* '\'';
ASTERIX: '*';




WS: [ \t\r\n]+ -> skip;