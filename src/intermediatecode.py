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
JUMPIFEQ, o1, o2, o3    - Jump to label o1 if o2 == o3
JUMPIFNEQ, o1, o2, o3   - Jump to label o1 if o2 != o3

LABEL, o1               - Define label o1
CALL, o1                - Call function o1
RETURN                  - Return from function

WRITE, o1               - Write value o1 to stdout
CONCAT, o1, o1, o2      - Concatenate o1 and o2 and store the result into o1
STRLEN, o1, o1          - Get length of string o1 and store the result into o1
GETCHAR, o1, o1, o2     - Get character at index o2 from string o1 and store the result into o1
SETCHAR, o1, o1, o2     - Set character at index o2 from string o1 to value o3
TYPE, o1, o1            - Get type of variable o1 and store the result into o1
EXIT, o1                - Exit the program with return code o1
DPRINT, o1              - Print value o1 to stderr
BREAK                   - Breakpoint


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

    def addFunctionDefinitionCode(self, o1):
        self.addCode(self, "LABEL", o1)
        self.addCode(self, "PUSHI", "$FP")
        self.addCode(self, "ADD", "$SP", "$SP", 1)

    def addVarDeclaration(self, o1, o2):
        self.addCode(self, "SET", "o1", "o2")


    

    
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
        for row in self.code:

            if row["op"] == "SET":
                if row["o1"] in self.address_dict:
                    row["o1"] = self.getAddress(row["o1"])

                    if row["o2"][0] == "s":
                        #TODO: Generate set for string in target code
                        pass
                    if row["o2"][0] == "i":
                        #TODO: Generate set for integer in target code
                        pass
                    if row["o2"][0] == "v":
                        #TODO: Generate set for variable in target code
                        # Get value from address using []
                        pass
                else:
                    #Create a new variable - push it to the stack
                    self.setAddress(row["op"], self.stack_pointer)
         
                    if row["o2"][0] == "s":
                        #TODO: Generate push for string in target code
                        pass
                    if row["o2"][0] == "i":
                        #TODO: Generate push for integer in target code
                        pass
                    if row["o2"][0] == "v":
                        #TODO: Generate push for variable in target code
                        # Get value from address using []
                        pass


    
