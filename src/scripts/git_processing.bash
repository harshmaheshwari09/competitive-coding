#!/bin/bash

if [ $# -ne 1 ]; then
  echo "Please provide an integer as an argument."
  exit 1
fi

input=$1
paddedNumber=$(printf "%04d" "$input")

# Adding staged files
git add ~/IdeaProjects/Leetcode/src/

# Commit the changes
commit_message="adding sol for problem #$paddedNumber"
git commit -am "$commit_message"

# Push the changes
git push

