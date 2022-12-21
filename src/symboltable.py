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
    def __init__(self, func_name, ft):
        self.id = 0
        self.namespace = 0
        self.st = {}
        self.ft = ft
        self.func_name = func_name
    
    
    #
    # Adds symbol to symbol table, if it does not exists in current namespace.
    #
    def addSymbol(self, name, type):
        for _, val in self.ft.items():
            if val["name"] == name:
                raise alreadyDeclared(name)
        for _, val in self.st.items():
            if val["name"] == name and val["namespace"] == self.namespace:
                raise alreadyDeclared(name)
        self.st[self.id] = { "name": name, "type": type, "namespace": self.namespace } 
        self.id += 1 
        
        
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
    # Returns ID of given variable.
    #
    def getSymbolID(self, name):
        ids = [(key, val["namespace"]) for key, val in self.st.items() if val["name"] == name]
        if len(ids) == 0:
            raise notDeclared(name)
        id = max(ids, key = lambda t: t[1])[0]
        return id
    
    
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
        print("Symbol table for function " + self.func_name + ":")
        st_to_print = []
        for k in self.st:
            st_to_print.append([k, self.st[k]["name"], self.st[k]["type"], self.st[k]["namespace"]])
        print(tabulate(st_to_print, headers=["ID", "Name", "Type", "Namespace"], tablefmt='orgtbl'))
        
    
    
#
# Class for table of all functions.
#
class funcTable():
    
    
    #
    # Init.
    #
    def __init__(self):
        self.id = 0
        self.ft = {}
        
        
    #
    #
    #
    def addFunc(self, name, type, params=None):
        for _, val in self.ft.items():
            if val["name"] == name:
                raise alreadyDeclared(name)
        st = symbolTable(name, self.ft)
        if (params != None):
            for p in params:
                st.addSymbol(p["id"], p["type"])
        self.ft[self.id] = { "name": name, "type": type, "params": params, "symbol_table": st } 
        self.id += 1 
        
        
    #
    #
    #
    def addFuncParams(self, params):
        was_declared = False
        for key, val in self.ft.items():
            if val["params"] == None:
                name = self.ft[key]["name"]
                type = self.ft[key]["type"]
                st = self.ft[key]["symbol_table"]
                if (params != None):
                    for p in params:
                        st.addSymbol(p["id"], p["type"])
                self.ft[key].update({ "name": name, "type": type, "params": params, "symbol_table": st })
                was_declared = True
        if not was_declared:
            raise notDeclared(name)
        
        
    #
    #
    #
    def getFuncType(self, name):
        for key, val in self.ft.items(): 
            if val["name"] == name:
                return self.ft[key]["type"]
        raise notDeclared(name)
    
    
    #
    #
    #
    def getFuncParams(self, name):
        for key, val in self.ft.items(): 
            if val["name"] == name:
                return self.ft[key]["params"]
        raise notDeclared(name)
    
    
    #
    #
    #
    def getFuncID(self, name):
        for key, val in self.ft.items(): 
            if val["name"] == name:
                return key
        raise notDeclared(name)
        
    
    #
    #
    #
    def getFuncST(self, name):
        for key, val in self.ft.items(): 
            if val["name"] == name:
                return self.ft[key]["symbol_table"]
        raise notDeclared(name)
    
        
    #
    # Prints symbol table to the output.
    #
    def dump(self):
        print("Functions table:")
        ft_to_print = []
        for k in self.ft:
            ft_to_print.append([k, self.ft[k]["name"], self.ft[k]["type"], [ (v["type"], v["id"]) for v in self.ft[k]["params"]]])
        print(tabulate(ft_to_print, headers=["ID", "Name", "Type", "Params"], tablefmt='orgtbl'))
        
        
    
    
def main():
    ft = funcTable()
    ft.addFunc("first_func", "string")
    ft.addFuncParams([{"type": "string", "id": "x"}])
    ft.addFunc("second_func", "int")
    ft.addFuncParams([{"type": "int", "id": "y"}])
    st1 = ft.getFuncST("first_func")
    st1.addSymbol("y", "string")
    st2 = ft.getFuncST("second_func")
    st2.addSymbol("z", "int")
    #st2.addSymbol("first_func", "int")
    ft.dump()
    st1.dump()
    st2.dump()
        
        
        
main()
    