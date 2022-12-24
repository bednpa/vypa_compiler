#
# Task: Compiler for VYPlanguage
# Author(s): Pavel Bednar (xbedna73), Samuel Gajdos (xgajdo26)
# Description: Implementation of symbol table.
#
from auxiliary import *
from tabulate import tabulate
        

#
# Class for table of all variables in corresponding function.
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
    # Adding new function.
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
    # Fill parameters to existing function.
    #
    def addFuncParams(self, name, params):
        was_declared = False
        for key, val in self.ft.items():
            if val["params"] == None and val["name"] == name:
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
    # Returns type of given function.
    #
    def getFuncType(self, name):
        for key, val in self.ft.items(): 
            if val["name"] == name:
                return self.ft[key]["type"]
        raise notDeclared(name)
    
    
    #
    # Returns parameters of given function.
    #
    def getFuncParams(self, name):
        for key, val in self.ft.items(): 
            if val["name"] == name:
                return self.ft[key]["params"]
        raise notDeclared(name)
    
    
    #
    # Returns ID of given function.
    #
    def getFuncID(self, name, excpt=True):
        for key, val in self.ft.items(): 
            if val["name"] == name:
                return key
        if excpt:
            raise notDeclared(name)
        else:
            return -1
        
    
    #
    # Returns table of all varibles in scope of given function.
    #
    def getFuncST(self, name):
        for key, val in self.ft.items(): 
            if val["name"] == name:
                return self.ft[key]["symbol_table"]
        raise notDeclared(name)
    
    
    #
    # Returns unique (global) ID to variable in function.
    #
    def getUniqueID(self, func_name, var_name):
        for k1, v1 in self.ft.items(): 
            if v1["name"] == func_name:
                st = self.ft[k1]["symbol_table"]
                for k2, v2 in st.st.items(): 
                    if v2["name"] == var_name:
                        return str(k1) + "_" + str(k2)
                raise notDeclared(var_name)
        raise notDeclared(func_name)
    
    
    #
    # Creates new namespace in function.
    #
    def increaseNamespace(self, name):
        for key, val in self.ft.items(): 
            if val["name"] == name:
                st = self.ft[key]["symbol_table"]
                st.namespace += 1
                return
        raise unexpectedError()
        
        
    #
    # Erase newest namespace in function.
    #
    def decreaseNamespace(self, name):
        for key, val in self.ft.items(): 
            if val["name"] == name:
                st = self.ft[key]["symbol_table"]
                st.st = {key:val for key, val in st.st.items() if val["namespace"] < st.namespace}
                st.namespace -= 1
                return
        raise unexpectedError()
    
        
    #
    # Prints function table to the output.
    #
    def dump(self):
        print("Functions table:")
        ft_to_print = []
        for k in self.ft:
            if self.ft[k]["params"] == None:
                ft_to_print.append([k, self.ft[k]["name"], self.ft[k]["type"], None])
            else:
                ft_to_print.append([k, self.ft[k]["name"], self.ft[k]["type"], [ (v["type"], v["id"]) for v in self.ft[k]["params"]]])
        print(tabulate(ft_to_print, headers=["ID", "Name", "Type", "Params"], tablefmt='orgtbl'))
        
        
    #
    # Prints function table and all variable tables to the output.
    #
    def dumpAll(self):
        ft_to_print = []
        for k in self.ft:
            if self.ft[k]["params"] == None:
                ft_to_print.append([k, self.ft[k]["name"], self.ft[k]["type"], None])
            else:
                ft_to_print.append([k, self.ft[k]["name"], self.ft[k]["type"], [ (v["type"], v["id"]) for v in self.ft[k]["params"]]])
            self.ft[k]["symbol_table"].dump()
            print("")
        print("Functions table:")
        print(tabulate(ft_to_print, headers=["ID", "Name", "Type", "Params"], tablefmt='orgtbl'))
