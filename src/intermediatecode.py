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

class interCode:
    def __init__(self):
        self.code = []
        
        self.address_dict = {}
        self.frame_pointer = 0
        self.stack_pointer = 0

        
        
    def addCode(self, op, o1=None, o2=None, o3=None):
        self.code.append({"op": op, "o1": o1, "o2": o2, "o3": o3})

    def addSingleOperatonCode(self, op):
        self.addCode("POP", "$1")
        self.addCode(op, "$1", "$1")
        self.addCode("PUSHI", "$1")

    def addSingleOperatonCode(self, op):
        self.addCode("POP", "$1")
        self.addCode(op, "$1", "$1")
        self.addCode("PUSHI", "$1")

    def addBinaryOperationCode(self, op):
        self.addCode("POP", "$2")
        self.addCode("POP", "$1")
        self.addCode(op, "$1", "$1", "$2")
        self.addCode("PUSHI", "$1")

    def addBinaryExtendCode(self, op1, op2, op3):
        self.addCode("POP", "$2")
        self.addCode("POP", "$1")
        self.addCode(op1, "$3", "$1", "$2")
        self.addCode(op2, "$4", "$1", "$2")
        self.addCode(op3, "$1", "$3", "$4")
        self.addCode("PUSHI", "$1")

    def addNEQOperation(self):
        self.addCode("POP", "$2")
        self.addCode("POP", "$1")
        self.addCode("EQI", "$1", "$1", "$2")
        self.addCode("NOT", "$1", "$1")
        self.addCode("PUSHI", "$1")

    def addNEQOperationString(self):
        self.addCode("POP", "$2")
        self.addCode("POP", "$1")
        self.addCode("EQS", "$1", "$1", "$2")
        self.addCode("NOT", "$1", "$1")
        self.addCode("PUSHI", "$1")

    def addFramePointerInit(self):
        self.addCode("ADDI", "$SP", "$SP", 1)
        self.addCode("ADDI", "$SP", "$SP", 1)
        self.addCode("SET", "$FP", "$SP")

    def addFramePointerEnd(self):
        self.addCode("SET", "$SP", "$FP")
        self.addCode("SUBI", "$SP", "$SP", 1)
        self.addCode("SUBI", "$SP", "$SP", 1)

    # TODO: K labelom je potrebne priradit cislo riadku + stlpca znaku
    def addConditionalBeginCode(self, position):
        # expr stmt ...
        self.addCode("JUMPNZ", "if_" + str(position), "$1")
        self.addCode("JUMP", "else_" + str(position))
        self.addCode("LABEL", "if_" + str(position))
        #if stmt ...
        
    # The position musi byt rovnaky pre ako pre najblizsi if
    def addConditionalElseCode(self, position):
        # if stmt ...
        self.addCode("JUMP", "else_end_" + str(position))
        # Start of else
        self.addCode("LABEL", "else_" + str(position))
        # else stmt ..

    def addConditionalEndCode(self, position):
        # else stmt ..
        self.addCode("LABEL", "else_end_" + str(position))



    def addWhileBeginCode(self, position):
        self.addCode("LABEL", "while_begin_" + str(position))
        # expr stmt ...

    def addWhileMiddleCode(self, position):
        # expr stmt ...
        self.addCode("JUMPNZ", "while_" + str(position), "$1")
        self.addCode("JUMP", "while_end_" + str(position))
        #Start of while body if expr is true
        self.addCode("LABEL", "while_" + str(position))
        # while stmt ...
        
    def addWhileEndCode(self, position):
        #while stmt ...
        self.addCode("JUMP", "while_begin_" + str(position))
        self.addCode("LABEL", "while_end_" + str(position))

    def addFunctionCallCode(self, func_label):
        self.addCode("CALL", "[$SP]", func_label)

    def addFunctionDefinitionCode(self, func_label):
        # self.addCode("JUMP", "end_" + func_label)
        self.addCode("LABEL", func_label)
        self.addFramePointerInit()

    def addFunctionEndCode(self):
        self.addFramePointerEnd()
        # self.addCode("LABEL", "end_" + func_label)

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
            #print(row["op"])
            #print(row["op"])

            # SETN [$SP] s_abc
            # SETN [$SP] i_42
            # SETN [$SP] s_abc
            # SETN [$SP] i_42
            if row["op"] == "SETN":
                self.setAddressPos(row["o1"][2:], self.stack_pointer)
                if row["o2"][0] == "s":
                        generator.generateSetNewString()
                elif row["o2"][0] == "i":
                        generator.generateSetNewInt()
                self.stack_pointer += 1

            if row["op"] == "SET":
                if row["o1"][0] == "v":
                    o1_pos = self.getAddressPos(row["o1"][2:])
                    row["o1"] = "[$FP + {}]".format(o1_pos)
                
                if row["o1"][0] == "v":
                    o1_pos = self.getAddressPos(row["o1"][2:])
                    row["o1"] = "[$FP + {}]".format(o1_pos)
                
                if row["o2"][0] == "s":
                    generator.generateSetString(row["o1"], row["o2"][2:])
                elif row["o2"][0] == "i":
                    generator.generateSetInt(row["o1"], row["o2"][2:])
                elif row["o2"][0] == "v":
                    o2_pos = self.getAddressPos(row["o2"][2:])
                    generator.generateSetVar(row["o1"], o2_pos)
                # Register etc.
                else:
                    generator.generateSetInt(row["o1"], row["o2"])

            # ADDI $1, $1, $2
            if (row["op"] == "ADDI" or row["op"] == "SUBI" or row["op"] == "MULI" or row["op"] == "DIVI" or
                row["op"] == "EQI"  or row["op"] == "LTI"  or row["op"] == "GTI" or
                row["op"] == "OR"   or row["op"] == "AND"):
                generator.generateBinaryIntOp(row["op"], row["o1"], row["o2"], row["o3"])

            if row["op"] == "NOT":
                generator.generateSingleIntOp(row["op"], row["o1"], row["o2"], row["o3"])

            # PUSHI i_45
            # PUSHI v_3
            # PUSHI $1
            if row["op"] == "PUSHI":
                if row["o1"][0] == "i":
                    generator.generatePushInt(row["o1"][2:])
                elif row["o1"][0] == "v":
                    o1_pos = self.getAddressPos(row["o1"][2:])
                    generator.generatePushInt("[$FP + " + str(o1_pos) + "]") 
                else:
                    generator.generatePushInt(row["o1"]) 
                self.stack_pointer += 1

            # PUSHS s_abcbd
            # PUSHS v_3
            # PUSHS $5
            if row["op"] == "PUSHS":
                generator.generatePushStr(row["o1"])

            # POP [FP + 5]
            # POP $5
            if row["op"] == "POP":
                if row["o1"][0] == "v":
                    o1_pos = self.getAddressPos(row["o1"][2:])
                    row["o1"] = "[$FP + {}]".format(o1_pos)
                generator.generatePop(row["o1"])
                self.stack_pointer -= 1

            # LABEL func
            if row["op"] == "LABEL" or row["op"] == "JUMP" or row["op"] == "RETURN":
                generator.generateUnaryOperation(row["op"], row["o1"])

            # JUMPNZ func, $1
            if row["op"] == "JUMPNZ":
                generator.generateBinaryOperation(row["op"], row["o1"], row["o2"])
                


        print(generator.target_code)