grammar Math;

//
// Parser
//

program
    : statements? EOF
    ;

calculation
    : expression EOF
    ;

// Statements

statements
    : statement (SEMI statement)* SEMI*
    ;

statement
    : defStatement
    | printStatement
    ;

defStatement
    : IDENTIFIER DEF expression
    ;

printStatement
    : PRINT expression
    ;

// Expressions
expression
    : sum
    | primary
    ;

sum
    : product (sumOp product)*
    ;

product
    : power (productOp power)*
    ;

power
    : primary (POW primary)*
    ;

primary
    : LPAREN expression RPAREN
    | numberOrVar
    ;

numberOrVar
    : number
    | IDENTIFIER
    ;

number
    : (PLUS | MINUS)* NUMBER
    ;


sumOp
    : PLUS
    | MINUS
    ;

productOp
    : TIMES
    | DIV
    | INT_DIV
    | REM
    ;

//
// Lexer
//

PLUS:           '+';
MINUS:          '-';
TIMES:          '*';
DIV:            '/';
POW:            '^';
INT_DIV:        '/I';
REM:            '/R';
EQ:             '=';
NEQ:            '!=';
DEF:            ':=';

SEMI:           ';';
LPAREN:         '(';
RPAREN:         ')';
LSQUARE:        '[';
RSQUARE:        ']';

PRINT:          'print';
SIN:            'sin';
COS:            'cos';
TAN:            'tan';
LOG:            'log';
LG:             'lg';
LN:             'ln';
EULER:          'e^';
PI:             'pi' | 'π';

NUMBER
    : Digits ('.' Digits)? Exponent?
    ;

fragment Exponent
    : [eE] [+-] Digits
    ;

fragment Digits
    : [0-9]+
    ;

IDENTIFIER
    : [a-zA-Z_]+
    ;

WHITESPACE
    : (' ' | NewLine)+ -> channel(HIDDEN)
    ;

COMMENT
    : '#' .*? (NewLine | EOF) -> channel(HIDDEN);

fragment NewLine
    : [\n\r\t]
    ;