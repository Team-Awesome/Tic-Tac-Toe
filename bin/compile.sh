#!/bin/bash
if [ ! -d classes ]; then 
  mkdir classes 
fi
javac src/main/java/*.java -d classes

