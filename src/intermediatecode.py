#
# Task: Compiler for VYPlanguage
# Author(s): Pavel Bednar (xbedna73), Samuel Gajdos (xgajdo26)
# Description: Implementation of Intermediate code generator.
#
from generator import Generator


class interCode:
    def __init__(self):
        self.code = []
        self.address_dict = {}
        self.stack_pointer = 0
        
    def addCode(self, op, o1=None, o2=None, o3=None):
        self.code.append({"op": op, "o1": o1, "o2": o2, "o3": o3})

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

    def addStringCatCode(self):
        self.addCode("PUSHI", "i_0")
        self.addCode("CALL", "[$SP]", "__concat__")
        self.addCode("POP", "$6")
        self.addCode("POP", "$6")
        self.addCode("PUSHI", "$1")

    def addFramePointerInit(self):
        self.addCode("ADDI", "$SP", "$SP", 1)
        self.addCode("SET", "$FP", "$SP")
        self.stack_pointer += 1

    def addFramePointerEnd(self):
        self.addCode("SET", "$SP", "$FP")
        self.addCode("SUBI", "$SP", "$SP", 1)
        self.stack_pointer -= 1

    def addConditionalBeginCode(self, position):
        # expr stmt ...
        self.addCode("JUMPNZ", "if_" + str(position), "$1")
        self.addCode("JUMP", "else_" + str(position))
        self.addCode("LABEL", "if_" + str(position))
        #if stmt ...
        
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
        self.addCode("LABEL", func_label)
        self.addFramePointerInit()

    def addFunctionEndCode(self):
        self.addFramePointerEnd()

    def addVarInitCode(self, o1, o2):
        self.addCode("SETN", o1, o2)

    def addVarAssignCode(self, o1, o2):
        self.addCode("SET", o1, o2)

    def addReturnCode(self, o1="int_0"):
        self.addCode("SET", "$1", o1)

    def addPrintInt(self, position):
        self.addCode("WRITEI", "[$SP - {}]".format(position))

    def addPrintString(self, position):
        self.addCode("WRITES", "[$SP - {}]".format(position))


    def getAddress(self, id):
        if self.address_dict[id] >= 0:
            return "[$FP + " + str(abs(self.address_dict[id])) + "]"
        else:
            return "[$FP - " + str(abs(self.address_dict[id])) + "]"


    def setAddressPos(self, id, position):
        self.address_dict[id] = position
  

    def translate(self):
        '''
        Translate intermediate code to VypCode.
        '''

        #generator_init
        generator = Generator()

        for row in self.code:
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
                    row["o1"] = self.getAddress(row["o1"][2:])
                if row["o2"][0] == "s":
                    generator.generateSetString(row["o1"], row["o2"][2:])
                elif row["o2"][0] == "i":
                    generator.generateSetInt(row["o1"], row["o2"][2:])
                elif row["o2"][0] == "v":
                    o2_pos = self.getAddress(row["o2"][2:])
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
                    o1_pos = self.getAddress(row["o1"][2:])
                    generator.generatePushInt(o1_pos) 
                else:
                    generator.generatePushInt(row["o1"]) 
                self.stack_pointer += 1

            # PUSHS s_abcbd
            # PUSHS v_3
            # PUSHS $5
            # TODO: string operations
            if row["op"] == "PUSHS":
                if row["o1"][0] == "s":
                    generator.generatePushStr(row["o1"][2:])
                elif row["o1"][0] == "v":
                    o1_pos = self.getAddress(row["o1"][2:])
                    generator.generatePushInt(o1_pos) 
                else:
                    generator.generatePushInt(row["o1"]) 
                self.stack_pointer += 1

            # POP [FP + 5]
            # POP $5
            if row["op"] == "POP":
                if row["o1"][0] == "v":
                    row["o1"] = self.getAddress(row["o1"][2:])
                generator.generatePop(row["o1"])
                self.stack_pointer -= 1

            # LABEL func
            if (row["op"] == "LABEL"  or row["op"] == "JUMP" or row["op"] == "RETURN" or
                row["op"] == "WRITEI" or row["op"] == "WRITES"):
                generator.generateUnaryOperation(row["op"], row["o1"])

            # JUMPNZ func, $1
            if row["op"] == "JUMPNZ" or row["op"] == "CALL":
                generator.generateBinaryOperation(row["op"], row["o1"], row["o2"])
                
        print(generator.target_code)
