import sys
from antlr4 import *
from from_antlr.vypaLexer import vypaLexer
from from_antlr.vypaParser import vypaParser
from listener import customListener
from auxiliary import *
from listener import symbol_table


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = vypaLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = vypaParser(stream)
    tree = parser.program()

    printer = customListener()
    walker = ParseTreeWalker()
    try:
        walker.walk(printer, tree)
    except customException as e:
        print(e.what)
        symbol_table.dump()
        exit(e.err_code)
        
        

 
if __name__ == '__main__':
    main(sys.argv)