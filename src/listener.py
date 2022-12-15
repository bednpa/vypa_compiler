from from_antlr.vypaListener import vypaListener
from from_antlr.vypaParser import vypaParser
from symboltable import symbolTable


symbol_table = symbolTable() # maybe move to another file


class customListener(vypaListener):
    # init
    def __init__(self):
        pass
    
    # Enter a parse tree produced by vypaParser#program.
    def enterProgram(self, ctx:vypaParser.ProgramContext):
        pass

    # Exit a parse tree produced by vypaParser#program.
    def exitProgram(self, ctx:vypaParser.ProgramContext):
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
            symbol_table.addSymbol(name.getText(), ctx.data_type().getText(), None)


    # Exit a parse tree produced by vypaParser#stmt_local_vars.
    def exitStmt_local_vars(self, ctx:vypaParser.Stmt_local_varsContext):
        pass


    # Enter a parse tree produced by vypaParser#stmt_assignment.
    def enterStmt_assignment(self, ctx:vypaParser.Stmt_assignmentContext):
        symbol_table.updateSymbol(ctx.ID().getText(), 1)
        

    # Exit a parse tree produced by vypaParser#stmt_assignment.
    def exitStmt_assignment(self, ctx:vypaParser.Stmt_assignmentContext):
        pass


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
        pass


    # Enter a parse tree produced by vypaParser#casting.
    def enterCasting(self, ctx:vypaParser.CastingContext):
        pass

    # Exit a parse tree produced by vypaParser#casting.
    def exitCasting(self, ctx:vypaParser.CastingContext):
        pass