#
# Auxiliary files, e.g. custum exceptions, expression evaluation ,...
#


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
        # not
        if (op == "!"):
            o1 = self.stack.pop()
            if (o1 == "int"):
                self.stack.append("int")
            else:
                raise typeError(op, None, o2)
                
        # mul
        elif (op == "*"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # div
        elif (op == "/"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # add
        elif (op == "+"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            elif (o1 == "string" and o2 == "string"):
                self.stack.append("string")
            elif (type(o1) == int and o2 == "int"):
                self.stack.append("int")
                return (o1, "int")
            elif (o1 == "int" and type(o2) == int):
                self.stack.append("int")
                return (o2, "int")
            elif (type(o1) == int and o2 == "string"):
                self.stack.append("string")
                return (o1, "string")
            elif (o1 == "string" and type(o2) == int):
                self.stack.append("string")
                return (o2, "string")
            else:
                raise typeError(op, o1, o2)
                
        # minus
        elif (op == "-"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # less
        elif (op == "<"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            elif (o1 == "string" and o2 == "string"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # less or equal
        elif (op == "<="):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            elif (o1 == "string" and o2 == "string"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # greater
        elif (op == ">"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            elif (o1 == "string" and o2 == "string"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # greater or equal
        elif (op == ">="):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            elif (o1 == "string" and o2 == "string"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # equal
        elif (op == "=="):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == o2):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # not equal
        elif (op == "!="):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == o2):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # and
        elif (op == "&&"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == o2 and o1 != "string"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        # or
        elif (op == "||"):
            o2 = self.stack.pop()
            o1 = self.stack.pop()
            if (o1 == o2 and o1 != "string"):
                self.stack.append("int")
            else:
                raise typeError(op, o1, o2)
                
        else:
            raise unexpectedError()
                
    
    #
    # Returns type of whole expression.
    #    
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
        self.err_code = 1
        
  
#
# Class of variable not declared error.
#      
class notDeclared(customException):
    def __init__(self, name):
        self.what = str(name) + " not declared."
        self.err_code = 2
        
        
#
# Class for various type errors.
#
class typeError(customException):
    def __init__(self, op, type1, type2):
        self.what = "type error, " + str(type1) + " " + str(op) + " " + str(type2) + " is not allowed."
        self.err_code = 3        
        

#
# Class for inner compiler errors.
#
class unexpectedError(customException):
    def __init__(self):
        self.what = "unexpected error happens."
        self.err_code = 4
        
        
#
# Class for bad expression in if header.
#
class ifHeaderError(customException):
    def __init__(self, type):
        self.what = "Type " + str(type) + " can not be in if header."
        self.err_code = 5
        
        
class returnError(customException):
    def __init__(self, name, type1, type2):
        self.what = "Return type " + str(type2) + " is different that type " + str(type1) + " of " + str(name) + "."
        self.err_code = 6
        
        
#
# Class of variable not declared error.
#      
class embeddedRedeclared(customException):
    def __init__(self, name):
        self.what = "Can not redefine embedded function " + str(name) + "."
        self.err_code = 7
        
        
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
        self.err_code = 11
