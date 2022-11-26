#!/bin/bash

echo "********************************"
for filename in ./tests/*.in; do
    echo "test name:" $filename
    python3.8 ./src/main.py $filename
    echo "********************************"
done