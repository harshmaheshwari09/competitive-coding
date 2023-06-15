#!/bin/bash

if [ $# -ne 1 ]; then
  echo "Please provide an integer as an argument."
  exit 1
fi

input=$1

# Adding staged files
git add leetcode*
git add scripts

# Commit the changes
commit_message="adding sol for $input"
git commit -am "$commit_message"

# Push the changes
git push

