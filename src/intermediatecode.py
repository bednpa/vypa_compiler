from generator import Generator

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

    
    def addBinaryOperationCode(self, op):
        self.addCode("POP", "$2")
        self.addCode("POP", "$1")
        self.addCode(op, "$1", "$1", "$2")
        self.addCode("PUSHI", "$1")

    def addFramePointerInit(self):
        self.addCode("PUSHI", "$FP")
        self.addCode("SET", "$FP", "$SP")

    def addFramePointerEnd(self):
        self.addCode("SET", "$SP", "$FP")
        self.addCode("POP", "$FP")

    # TODO: K labelom je potrebne priradit cislo riadku + stlpca znaku
    def addConditionalBeginCode(self, position):
        # expr stmt ...
        self.addCode("POP", "$1")
        self.addCode("JUMPNZ", "if_" + position, "$1")
        self.addCode("JUMP", "else_" + position)
        self.addCode("LABEL", "if_" + position)
        # self.addFramePointerInit(self)
        #if stmt ...
        
    # The position musi byt rovnaky pre ako pre najblizsi if
    def addConditionalElseCode(self, position):
        # if stmt ...
        # self.addFramePointerEnd(self)

        self.addCode("JUMP", "else_end_" + position)
        # Start of else
        self.addCode("LABEL", "else_" + position)
        # self.addFramePointerInit(self)
        # else stmt ..

    def addConditionalEndCode(self, position):
        # else stmt ..
        # self.addFramePointerEnd(self)
        self.addCode("LABEL", "else_end_" + position)

    def addWhileBeginCode(self, position):
        self.addCode("LABEL", "while_begin_" + position)
        # expr stmt ...

    def addWhileMiddleCode(self, position):
        # expr stmt ...
        self.addCode("POP", "$1")
        self.addCode("JUMPNZ", "while_" + position, "$1")
        self.addCode("JUMP", "while_end_" + position)

        #Start of while body if expr is true
        self.addCode("LABEL", "while_" + position)
        # self.addFramePointerInit(self)
        # while stmt ...
        
    def addWhileEndCode(self, position):
        #while stmt ...
        # self.addFramePointerEnd(self)
        self.addCode("JUMP", "while_begin_" + position)
        self.addCode("LABEL", "while_end_" + position)

    def addFunctionCallCode(self, func_label):
        self.addCode("CALL", "[$SP]", func_label)

    def addFunctionDefinitionCode(self, func_label):
        self.addCode("LABEL", func_label)
        self.addFramePointerInit()

    def addVarInitCode(self, o1, o2):
        self.addCode("SETN", o1, o2)

    def addVarAssignCode(self, o1, o2):
        self.addCode("SET", o1, o2)

    def addReturnCode(self, o1="int_0"):
        self.addCode("SET", "$1", o1)



    def getAddressPos(self, id):
        ''' 
        Adresa bude ulozena ako cislo v stacku, cez globalny base pointer sa k nej dostanem
        napr ulozena hodnota v 5
        tak sa k nej dostaneme ako [$BP + 5]
        '''
        return self.address_dict[id]


    def setAddressPos(self, id, stack_pointer):
        self.address_dict[id] = stack_pointer

        

    def translate(self):
        '''
        Translate intermediate code to VypCode.
        '''

        #Optimalization?

        #generator_init
        generator = Generator()

        for row in self.code:
            print(row["op"])

            if row["op"] == "SETN":
                self.setAddressPos(row["o1"][2:], self.stack_pointer)
                if row["o2"][0] == "s":
                        generator.generateSetNewString()
                if row["o2"][0] == "i":
                        generator.generateSetNewInt()
                self.stack_pointer += 1

            if row["op"] == "SET":
                o1_pos = self.getAddressPos(row["o1"][2:])
                if row["o2"][0] == "s":
                        generator.generateSetString(o1_pos, row["o2"][2:])
                if row["o2"][0] == "i":
                        generator.generateSetInt(o1_pos, row["o2"][2:])
                if row["o2"][0] == "v":
                        o2_pos = self.getAddressPos(row["o2"][2:])
                        generator.generateSetVar(o1_pos, o2_pos)

        print(generator.target_code)