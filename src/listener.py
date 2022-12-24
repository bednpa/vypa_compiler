#
# Custom class for parse tree traversal.
#
import string
from from_antlr.vypaListener import vypaListener
from from_antlr.vypaParser import vypaParser
from auxiliary import *


class customListener(vypaListener):
    # init
    def __init__(self, func_table, code_table):
        self.func_table = func_table
        self.code_table = code_table
        self.expr_check = [exprChecker()]
        self.act_func = None

        self.label_counter = 0
        
        
    def checkFuncTypes(self, name, call_params):
        defined_params = self.func_table.getFuncParams(name)
        
        if (call_params == None and defined_params != None):
            raise badParamsCountFuncCall(name, 0)
        if (call_params != None and defined_params == None):
            if type(call_params) != list:
                call_params = [call_params]
            raise badParamsCountFuncCall(name, len(call_params))
        
                
        if not (call_params == None and defined_params == None):
            if type(call_params) != list:
                call_params = [call_params]

            if len(call_params) != len(defined_params):
                raise badParamsCountFuncCall(name, len(call_params))
            for i in range(len(call_params)):
                if call_params[i] != defined_params[i]["type"]:
                    raise badParamsFuncCall(name, call_params)
        
    
    # Enter a parse tree produced by vypaParser#program.
    def enterProgram(self, ctx:vypaParser.ProgramContext):
        pass

    # Exit a parse tree produced by vypaParser#program.
    def exitProgram(self, ctx:vypaParser.ProgramContext):
        self.func_table.dumpAll()
        #self.code_table.translate() 


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
        """name = ctx.ID().getText()
        if name in ["print", "readInt", "readString", "length", "subStr"]:
            raise embeddedRedeclared(name)
        type = ctx.type_().getText()
        self.func_table.addFunc(name, type)
        self.act_func = name"""
        name = ctx.ID().getText()
        self.act_func = name

        self.code_table.addFunctionDefinitionCode(name)

    # Exit a parse tree produced by vypaParser#function_definition.
    def exitFunction_definition(self, ctx:vypaParser.Function_definitionContext):
        self.act_func = None
        
    
    # Enter a parse tree produced by vypaParser#function_body.
    def enterFunction_body(self, ctx:vypaParser.Function_bodyContext):
        pass

    # Exit a parse tree produced by vypaParser#function_body.
    def exitFunction_body(self, ctx:vypaParser.Function_bodyContext):
        pass
    
    
    # Enter a parse tree produced by vypaParser#function_body_not_in_func.
    def enterFunction_body_not_in_func(self, ctx:vypaParser.Function_body_not_in_funcContext):
        self.func_table.increaseNamespace(self.act_func)

    # Exit a parse tree produced by vypaParser#function_body_not_in_func.
    def exitFunction_body_not_in_func(self, ctx:vypaParser.Function_body_not_in_funcContext):
        self.func_table.decreaseNamespace(self.act_func)


    # Enter a parse tree produced by vypaParser#param_list.
    def enterParam_list(self, ctx:vypaParser.Param_listContext):
        """ids = []
        types = []
        params = []
        
        for i in ctx.ID():
            ids.append(i.getText())
        for d in ctx.data_type():
            types.append(d.getText())
        for i in range(len(ids)):
            params.append({"id": ids[i], "type": types[i]})
        
        self.func_table.addFuncParams(self.act_func, params)"""
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
                st = self.func_table.getFuncST(self.act_func)
                st.addSymbol(name.getText(), ctx.data_type().getText())

                self.code_table.addVarInitCode("v_" + str(st.getSymbolID(name.getText())) , "i_0")

            elif (ctx.data_type().getText() == "string"):
                st = self.func_table.getFuncST(self.act_func)
                st.addSymbol(name.getText(), ctx.data_type().getText())

                self.code_table.addVarInitCode("v_" + str(st.getSymbolID(name.getText())) , "s_")

            else:
                self.func_table.addSymbol(name.getText(), ctx.data_type().getText())

    # Exit a parse tree produced by vypaParser#stmt_local_vars.
    def exitStmt_local_vars(self, ctx:vypaParser.Stmt_local_varsContext):
        pass


    # Enter a parse tree produced by vypaParser#stmt_assignment.
    def enterStmt_assignment(self, ctx:vypaParser.Stmt_assignmentContext):
        pass
        

    # Exit a parse tree produced by vypaParser#stmt_assignment.
    def exitStmt_assignment(self, ctx:vypaParser.Stmt_assignmentContext):
        type = self.expr_check[-1].returnType()
        st = self.func_table.getFuncST(self.act_func)
        if (st.getSymbolType(ctx.ID().getText()) != type):
            raise typeError("=", st.getSymbolType(ctx.ID().getText()), type)

        self.code_table.addCode("POP", "$1")
        id = st.getSymbolID(ctx.ID().getText())
        self.code_table.addVarAssignCode("v_" + str(id), "$1")


    # Enter a parse tree produced by vypaParser#stmt_while.
    def enterStmt_while(self, ctx:vypaParser.Stmt_whileContext):
        pass

    # Exit a parse tree produced by vypaParser#stmt_while.
    def exitStmt_while(self, ctx:vypaParser.Stmt_whileContext):
        self.code_table.addWhileEndCode(self.label_counter)
        self.label_counter -= 1

    # Enter a parse tree produced by vypaParser#while_header.
    def enterWhile_header(self, ctx:vypaParser.While_headerContext):
        self.label_counter += 1
        self.code_table.addWhileBeginCode(self.label_counter)

    # Exit a parse tree produced by vypaParser#while_header.
    def exitWhile_header(self, ctx:vypaParser.While_headerContext):
        type = self.expr_check[-1].returnType()
        if (type == "string"):
            raise ifHeaderError(type)
        self.code_table.addCode("POP", "$1")
        self.code_table.addWhileMiddleCode(self.label_counter)
        
    

    # Enter a parse tree produced by vypaParser#stmt_func_call.
    def enterStmt_func_call(self, ctx:vypaParser.Stmt_func_callContext):
        pass
    

    # Exit a parse tree produced by vypaParser#stmt_func_call.
    def exitStmt_func_call(self, ctx:vypaParser.Stmt_func_callContext):
        name = ctx.ID().getText()
        call_params = self.expr_check[-1].returnType()
        if name in ["print", "readInt", "readString", "length", "subStr"]:
            return
        self.checkFuncTypes(name, call_params)


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

    # Enter a parse tree produced by vypaParser#case_if.
    def enterCase_if(self, ctx:vypaParser.Case_ifContext):
        pass

    # Exit a parse tree produced by vypaParser#case_if.
    def exitCase_if(self, ctx:vypaParser.Case_ifContext):
        self.code_table.addConditionalElseCode(self.label_counter)


    # Enter a parse tree produced by vypaParser#case_else.
    def enterCase_else(self, ctx:vypaParser.Case_elseContext):
        pass

    # Exit a parse tree produced by vypaParser#case_else.
    def exitCase_else(self, ctx:vypaParser.Case_elseContext):
        self.code_table.addConditionalEndCode(self.label_counter)
        self.label_counter -= 1
    
    # Enter a parse tree produced by vypaParser#if_header.
    def enterIf_header(self, ctx:vypaParser.If_headerContext):
        pass

    # Exit a parse tree produced by vypaParser#if_header.
    def exitIf_header(self, ctx:vypaParser.If_headerContext):
        type = self.expr_check[-1].returnType()
        if (type == "string"):
            raise ifHeaderError(type)

        self.code_table.addCode("POP", "$1")
        self.label_counter += 1
        self.code_table.addConditionalBeginCode(self.label_counter)


    # Enter a parse tree produced by vypaParser#stmt_return.
    def enterStmt_return(self, ctx:vypaParser.Stmt_returnContext):
        pass

    # Exit a parse tree produced by vypaParser#stmt_return.
    def exitStmt_return(self, ctx:vypaParser.Stmt_returnContext):
        type = self.expr_check[-1].returnType()
        func_type = self.func_table.getFuncType(self.act_func)
        if not (type == func_type or (type == None and func_type == "void")):
            raise returnError(self.act_func, func_type, type)

        self.code_table.addCode("POP", "$1")
        self.code_table.addFunctionEndCode()
        self.code_table.addCode("RETURN", "[$SP]")


    # Enter a parse tree produced by vypaParser#expression.
    def enterExpression(self, ctx:vypaParser.ExpressionContext):
        pass

    # Exit a parse tree produced by vypaParser#expression.
    def exitExpression(self, ctx:vypaParser.ExpressionContext):
        if ctx.ID():
            st = self.func_table.getFuncST(self.act_func)
            type = st.getSymbolType(ctx.getText())
            self.expr_check[-1].addType(type)
            
            id = st.getSymbolID(ctx.getText())
            if (type == "string"):
                self.code_table.addCode("PUSHS", "v_" + str(id))
            elif (type == "int"):
                self.code_table.addCode("PUSHI", "v_" + str(id))
            
        elif ctx.INT_VAL():
            self.expr_check[-1].addType("int")
            self.code_table.addCode("PUSHI", "i_" + ctx.getText())
            
        elif ctx.STRING_VAL():
            self.expr_check[-1].addType("string")
            self.code_table.addCode("PUSHS", "s_" + ctx.getText())
            
        elif ctx.NOT():
            self.expr_check[-1].addOp("!")
            self.code_table.addSingleOperationCode("NOT")
        
        elif ctx.MULT():
            self.expr_check[-1].addOp("*")
            self.code_table.addBinaryOperationCode("MULI")
            
        elif ctx.DIV():
            self.expr_check[-1].addOp("/")
            self.code_table.addBinaryOperationCode("DIVI")
            
        elif ctx.ADD():
            o1 = self.expr_check[-1].stack[-1]
            self.expr_check[-1].addOp("+")

            if o1 == "string":
                #konkatenacióne string function , ja vohl!
                pass
            elif o1 == "int":
                self.code_table.addBinaryOperationCode("ADDI")

            
        elif ctx.MINUS():
            self.expr_check[-1].addOp("-")
            self.code_table.addBinaryOperationCode("SUBI")
            
        elif ctx.LESS():
            o1 = self.expr_check[-1].stack[-1]
            self.expr_check[-1].addOp("<")
            if o1 == "string":
                self.code_table.addBinaryOperationCode("LTS")
            elif o1 == "int":
                self.code_table.addBinaryOperationCode("LTI")

            
        elif ctx.LOE():
            o1 = self.expr_check[-1].stack[-1]
            self.expr_check[-1].addOp("<=")
            if o1 == "string":
                self.code_table.addBinaryExtendCodeString("LTS", "EQS", "OR")
            elif o1 == "int":
                self.code_table.addBinaryExtendCode("LTI", "EQI", "OR")
            
        elif ctx.GREATER():
            o1 = self.expr_check[-1].stack[-1]
            self.expr_check[-1].addOp(">")
            if o1 == "string":
                self.code_table.addBinaryOperationCodeString("GTS")
            elif o1 == "int":
                self.code_table.addBinaryOperationCode("GTI")
            
        elif ctx.GOE():
            o1 = self.expr_check[-1].stack[-1]
            self.expr_check[-1].addOp(">=")
            if o1 == "string":
                self.code_table.addBinaryExtendCode("GTS", "EQS", "OR")
            elif o1 == "int":
                self.code_table.addBinaryExtendCode("GTI", "EQI", "OR")
            
        elif ctx.EQ():
            o1 = self.expr_check[-1].stack[-1]
            self.expr_check[-1].addOp("==")
            if o1 == "string":
                self.code_table.addBinaryOperationCode("EQS")
            elif o1 == "int":
                self.code_table.addBinaryOperationCode("EQI")
            
        elif ctx.NEQ():
            o1 = self.expr_check[-1].stack[-1]
            self.expr_check[-1].addOp("!=")
            if o1 == "string":
                self.code_table.addNEQOperationString()
            elif o1 == "int":
                self.code_table.addNEQOperation()
            
        elif ctx.AND():
            self.expr_check[-1].addOp("&&")
            self.code_table.addBinaryOperationCode("AND")
            
        elif ctx.OR():
            self.expr_check[-1].addOp("||")
            self.code_table.addBinaryOperationCode("OR") 
            
        elif ctx.expr_func_call():
            pass    
            
        else:
            raise unexpectedError() # expression, not sure about this TODO
        
        
    # Enter a parse tree produced by vypaParser#expr_func_call.
    def enterExpr_func_call(self, ctx:vypaParser.Expr_func_callContext):
        self.expr_check.append(exprChecker())
        

    # Exit a parse tree produced by vypaParser#expr_func_call.
    def exitExpr_func_call(self, ctx:vypaParser.Expr_func_callContext):
        name = ctx.ID().getText()
        call_params = self.expr_check[-1].returnType()
  
        self.checkFuncTypes(name, call_params)
        self.expr_check.pop()
        type = self.func_table.getFuncType(name)
        self.expr_check[-1].addType(type)
       

    # Enter a parse tree produced by vypaParser#casting.
    def enterCasting(self, ctx:vypaParser.CastingContext):
        pass

    # Exit a parse tree produced by vypaParser#casting.
    def exitCasting(self, ctx:vypaParser.CastingContext):
        pass
    
    
    
    
# For late functions definitions
class customPreListener(vypaListener):
    # init
    def __init__(self, func_table):
        self.func_table = func_table
        self.act_func = None
        

    # Enter a parse tree produced by vypaParser#function_definition.
    def enterFunction_definition(self, ctx:vypaParser.Function_definitionContext):
        name = ctx.ID().getText()
        if name in ["print", "readInt", "readString", "length", "subStr"]:
            raise embeddedRedeclared(name)
        type = ctx.type_().getText()
        self.func_table.addFunc(name, type)
        self.act_func = name



    # Exit a parse tree produced by vypaParser#function_definition.
    def exitFunction_definition(self, ctx:vypaParser.Function_definitionContext):
        self.act_func = None
        


    # Enter a parse tree produced by vypaParser#param_list.
    def enterParam_list(self, ctx:vypaParser.Param_listContext):
        ids = []
        types = []
        params = []
        
        for i in ctx.ID():
            ids.append(i.getText())
        for d in ctx.data_type():
            types.append(d.getText())
        for i in range(len(ids)):
            params.append({"id": ids[i], "type": types[i]})
        
        self.func_table.addFuncParams(self.act_func, params)
 

    # Exit a parse tree produced by vypaParser#param_list.
    def exitParam_list(self, ctx:vypaParser.Param_listContext):
        pass


   