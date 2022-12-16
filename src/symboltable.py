#
# File for implementation of symbol table.
#
from auxiliary import *
from tabulate import tabulate
        

#
# Class for symbol table.
#
class symbolTable:
    
    
    #
    # Init.
    #
    def __init__(self):
        self.id = 0
        self.namespace = 0
        self.st = {}
    
    
    #
    # Adds symbol to symbol table, if it does not exists in current namespace.
    #
    def addSymbol(self, name, type, value):
        for _, val in self.st.items():
            if val["name"] == name and val["namespace"] == self.namespace:
                raise alreadyDeclared(name)
        self.st[self.id] = { "name": name, "kind": "var", "type": type, "value": value, "namespace": self.namespace } 
        self.id += 1 
        
    
    #
    # Updates value of symbol in actual namespace in symbol table.
    #
    def updateSymbol(self, name, value):
        ids = [(key, val["namespace"]) for key, val in self.st.items() if val["name"] == name]
        if len(ids) == 0:
            raise notDeclared(name)
        id = max(ids, key = lambda t: t[1])[0]
        type = self.st[id]["type"]
        namespace = self.st[id]["namespace"]
        self.st[id].update({ "name": name, "kind": "var", "type": type, "value": value, "namespace": namespace })
        
        
    #
    # Returns type of given variable.
    #
    def getSymbolType(self, name):
        ids = [(key, val["namespace"]) for key, val in self.st.items() if val["name"] == name]
        if len(ids) == 0:
            raise notDeclared(name)
        id = max(ids, key = lambda t: t[1])[0]
        return self.st[id]["type"]
    
    
    #
    # Returns value of given variable.
    #
    def getSymbolValue(self, name):
        ids = [(key, val["namespace"]) for key, val in self.st.items() if val["name"] == name]
        if len(ids) == 0:
            raise notDeclared(name)
        id = max(ids, key = lambda t: t[1])[0]
        return self.st[id]["value"]
    
    
    #
    # Returns ID of given variable.
    #
    def getSymbolID(self, name):
        ids = [(key, val["namespace"]) for key, val in self.st.items() if val["name"] == name]
        if len(ids) == 0:
            raise notDeclared(name)
        id = max(ids, key = lambda t: t[1])[0]
        return id
    
    
    #
    #
    #
    def addFunc(self, name, type, params):
        for _, val in self.st.items():
            if val["name"] == name:
                raise alreadyDeclared(name)
        self.st[self.id] = { "name": name, "kind": "func", "type": type, "value": params, "namespace": 0 } 
        self.id += 1 
        
        
    #
    #
    #
    def addFuncParams(self, params):
        was_declared = False
        for key, val in self.st.items():
            if val["kind"] == "func" and val["value"] == None:
                name = self.st[key]["name"]
                type = self.st[key]["type"]
                self.st[key].update({ "name": name, "kind": "func", "type": type, "value": params, "namespace": 0 })
                was_declared = True
        if not was_declared:
            raise notDeclared(name)
        
        
    #
    #
    #
    def getFuncType(self, name):
        for key, val in self.st.items(): 
            if val["name"] == name:
                return self.st[key]["type"]
        raise notDeclared(name)
    
    
    #
    #
    #
    def getFuncParams(self, name):
        for key, val in self.st.items(): 
            if val["name"] == name:
                return self.st[key]["value"]
        raise notDeclared(name)
    
    
    #
    #
    #
    def getFuncID(self, name):
        for key, val in self.st.items(): 
            if val["name"] == name:
                return key
        raise notDeclared(name)
        
    
    #
    # Creates new namespace.
    #
    def increaseNamespace(self):
        self.namespace += 1
        
        
    #
    # Erase newest namespace.
    #
    def decreaseNamespace(self):
        self.st = {key:val for key, val in self.st.items() if val["namespace"] < self.namespace}
        self.namespace -= 1
            
         
    #
    # Prints symbol table to the output.
    #
    def dump(self):
        st_to_print = []
        for k in self.st:
            st_to_print.append([k, self.st[k]["name"], self.st[k]["kind"], self.st[k]["type"], self.st[k]["value"], self.st[k]["namespace"]])
        print(tabulate(st_to_print, headers=["ID", "Name", "Kind", "Type", "Value/Params", "Namespace"], tablefmt='orgtbl'))
        
        
    
    
    
    