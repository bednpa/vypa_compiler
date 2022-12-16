#
# Auxiliary files, e.g. custum exceptions, expression evaluation ,...
#


#
# Class for evaluation of expressions.
#
class exprEval():
    
    
    #
    # Init.
    #
    def __init__(self):
        self.stack = []
        
    
    #
    # Pushs smybol on expression stack.
    #  
    def push(self, elem, type):
        self.stack.append((elem, type))


    #
    # Semantic check and evaluation of expressions.
    #
    def eval(self):
        if len(self.stack) == 1:
            evaluated = self.stack
            self.stack = []
            return evaluated[0][0], evaluated[0][1]
        
        while len(self.stack) > 1:
            for i in range(len(self.stack)):
                if self.stack[i][1] == None:
                    if self.stack[i][0] == "+":
                        if self.stack[i-2][1] == "int" and self.stack[i-1][1] == "int":
                            result = self.stack[i-2][0] + self.stack[i-1][0]
                            self.stack[i-2] = (result, "int")
                            del self.stack[i-1]
                            del self.stack[i-1]
                            break
                        else:
                            raise typeError("+", self.stack[i-2][0], self.stack[i-1][0], self.stack[i-2][1], self.stack[i-1][1])
                    if self.stack[i][0] == "*":
                        if self.stack[i-2][1] == "int" and self.stack[i-1][1] == "int":
                            result = self.stack[i-2][0] * self.stack[i-1][0]
                            self.stack[i-2] = (result, "int")
                            del self.stack[i-1]
                            del self.stack[i-1]
                            break
                        else:
                            raise typeError("*", self.stack[i-2][0], self.stack[i-1][0], self.stack[i-2][1], self.stack[i-1][1])
        evaluated = self.stack
        self.stack = []
        return evaluated[0][0], evaluated[0][1]


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
    def __init__(self, op, val1, val2, type1, type2):
        self.what = "type error in " + str(val1) + " " + str(op) + " " + str(val2) + " (" + str(type1) + " " + str(op) + " " + str(type2) + " is not allowed)."
        self.err_code = 3
        
        
