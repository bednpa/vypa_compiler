from auxiliary import *
from tabulate import tabulate
        

class symbolTable:
    
    #init
    def __init__(self):
        self.st = {}
    
    
    def addSymbol(self, name, type, value):
        if not name in self.st:
            self.st[name] = { "type": type, "value": value }  
        else:
            raise alreadyDeclared(name)
        
        
    def updateSymbol(self, name, value):
        if name in self.st:
            type = self.st[name]["type"]
            self.st[name].update({ "type": type, "value": value })
        else:
            raise assignToNotDeclared(name)
            
            
    def dump(self):
        st_to_print = []
        for k in self.st:
            st_to_print.append([k, self.st[k]["type"], self.st[k]["value"]])
        print(tabulate(st_to_print, headers=["Name", "Type", "Value"], tablefmt='orgtbl'))
        
        
    
    
    
    