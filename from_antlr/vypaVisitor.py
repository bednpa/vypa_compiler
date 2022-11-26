# Generated from vypa.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .vypaParser import vypaParser
else:
    from vypaParser import vypaParser

# This class defines a complete generic visitor for a parse tree produced by vypaParser.

class vypaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by vypaParser#program.
    def visitProgram(self, ctx:vypaParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#class_definition.
    def visitClass_definition(self, ctx:vypaParser.Class_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#definitions.
    def visitDefinitions(self, ctx:vypaParser.DefinitionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#function_definition.
    def visitFunction_definition(self, ctx:vypaParser.Function_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#param_list.
    def visitParam_list(self, ctx:vypaParser.Param_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#type.
    def visitType(self, ctx:vypaParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#data_type.
    def visitData_type(self, ctx:vypaParser.Data_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#prim_type.
    def visitPrim_type(self, ctx:vypaParser.Prim_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#statement.
    def visitStatement(self, ctx:vypaParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#stmt_local_vars.
    def visitStmt_local_vars(self, ctx:vypaParser.Stmt_local_varsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#stmt_assignment.
    def visitStmt_assignment(self, ctx:vypaParser.Stmt_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#stmt_while.
    def visitStmt_while(self, ctx:vypaParser.Stmt_whileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#stmt_func_call.
    def visitStmt_func_call(self, ctx:vypaParser.Stmt_func_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#stmt_method_call.
    def visitStmt_method_call(self, ctx:vypaParser.Stmt_method_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#stmt_if.
    def visitStmt_if(self, ctx:vypaParser.Stmt_ifContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#stmt_return.
    def visitStmt_return(self, ctx:vypaParser.Stmt_returnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#expression.
    def visitExpression(self, ctx:vypaParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by vypaParser#casting.
    def visitCasting(self, ctx:vypaParser.CastingContext):
        return self.visitChildren(ctx)



del vypaParser