lexer grammar SqlLexer;

// TODO: compiler complains but option works just fine
options { caseInsensitive = true; }

SELECT: 'SELECT';
AS: 'AS';
FROM: 'FROM';
WHERE: 'WHERE';
BETWEEN: 'BETWEEN';
LIKE: 'LIKE';
IN: 'IN';
AND: 'AND';
OR: 'OR';
NOT: 'NOT';
LIMIT: 'LIMIT';
OFFSET: 'OFFSET';
ORDERBY: 'ORDER BY';
ASC: 'ASC';
DESC: 'DESC';

//Joins
JOIN: 'JOIN';
INNER: 'INNER';
LEFT: 'LEFT';
RIGHT: 'RIGHT';
FULL: 'FULL';
OUTER: 'OUTER';
ON: 'ON';


LOGICAL_OPERATOR: AND | OR;

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
COMP_OPERATOR
    : '=' | '>' | '<' | '>=' | '<=' | '<>'
    ;

// Define the missing tokens for literals used in parser
SEMICOLON: ';';
DOT: '.';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';

NUMBER: '-'? [0-9]+ ('.' [0-9]+)?;
STRING: '\'' ~'\''* '\'';
ASTERIX: '*';

WS: [ \t\r\n]+ -> skip;