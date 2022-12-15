#
# Main compiler file
#
import sys
from antlr4 import *
from from_antlr.vypaLexer import vypaLexer
from from_antlr.vypaParser import vypaParser
from listener import customListener
from auxiliary import customException
from symboltable import symbolTable
from intermediatecode import interCode


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = vypaLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = vypaParser(stream)
    tree = parser.program()
    
    symbol_table = symbolTable()
    code_table = interCode()

    printer = customListener(symbol_table, code_table)
    walker = ParseTreeWalker()
    try:
        walker.walk(printer, tree)
    except customException as e:
        print(e.what)
        symbol_table.dump()
        exit(e.err_code)
    exit(0)
        
        
 
if __name__ == '__main__':
    main(sys.argv)