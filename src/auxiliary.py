

class customException(Exception):
    def __init__(self):
        super().__init__()


class alreadyDeclared(customException):
    def __init__(self, name):
        super().__init__()
        self.what = str(name) + " already declared!"
        self.err_code = 1
        
        
class notDeclared(customException):
    def __init__(self, name):
        super().__init__()
        self.what = str(name) + " not declared!"
        self.err_code = 2
        
        
        
        
