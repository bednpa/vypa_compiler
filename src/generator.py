class Generator:

    def __init__(self):
        self.target_code = ""
        self.generateHeader()

    def generateHeader(self):
        self.target_code += ("#! /bin/vypint\n"
                             "# VYPcode: 1.0\n"
                             "# Generated by: xbedna73, xgajdo26\n\n"
                             "ALIAS FP $7\n\n"
                             "JUMP main\n\n"
                             ""
<<<<<<< Updated upstream
=======
                             # TODO: Concat, substr, Print
                             # Take c code for those functions and generate code for them
                             # https://www.programmingsimplified.com/c/source-code/c-substring
                             # https://www.geeksforgeeks.org/concatenating-two-strings-in-c/
>>>>>>> Stashed changes
                             "LABEL readInt\n"
                             "ADDI $SP, $SP, 1\n"
                             "SET $FP, $SP\n"
                             "READI $1\n"
                             "SET $SP, $FP\n"
                             "SUBI $SP, $SP, 1\n"
                             "RETURN [$SP]\n\n"
                             ""
                             "LABEL readString\n"
                             "ADDI $SP, $SP, 1\n"
                             "SET $FP, $SP\n"
                             "READS $1\n"
                             "SET $SP, $FP\n"
                             "SUBI $SP, $SP, 1\n"
                             "RETURN [$SP]\n\n"
                             ""
                             "LABEL length\n"
                             "ADDI $SP, $SP, 1\n"
                             "SET $FP, $SP\n"
                             "GETSIZE $1, [$FP - 2]\n"
                             "SET $SP, $FP\n"
                             "SUBI $SP, $SP, 1\n"
                             "RETURN [$SP]\n\n"
<<<<<<< Updated upstream
                             "")
=======
                             ""
                             )
>>>>>>> Stashed changes

    def generateSetNewInt(self):
        self.target_code += "#Set New Int Operation\n"
        self.target_code += "ADDI $SP, $SP, 1\n"
        self.target_code += "SET [$SP], 0\n\n"

    def generateSetNewString(self):
        self.target_code += "CREATE $5, 1\n"
        self.target_code += "SETWORD $5, 0, \"\"\n"
        self.target_code += "GETWORD $5, $5, 0\n"
        self.target_code += "SET [$SP], $5\n"
        self.target_code += "ADDI $SP, $SP, 1\n\n"

    def generateSetInt(self, var, value):
        self.target_code += "SET {}, {}\n".format(var, value)

    def generateSetString(self, var, value):
        self.target_code += "CREATE $5, 1\n"
        self.target_code += "SETWORD $5, 0, \"{}\"\n".format(value)
        self.target_code += "GETWORD $5, $5, 0\n"
        self.target_code += "SET {}, $5\n\n".format(var)

    def generateSetVar(self, position1, position2):
        self.target_code += "SET [$FP + {}], [$FP + {}]\n".format(position1, position2)

    def generateBinaryIntOp(self, op, o1, o2, o3):
        self.target_code += "{} {}, {}, {}\n".format(op, o1, o2, o3)

    def generateSingleIntOp(self, op, o1, o2):
        self.target_code += "{} {}, {}\n".format(op, o1, o2)

    def generatePushInt(self, o1):
        self.target_code += "#Simulate PUSH {}\n".format(o1)
        self.target_code += "ADDI $SP, $SP, 1\n"
        self.target_code += "SET [$SP], {}\n\n".format(o1)

    def generatePop(self, o1):
        self.target_code += "#Simulate POP {}\n".format(o1)
        self.target_code += "SET {}, [$SP]\n".format(o1)
        self.target_code += "SUBI $SP, $SP, 1\n\n"

    def generateLabel(self, o1):
        self.target_code += "LABEL {}\n".format(o1)
        
