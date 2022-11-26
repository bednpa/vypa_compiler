import sys
from antlr4 import *
from from_antlr.vypaLexer import vypaLexer
from from_antlr.vypaParser import vypaParser
 
def main(argv):
    input_stream = FileStream(argv[1])
    lexer = vypaLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = vypaParser(stream)
    tree = parser.program()
 
if __name__ == '__main__':
    main(sys.argv)