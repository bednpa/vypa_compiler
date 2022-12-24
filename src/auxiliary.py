#
# Task: Compiler for VYPlanguage
# Author(s): Pavel Bednar (xbedna73), Samuel Gajdos (xgajdo26)
# Description: Auxiliary files, e.g. custum exceptions, expression evaluation, ...
#
SUCCESS = 0
SYNTAX_ERROR = 12
SEMANTIC_ERROR_TYPES = 13
SEMANTIC_ERROR_OTHER = 14


#
# Class for evaluation of expressions.
#
class exprChecker():
    
    
    #
    # Init.
    #
    def __init__(self):
        self.stack = []
        
    
    #
    # Pushs type on stack.
    #  
    def addType(self, elem):
        self.stack.append(elem)
        
        
    #
    # Adds return type of two top elements.
    #
    def addOp(self, op):
        
        # Not.
        if (op == "!"):
            o1 = self.stack.pop()
            if (o1 == "int"):
                self.stack.append("int")
            else:
                raise typeError(op, None, o2)
                
        # Mul.
        elif (op == "*"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # Div.
        elif (op == "/"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # Add.
        elif (op == "+"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            elif (o1 == "string" and o2 == "string"):
                self.stack.append("string")
            else:
                raise typeError(op, o1, o2)
                
        # Minus.
        elif (op == "-"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # Less.
        elif (op == "<"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            elif (o1 == "string" and o2 == "string"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # Less or equal.
        elif (op == "<="):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            elif (o1 == "string" and o2 == "string"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # Greater.
        elif (op == ">"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            elif (o1 == "string" and o2 == "string"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # Greater or equal.
        elif (op == ">="):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            elif (o1 == "string" and o2 == "string"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # Equal.
        elif (op == "=="):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == o2):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # Not equal.
        elif (op == "!="):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == o2):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # And.
        elif (op == "&&"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == o2 and o1 != "string"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # Or.
        elif (op == "||"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == o2 and o1 != "string"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        else:
            raise unexpectedError()
                
    # Returns type of whole expression.  
    def returnType(self):
        if len(self.stack) == 0:
            return None
        type = self.stack
        if len(self.stack) == 1:
            self.stack = []
            return type[0]
        else:
            self.stack = []
            return type


#
# Pure base class of custom exceptions.
#
class customException(Exception):
    def __init__(self):
        pass


#
# Class of variable already declared error.
#
class alreadyDeclared(customException):
    def __init__(self, name):
        self.what = str(name) + " already declared."
        self.err_code = SEMANTIC_ERROR_OTHER
        
  
#
# Class of variable not declared error.
#      
class notDeclared(customException):
    def __init__(self, name):
        self.what = str(name) + " not declared."
        self.err_code = SEMANTIC_ERROR_OTHER
        
        
#
# Class for various type errors.
#
class typeError(customException):
    def __init__(self, op, type1, type2):
        self.what = "type error, " + str(type1) + " " + str(op) + " " + str(type2) + " is not allowed."
        self.err_code = SEMANTIC_ERROR_TYPES    
        

#
# Class for inner compiler errors.
#
class unexpectedError(customException):
    def __init__(self):
        self.what = "unexpected error happens."
        self.err_code = SEMANTIC_ERROR_OTHER
        
        
#
# Class for bad expression in if header.
#
class ifHeaderError(customException):
    def __init__(self, type):
        self.what = "Type " + str(type) + " can not be in if header."
        self.err_code = 5


#        
# Class for type error in return statement.
# 
class returnError(customException):
    def __init__(self, name, type1, type2):
        self.what = "Return type " + str(type2) + " is different that type " + str(type1) + " of " + str(name) + "."
        self.err_code = SEMANTIC_ERROR_TYPES
        
        
#
# Class of variable not declared error.
#      
class embeddedRedeclared(customException):
    def __init__(self, name):
        self.what = "Can not redefine embedded function " + str(name) + "."
        self.err_code = SEMANTIC_ERROR_OTHER
        
        
#
# Class of bad params function call error.
#      
class badParamsFuncCall(customException):
    def __init__(self, name, params):
        if len(params) > 1:
            self.what = "Can not call function " + str(name) + " with parameters of types"
        else:
            self.what = "Can not call function " + str(name) + " with parameter of type"
        for p in params:
            self.what += " " + str(p) 
        self.what += "."
        self.err_code = 8
        
        
#
# Class of bad params count function call error.
#      
class badParamsCountFuncCall(customException):
    def __init__(self, name, num):
        if num > 1:
            self.what = "Can not call function " + str(name) + " with " + str(num) + " parameters."
        else:
            self.what = "Can not call function " + str(name) + " with " + str(num) + " parameter."
        self.err_code = 9
        
        
#
# Class of at least two different function call error.
#      
class differentFuncCalls(customException):
    def __init__(self, name):
        self.what = "Function " + str(name) + " is called two times with different types or number of parameters."
        self.err_code = 10
        
        
# Class of  error.
#      
class badFuncTypeInExpr(customException):
    def __init__(self, name, real_type, expected_type):
        self.what = "Type " + str(real_type) + " of function " + str(name) + " do not match expected type " + str(expected_type) + " in expression."
        self.err_code = SEMANTIC_ERROR_TYPES
