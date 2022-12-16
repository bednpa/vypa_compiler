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
        o2 = self.stack.pop()
        o1 = self.stack.pop()
        
        if (op == "+"):
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            else:
                typeError(op, o1, o2)
                
        elif (op == "*"):
            if (o1 == "int" and o2 == "int"):
                self.stack.append("int")
            else:
                typeError(op, o1, o2)
                
        else:
            raise unexpectedError()
                
    
    #
    # Returns type of whole expression.
    #    
    def returnType(self):
        type = self.stack
        if len(self.stack) == 1:
            self.stack = []
            return type[0]
        else:
            return unexpectedError()


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
        
