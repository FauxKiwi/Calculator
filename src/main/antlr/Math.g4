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
    | functionDeclaration
    | printStatement
    ;

defStatement
    : IDENTIFIER DEF expression
    ;

printStatement
    : PRINT expression
    ;

functionDeclaration
    : IDENTIFIER
    ( LPAREN formalParameters RPAREN EQ
    | COLON formalParameters ARROW
    ) expression
    ;

formalParameters
    : IDENTIFIER (COMMA IDENTIFIER)*
    ;

// Expressions
expression
    : sum
    | primary
    ;

sum
    : dotProduct (sumOp dotProduct)*
    ;

dotProduct
    : product (dot=('dot' | DOT) product)?
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
    | IDENTIFIER LPAREN parameters RPAREN
    ;

parameters
    : expression (COMMA expression)*
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
    | PERMILLE
    ;


value
    : NUMBER
    | vector
    | constant
    | IDENTIFIER
    ;

vector
    : LSQUARE primary (COMMA primary)* RSQUARE
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
    ;

//
// Lexer
//

PLUS:           '+';
MINUS:          '-';
TIMES:          '*' | '×';
DIV:            '/' | '÷';
POW:            '^';
INDEX:          '_';
EQ:             '=';
NEQ:            '!=';
DEF:            ':=';
COLON:          ':';
ARROW:          '->' | '|->';
COMMA:          ',';
DOT:            '·';

SEMI:           ';';
LPAREN:         '(';
RPAREN:         ')';
LSQUARE:        '[';
RSQUARE:        ']';

DEGREES:        '°';
PERCENT:        '%';
PERMILLE:       '%%' | '‰';

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