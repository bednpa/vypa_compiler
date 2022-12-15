from auxiliary import *
from tabulate import tabulate
        

class symbolTable:
    
    #init
    def __init__(self):
        self.id = 0
        self.namespace = 0
        self.st = {}
    
    
    def addSymbol(self, name, type, value):
        for _, val in self.st.items():
            if val["name"] == name and val["namespace"] == self.namespace:
                raise alreadyDeclared(name)
        self.st[self.id] = { "name": name, "type": type, "value": value, "namespace": self.namespace } 
        self.id += 1 
        
        
    def updateSymbol(self, name, value):
        ids = [(key, val["namespace"]) for key, val in self.st.items() if val["name"] == name]
        if len(ids) == 0:
            raise notDeclared(name)
        id = max(ids, key = lambda t: t[1])[0]
        type = self.st[id]["type"]
        namespace = self.st[id]["namespace"]
        self.st[id].update({ "name": name, "type": type, "value": value, "namespace": namespace })
        
        
    def getSymbolType(self, name):
        ids = [(key, val["namespace"]) for key, val in self.st.items() if val["name"] == name]
        if len(ids) == 0:
            raise notDeclared(name)
        id = max(ids, key = lambda t: t[1])[0]
        return self.st[id]["type"]
    
    
    def getSymbolValue(self, name):
        ids = [(key, val["namespace"]) for key, val in self.st.items() if val["name"] == name]
        if len(ids) == 0:
            raise notDeclared(name)
        id = max(ids, key = lambda t: t[1])[0]
        return self.st[id]["value"]
        
    
    def increaseNamespace(self):
        self.namespace += 1
        
        
    def decreaseNamespace(self):
        self.st = {key:val for key, val in self.st.items() if val["namespace"] < self.namespace}
        self.namespace -= 1
            
            
    def dump(self):
        st_to_print = []
        for k in self.st:
            st_to_print.append([k, self.st[k]["name"], self.st[k]["type"], self.st[k]["value"], self.st[k]["namespace"]])
        print(tabulate(st_to_print, headers=["ID", "Name", "Type", "Value", "Namespace"], tablefmt='orgtbl'))
        
        
    
    
    
    