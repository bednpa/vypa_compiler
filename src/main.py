#
# Task: Compiler for VYPlanguage
# Author(s): Pavel Bednar (xbedna73), Samuel Gajdos (xgajdo26)
# Description: Main compiler file.
#
import sys
from antlr4 import *
from from_antlr.vypaLexer import vypaLexer
from from_antlr.vypaParser import vypaParser
from antlr4.error.ErrorStrategy import BailErrorStrategy
from listener import customPreListener, customListener
from auxiliary import customException, SYNTAX_ERROR, SUCCESS
from symboltable import funcTable
from intermediatecode import interCode


#
# Main function.
#
def main(argv):
    try:
        input_stream = FileStream(argv[1]) 
    except Exception as e:
        print(e.args[1], argv[1], file=sys.stderr)
        exit(e.args[0])
    lexer = vypaLexer(input_stream) 
    stream = CommonTokenStream(lexer)
    
    parser = vypaParser(stream)
    parser._errHandler = BailErrorStrategy()
    try:
        tree = parser.program()
    except:
        exit(SYNTAX_ERROR)
    
    func_table = funcTable()
    code_table = interCode()

    printer = customPreListener(func_table)
    walker = ParseTreeWalker()
    try:
        walker.walk(printer, tree)
    except customException as e:
        print(e.what, file=sys.stderr)
        exit(e.err_code)
 
    printer = customListener(func_table, code_table)
    walker = ParseTreeWalker()
    try:
        walker.walk(printer, tree)
    except customException as e:
        print(e.what, file=sys.stderr)
        exit(e.err_code)
        
    exit(SUCCESS)
          

# Start of the program.
if __name__ == '__main__':
    main(sys.argv)