
class interCode:
    def __init__(self):
        self.code = []
        
        
    def addCode(self, op, o1, o2, o3):
        self.code.append({"op": op, "o1": o1, "o2": o2, "o3": o3})
        
    
    def translate(self):
        # TODO
        pass