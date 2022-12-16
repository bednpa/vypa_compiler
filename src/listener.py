#
# Custom class for parse tree traversal.
#
from from_antlr.vypaListener import vypaListener
from from_antlr.vypaParser import vypaParser
from auxiliary import *


class customListener(vypaListener):
    # init
    def __init__(self, symbol_table, code_table):
        self.symbol_table = symbol_table
        self.code_table = code_table
        self.expr_check = exprChecker()
        
    
    # Enter a parse tree produced by vypaParser#program.
    def enterProgram(self, ctx:vypaParser.ProgramContext):
        pass

    # Exit a parse tree produced by vypaParser#program.
    def exitProgram(self, ctx:vypaParser.ProgramContext):
        #self.code_table.translate()
        pass


    # Enter a parse tree produced by vypaParser#class_definition.
    def enterClass_definition(self, ctx:vypaParser.Class_definitionContext):
        pass

    # Exit a parse tree produced by vypaParser#class_definition.
    def exitClass_definition(self, ctx:vypaParser.Class_definitionContext):
        pass


    # Enter a parse tree produced by vypaParser#definitions.
    def enterDefinitions(self, ctx:vypaParser.DefinitionsContext):
        pass

    # Exit a parse tree produced by vypaParser#definitions.
    def exitDefinitions(self, ctx:vypaParser.DefinitionsContext):
        pass


    # Enter a parse tree produced by vypaParser#function_definition.
    def enterFunction_definition(self, ctx:vypaParser.Function_definitionContext):
        """for s in ctx.statement():
            print(s.getText())
        name = ctx.ID().getText()
        params = ctx.param_list().getText()
        print(name, params)
        print(ctx.type_().getText())"""
        pass


    # Exit a parse tree produced by vypaParser#function_definition.
    def exitFunction_definition(self, ctx:vypaParser.Function_definitionContext):
        pass
    
    
    # Enter a parse tree produced by vypaParser#function_body.
    def enterFunction_body(self, ctx:vypaParser.Function_bodyContext):
        self.symbol_table.increaseNamespace()

    # Exit a parse tree produced by vypaParser#function_body.
    def exitFunction_body(self, ctx:vypaParser.Function_bodyContext):
        self.symbol_table.decreaseNamespace()


    # Enter a parse tree produced by vypaParser#param_list.
    def enterParam_list(self, ctx:vypaParser.Param_listContext):
        pass

    # Exit a parse tree produced by vypaParser#param_list.
    def exitParam_list(self, ctx:vypaParser.Param_listContext):
        pass


    # Enter a parse tree produced by vypaParser#type.
    def enterType(self, ctx:vypaParser.TypeContext):
        pass

    # Exit a parse tree produced by vypaParser#type.
    def exitType(self, ctx:vypaParser.TypeContext):
        pass


    # Enter a parse tree produced by vypaParser#data_type.
    def enterData_type(self, ctx:vypaParser.Data_typeContext):
        pass

    # Exit a parse tree produced by vypaParser#data_type.
    def exitData_type(self, ctx:vypaParser.Data_typeContext):
        pass


    # Enter a parse tree produced by vypaParser#prim_type.
    def enterPrim_type(self, ctx:vypaParser.Prim_typeContext):
        pass

    # Exit a parse tree produced by vypaParser#prim_type.
    def exitPrim_type(self, ctx:vypaParser.Prim_typeContext):
        pass


    # Enter a parse tree produced by vypaParser#statement.
    def enterStatement(self, ctx:vypaParser.StatementContext):
        pass


    # Exit a parse tree produced by vypaParser#statement.
    def exitStatement(self, ctx:vypaParser.StatementContext):
        pass


    # Enter a parse tree produced by vypaParser#stmt_local_vars.
    def enterStmt_local_vars(self, ctx:vypaParser.Stmt_local_varsContext):
        for name in ctx.ID():
            if (ctx.data_type().getText() == "int"):
                self.symbol_table.addSymbol(name.getText(), ctx.data_type().getText(), 0)
            elif (ctx.data_type().getText() == "string"):
                self.symbol_table.addSymbol(name.getText(), ctx.data_type().getText(), "")
            else:
                self.symbol_table.addSymbol(name.getText(), ctx.data_type().getText(), None)


    # Exit a parse tree produced by vypaParser#stmt_local_vars.
    def exitStmt_local_vars(self, ctx:vypaParser.Stmt_local_varsContext):
        pass


    # Enter a parse tree produced by vypaParser#stmt_assignment.
    def enterStmt_assignment(self, ctx:vypaParser.Stmt_assignmentContext):
        pass
        

    # Exit a parse tree produced by vypaParser#stmt_assignment.
    def exitStmt_assignment(self, ctx:vypaParser.Stmt_assignmentContext):
        type = self.expr_check.returnType()
        if (self.symbol_table.getSymbolType(ctx.ID().getText()) != type):
            raise typeError("=", self.symbol_table.getSymbolType(ctx.ID().getText()), type)


    # Enter a parse tree produced by vypaParser#stmt_while.
    def enterStmt_while(self, ctx:vypaParser.Stmt_whileContext):
        pass

    # Exit a parse tree produced by vypaParser#stmt_while.
    def exitStmt_while(self, ctx:vypaParser.Stmt_whileContext):
        pass


    # Enter a parse tree produced by vypaParser#stmt_func_call.
    def enterStmt_func_call(self, ctx:vypaParser.Stmt_func_callContext):
        pass

    # Exit a parse tree produced by vypaParser#stmt_func_call.
    def exitStmt_func_call(self, ctx:vypaParser.Stmt_func_callContext):
        pass


    # Enter a parse tree produced by vypaParser#stmt_method_call.
    def enterStmt_method_call(self, ctx:vypaParser.Stmt_method_callContext):
        pass

    # Exit a parse tree produced by vypaParser#stmt_method_call.
    def exitStmt_method_call(self, ctx:vypaParser.Stmt_method_callContext):
        pass


    # Enter a parse tree produced by vypaParser#stmt_if.
    def enterStmt_if(self, ctx:vypaParser.Stmt_ifContext):
        pass


    # Exit a parse tree produced by vypaParser#stmt_if.
    def exitStmt_if(self, ctx:vypaParser.Stmt_ifContext):
        pass
        
        
    # Enter a parse tree produced by vypaParser#if_header.
    def enterIf_header(self, ctx:vypaParser.If_headerContext):
        pass

    # Exit a parse tree produced by vypaParser#if_header.
    def exitIf_header(self, ctx:vypaParser.If_headerContext):
        type = self.expr_check.returnType()
        if (type != "int"):
            raise ifHeaderError(type)


    # Enter a parse tree produced by vypaParser#stmt_return.
    def enterStmt_return(self, ctx:vypaParser.Stmt_returnContext):
        pass

    # Exit a parse tree produced by vypaParser#stmt_return.
    def exitStmt_return(self, ctx:vypaParser.Stmt_returnContext):
        pass


    # Enter a parse tree produced by vypaParser#expression.
    def enterExpression(self, ctx:vypaParser.ExpressionContext):
        pass

    # Exit a parse tree produced by vypaParser#expression.
    def exitExpression(self, ctx:vypaParser.ExpressionContext):
        
        if ctx.ID():
            type = self.symbol_table.getSymbolType(ctx.getText())
            self.expr_check.addType(type)
            
            id = self.symbol_table.getSymbolID(ctx.getText())
            if (type == "string"):
                self.code_table.addCode("PUSHS", "id_" + str(id))
            elif (type == "int"):
                self.code_table.addCode("PUSHI", "id_" + str(id))
            
        elif ctx.INT_VAL():
            self.expr_check.addType("int")
            self.code_table.addCode("PUSHI", int(ctx.getText()))
            
        elif ctx.STRING_VAL():
            self.expr_check.addType("string")
            
        elif ctx.NOT():
            self.expr_check.addOp("NOT")
        
        elif ctx.MULT():
            self.expr_check.addOp("MULT")
            
        elif ctx.DIV():
            self.expr_check.addOp("DIV")
            
        elif ctx.ADD():
            self.expr_check.addOp("ADD")
            
        elif ctx.MINUS():
            self.expr_check.addOp("MINUS")
            
        #self.expr_check.addOp("ADD")
            
        elif ctx.AND():
            self.expr_check.addOp("AND")
            
        
        
        else:
            pass # add some error in the future
        



    # Enter a parse tree produced by vypaParser#casting.
    def enterCasting(self, ctx:vypaParser.CastingContext):
        pass

    # Exit a parse tree produced by vypaParser#casting.
    def exitCasting(self, ctx:vypaParser.CastingContext):
        pass