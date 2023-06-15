#!/bin/bash

if [ $# -ne 1 ]; then
  echo "Please provide an integer as an argument."
  exit 1
fi

cd ~/IdeaProjects/Leetcode/src/leetcode

input=$1
directory_name="problem$input"
mkdir $directory_name

cd $directory_name
echo "package leetcode.$directory_name; public class Solution{}" > Solution.java
echo "package leetcode.$directory_name; public class SolutionTest{}" > SolutionTest.java
