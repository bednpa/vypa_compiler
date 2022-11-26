grammar vypa;	

/* Rules */

program: (function_definition | class_definition)+
       ;

/* Class definition */

class_definition: CLASS ID COLON ID LEFT_PARANTHESES_SHARP (definitions)* RIGHT_PARANTHESES_SHARP
                ;

definitions: stmt_local_vars /* var def*/
           | function_definition /* pozor na this a super, i v expr v metode ! */
           ; 

/* Function definition */

function_definition: type ID LEFT_PARANTHESES_SMOOTH (param_list | VOID) RIGHT_PARANTHESES_SMOOTH
                     LEFT_PARANTHESES_SHARP (statement)* RIGHT_PARANTHESES_SHARP
                   ;

param_list: data_type ID (COMMA data_type ID)*
          ;

type: data_type 
    | VOID
    ;

data_type: prim_type
         | ID
         ;

prim_type: INT_TYPE
         | STRING_TYPE
         ;

/* Statements */

statement: stmt_local_vars
         | stmt_assignment
         | stmt_if
         | stmt_while
         | stmt_func_call
         | stmt_method_call
         | stmt_return
         ;

stmt_local_vars: data_type ID (COMMA ID)* SEMICOLON
               ;

stmt_assignment: ID ASSIGN expression SEMICOLON
               ;

stmt_while: WHILE LEFT_PARANTHESES_SMOOTH expression RIGHT_PARANTHESES_SMOOTH
            LEFT_PARANTHESES_SHARP (statement)* RIGHT_PARANTHESES_SHARP
          ;

stmt_func_call: ID LEFT_PARANTHESES_SMOOTH (expression (COMMA expression)*)? RIGHT_PARANTHESES_SMOOTH SEMICOLON
              ;

stmt_method_call: (THIS | SUPER | ID) DOT ID LEFT_PARANTHESES_SMOOTH (expression (COMMA expression)*)? RIGHT_PARANTHESES_SMOOTH SEMICOLON /* prvni nevim jestli id jen ! */
                ;

stmt_if: IF LEFT_PARANTHESES_SMOOTH expression RIGHT_PARANTHESES_SMOOTH
         LEFT_PARANTHESES_SHARP (statement)* RIGHT_PARANTHESES_SHARP 
         ELSE LEFT_PARANTHESES_SHARP (statement)* RIGHT_PARANTHESES_SHARP
       ;

stmt_return: RETURN (expression)? SEMICOLON
           ;

/* Expressions */

expression: LEFT_PARANTHESES_SMOOTH expression RIGHT_PARANTHESES_SMOOTH
          | NEW ID
          | (casting | stmt_func_call)
          | (stmt_method_call | (THIS | SUPER | ID) DOT ID)
          | NOT expression
          | expression (MULT | DIV) expression
          | expression ADD expression
          | expression MINUS expression
          | expression (LESS | LOE | GREATER | GOE) expression
          | expression (EQ | NEQ)
          | expression AND expression
          | expression OR expression
          | (INT_VAL | STRING_VAL | ID)
          ;

casting: LEFT_PARANTHESES_SMOOTH data_type RIGHT_PARANTHESES_SMOOTH expression
       ;

/* Tokens */

LEFT_PARANTHESES_SMOOTH: '(';
RIGHT_PARANTHESES_SMOOTH: ')';
LEFT_PARANTHESES_SHARP: '{';
RIGHT_PARANTHESES_SHARP: '}';
COMMA: ',';
COLON: ':';
SEMICOLON: ';';
DOT: '.';
ASSIGN: '=';
NOT: '!';
MULT: '*';
DIV: '/';
ADD: '+';
MINUS: '-';
LESS: '<';
LOE: '<=';
GREATER: '>';
GOE: '>=';
EQ: '==';
NEQ: '!=';
AND: '&&';
OR: '||';

CLASS: 'class';
ELSE: 'else';
IF: 'if';
INT_TYPE: 'int';
NEW: 'new';
RETURN: 'return';
STRING_TYPE: 'string';
SUPER: 'super';
THIS: 'this';
VOID: 'void';
WHILE: 'while';

ID: (ANY_LETTER | UNDERSCORE) (ANY_LETTER | UNDERSCORE | ANY_NUMBER)*;
INT_VAL: ('0' | MINUS POSITIVE_DIGIT | POSITIVE_DIGIT );
STRING_VAL: STRING_ENCLOSING (PRINTABLE_CHARACTER | ESCAPE_SEQUENCE)* STRING_ENCLOSING;

/* Symbols to ignore */

BLOCK_COMMENT: BLOCK_COMMENT_STARTS .*? BLOCK_COMMENT_ENDS -> skip;
LINE_COMMENT: FRONT_SLASH ~[\r\n]* -> skip;
WHITE_SPACE: (SPACE | END_OF_LINE | TAB)+ -> skip;

/* Auxiliary nontrivial symbols */

fragment POSITIVE_DIGIT: [1-9][0-9]*;
fragment PRINTABLE_CHARACTER: ~["]; /* idealne toto [^\x22\x00-\x1f] ale unicode */
fragment ESCAPE_SEQUENCE: (END_OF_LINE | TAB | BACK_SLASH | DOUBLE_QUOTES);

/* Auxiliary trivial symbols */

fragment ANY_LETTER: [a-zA-Z];
fragment ANY_NUMBER: [0-9];
fragment END_OF_LINE: '\n';
fragment TAB: '\t';
fragment BACK_SLASH: '\\';
fragment FRONT_SLASH: '//';
fragment DOUBLE_QUOTES: '\\"'; /* tady chci znak \" ! */
fragment BLOCK_COMMENT_STARTS: '/*';
fragment BLOCK_COMMENT_ENDS: '*/';
fragment STRING_ENCLOSING: '"';
fragment SPACE: ' ';
fragment UNDERSCORE: '_';
