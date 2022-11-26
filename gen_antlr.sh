#!/bin/bash

antlr4 -Dlanguage=Python3 vypa.g4 -visitor -o src/from_antlr