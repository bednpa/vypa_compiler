#!/bin/bash

echo "Running available tests ..."
echo "*********************************"
for filename in ./tests/*.in; do
    echo "test name:" $filename
    line=$(head -n 1 $filename)
    echo "description: ${line:2}"
    echo "- - - - - - - - - - - - - - - - -"
    python3.8 ./src/main.py $filename
    echo "*********************************"
done