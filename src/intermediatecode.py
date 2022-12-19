'''
Intermediate Code Cheatsheet

PUSHI, o1               - Push integer constant o1 onto the stack
PUSHS, o1               - Push string constant o1 onto the stack
POP, o1                 - Pop value from the stack and store it into variable o1

MULT, o1, o1, o2        - Multiply o1 and o2 and store the result into o1
DIV, o1, o1, o2         - Divide o1 by o2 and store the result into o1
ADD, o1, o1, o2         - Add o1 and o2 and store the result into o1
SUB, o1, o1, o2         - Subtract o2 from o1 and store the result into o1

SET o1, o2              - Set variable o1 to value o2

JUMP, o1                - Unconditional jump to label o1
// Expression evaluation codes:

POP, o1
POP, o2
MULT, o1, o1, o2
PUSH o1

POP, o1
POP, o2
ADD, o1, o1, o2
PUSH o1

// Conditional statement codes:

# Start of if, result of expr is on top of the stack
POP $1
JUMPNZ if:row,position, $1
JUMP else:row,position
LABEL if:row,position
//if stmt
JUMP else_end:row,position

# Start of else
LABEL else:row,position
//else stmt

# End of else part
LABEL else_end:row,position

'''

def getInterFunctionDefinition(label_name):
    inter_code = '''
    LABEL {}
        # Push FP and increment SP
        PUSHI $FP
        ADDI $SP, $SP, 1
    '''.format(label_name)

    return inter_code

def getInterDeclaration(id_name, value):
    inter_code = '''
    SET {} {}'''





class interCode:
    def __init__(self):
        self.code = []
        
        self.address_dict = {}
        self.frame_pointer = 0
        self.stack_pointer = 0

        
        
    def addCode(self, op, o1=None, o2=None, o3=None):
        self.code.append({"op": op, "o1": o1, "o2": o2, "o3": o3})

    
    def addBinaryOperationCode(self, op, o1=None, o2=None, o3=None):
        self.addCode(self, "POP", "$2")
        self.addCode(self, "POP", "$1")
        self.addCode(self, op, "$1", "$1", "$2")
        self.addCode(self, "PUSHI", "$1")

    def addFramePointerInit(self):
        self.addCode(self, "PUSHI", "$FP")
        self.addCode(self, "SET", "$FP", "$SP")

    def addFramePointerEnd(self):
        self.addCode(self, "SET", "$SP", "$FP")
        self.addCode(self, "POP", "$FP")

    # TODO: K labelom je potrebne priradit cislo riadku + stlpca znaku
    def addConditionalBeginCode(self, position):
        # expr stmt ...
        self.addCode(self, "POP", "$1")
        self.addCode(self, "JUMPNZ", "if_" + position, "$1")
        self.addCode(self, "JUMP", "else_" + position)
        self.addCode(self, "LABEL", "if_" + position)
        self.addFramePointerInit(self)
        #if stmt ...
        
    # The position musi byt rovnaky pre ako pre najblizsi if
    def addConditionalElseCode(self, position):
        # if stmt ...
        self.addFramePointerEnd(self)

        self.addCode(self, "JUMP", "else_end_" + position)
        # Start of else
        self.addCode(self, "LABEL", "else_" + position)
        self.addFramePointerInit(self)
        # else stmt ..

    def addConditionalEndCode(self, position):
        # else stmt ..
        self.addFramePointerEnd(self)
        self.addCode(self, "LABEL", "else_end_" + position)

    def addWhileBeginCode(self, position):
        self.addCode(self, "LABEL", "while_begin_" + position)
        # expr stmt ...

    def addWhileMiddleCode(self, position):
        # expr stmt ...
        self.addCode(self, "POP", "$1")
        self.addCode(self, "JUMPNZ", "while_" + position, "$1")
        self.addCode(self, "JUMP", "while_end_" + position)

        #Start of while body if expr is true
        self.addCode(self, "LABEL", "while_" + position)
        self.addFramePointerInit(self)
        # while stmt ...
        
    def addWhileEndCode(self, position):
        #while stmt ...
        self.addFramePointerEnd(self)
        self.addCode(self, "JUMP", "while_begin_" + position)
        self.addCode(self, "LABEL", "while_end_" + position)

    def addFunctionCallCode(self, func_label):
        self.addCode(self, "CALL", "[$SP]", func_label)

    def addFunctionDefinitionCode(self, func_label):
        self.addCode(self, "LABEL", func_label)
        self.addFramePointerInit()

    def addVarDeclarationCode(self, o1, o2):
        self.addCode(self, "SET", o1, o2)

    def addReturnCode(self, o1="int_0"):
        self.addCode(self, "SET", "$1", o1)


    def getAddress():
        ''' 
        Adresa bude ulozena ako cislo v stacku, cez globalny base pointer sa k nej dostanem
        napr ulozena hodnota v 5
        tak sa k nej dostaneme ako [$BP + 5]
        '''

    def translate(self):
        '''
        Translate intermediate code to VypCode.
        '''
        print(self.code)
        # for row in self.code:

        #     if row["op"] == "SET":
        #         if row["o1"] in self.address_dict:
        #             row["o1"] = self.getAddress(row["o1"])

        #             if row["o2"][0] == "s":
        #                 #TODO: Generate set for string in target code
        #                 pass
        #             if row["o2"][0] == "i":
        #                 #TODO: Generate set for integer in target code
        #                 pass
        #             if row["o2"][0] == "v":
        #                 #TODO: Generate set for variable in target code
        #                 # Get value from address using []
        #                 pass
        #         else:
        #             #Create a new variable - push it to the stack
        #             self.setAddress(row["op"], self.stack_pointer)
         
        #             if row["o2"][0] == "s":
        #                 #TODO: Generate push for string in target code
        #                 pass
        #             if row["o2"][0] == "i":
        #                 #TODO: Generate push for integer in target code
        #                 pass
        #             if row["o2"][0] == "v":
        #                 #TODO: Generate push for variable in target code
        #                 # Get value from address using []
        #                 pass


    
