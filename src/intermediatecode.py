'''
PUSHI, o1
PUSHS, o1
POPI, o1
POPS, o1

MULT, o1, o1, o2
ADD, o1, o1, o2

// Expression evaluation codes:

POP, o1
POP, o2
MULT, o1, o1, o2
PUSH o1

POP, o1
POP, o2
ADD, o1, o1, o2
PUSH o1

'''


class interCode:
    def __init__(self):
        self.code = []
        
        
    def addCode(self, op, o1=None, o2=None, o3=None):
        self.code.append({"op": op, "o1": o1, "o2": o2, "o3": o3})

    
    def addBinaryOperationCode(self, op, o1=None, o2=None, o3=None):
        self.addCode(self, "POPI", "b_o_2")
        self.addCode(self, "POPI", "b_o_1")
        self.addCode(self, op, "b_o_1", "b_o_1", "b_o_2")
        self.addCode(self, "PUSHI", "b_o_1")

    
    def translate(self):
        # TODO
        pass