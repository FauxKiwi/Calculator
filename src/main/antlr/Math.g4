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
    : (PLUS | MINUS)*
    ( LPAREN expression RPAREN
    | function
    | value
    ) postfix?
    ;

function
    : functionName primary
    ;

functionName
    : SIN
    | COS
    | TAN
    | log
    | LG
    | LN
    | EXP
    ;

log
    : LOG INDEX primary
    ;

postfix
    : deg=(DEGREES | 'deg')
    | rad='rad'
    | gra='gra'
    | PERCENT
    ;


value
    : NUMBER
    | constant
    | IDENTIFIER
    ;

constant
    : PI
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
INDEX:          '_';
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

DEGREES:        '°';
PERCENT:        '%';

PRINT:          'print';

SIN:            'sin';
COS:            'cos';
TAN:            'tan';
LOG:            'log';
LG:             'lg';
LN:             'ln';
EXP:            'e^';
PI:             'pi' | 'PI' | 'π';

//RESERVED:       'log';

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
    : [a-zA-Z]+
    ;

WHITESPACE
    : (' ' | NewLine)+ -> channel(HIDDEN)
    ;

COMMENT
    : '#' .*? (NewLine | EOF) -> channel(HIDDEN);

fragment NewLine
    : [\n\r\t]
    ;