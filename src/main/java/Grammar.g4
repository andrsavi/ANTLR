grammar Grammar;
// PARSER
// START RULE
//программа
program: BEGIN (decl | stmt) (SEMICOLON (decl | stmt))* END;
// описание
decl: idt (COMMA idt)* COLON var_type;
//тип переменных
var_type: (INT | REAL | BOOL);

// оператор
stmt: (BEGIN)* (stmt_ass | stmt_input | stmt_output | stmt_if | stmt_for | stmt_while) (END)*;


stmt_ass: idt ASS expr;
stmt_if: IF LPAR expr RPAR stmt (ELSE stmt)? END;
stmt_for: FOR stmt_ass TO expr (STEP expr)? stmt NEXT;
stmt_while: WHILE LPAR expr RPAR stmt END;
stmt_input: READLN idt (idt)* ;
stmt_output: WRITELN expr (expr)* ;
// EXPR
expr: LPAR expr RPAR #par_expr
| unary_op expr #unary_expr
| expr mul_op expr #mul_expr
| expr add_op expr #add_expr
| expr rel_op expr #rel_expr
| bool_value #bool_expr
| idt #idt_expr
| number #number_expr;

BOOL_VALUE: TRUE | FALSE;

idt: ID;
// VALUES
number: int_number| real_number;
int_number: INT_NUMBER;
real_number: REAL_NUMBER;
bool_value: BOOL_VALUE;
//RELATION OPERATIONS
rel_op: NE | EQ | LT | LE | GT | GE;
add_op: ADD | SUB | OR;
mul_op: MUL | DIV | AND;
unary_op: NOT;
// LEXER
// KEYWORDS
//PROGRAM:'program';
//VAR:'var';
BEGIN: 'begin';
END: 'end';
IF: 'if';
ELSE: 'else';
FOR: 'for';
TO: 'to';
STEP: 'step';
NEXT: 'next';
WHILE: 'while';
READLN:'reanln';
WRITELN:'writeln';
TRUE: 'true';
FALSE: 'false';

INT: 'integer';
REAL: 'real';
BOOL: 'boolean';
// RELATION OPERATIONS
NE : '!=' ;
EQ : '==' ;
LT : '<' ;
LE : '<=' ;
GT : '>' ;
GE : '>=' ;
// ADD
ADD : '+' ;
SUB : '-' ;
OR : 'or' ;
// MUL
MUL : '*' ;
DIV : '/' ;
AND : 'and' ;
// UNARY
NOT : 'not' ;
ID: LETTER (LETTER | DIGIT)*;
// CHARS
LETTER: ('a' .. 'z') | ('A' .. 'Z');
COMMA: ',';
COLON: ':';
SEMICOLON: ';';
DOT: '.';
LPAR: '(';
RPAR: ')';
LBR: '{';
RBR: '}';
//ASSIGNMENT
ASS: ':=';
// VALUES
REAL_NUMBER: DIGIT+ EXP| (DIGIT+)? DOT DIGIT+ EXP?;
EXP: EXP_LETTER (ADD | SUB)? DIGIT+;
INT_NUMBER: HEX_NUMBER | OCT_NUMBER | DEX_NUMBER | HEX_NUMBER;
BIN_NUMBER: BIN_DIGIT+ BIN_LETTER;
OCT_NUMBER: OCT_DIGIT+ OCT_LETTER;
DEX_NUMBER: DIGIT+ DEX_LETTER?;
HEX_NUMBER: DIGIT HEX_DIGIT* HEX_LETTER;
DIGIT: ('0' .. '9');
fragment BIN_DIGIT: ('0' .. '1');
fragment OCT_DIGIT: ('0' .. '7');
fragment HEX_DIGIT: ('a' .. 'f') | ('A' .. 'F') | DIGIT;
fragment BIN_LETTER: ('B' | 'b');
fragment OCT_LETTER: ('O' | 'o');
fragment HEX_LETTER: ('H' | 'h');
fragment DEX_LETTER: ('D' | 'd');
fragment EXP_LETTER: ('E' | 'e');
// SKIP
WS: [ \r\n\t]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;