

class customException(Exception):
    def __init__(self):
        super().__init__()


class alreadyDeclared(customException):
    def __init__(self, name):
        super().__init__()
        self.what = str(name) + " already declared!"
        self.err_code = 1
        
        
class assignToNotDeclared(customException):
    def __init__(self, name):
        super().__init__()
        self.what = str(name) + " not declared, but tries to be assigned!"
        self.err_code = 2
        
        
        
        
