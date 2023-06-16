#!/bin/bash

if [ $# -ne 1 ]; then
  echo "Please provide an integer as an argument."
  exit 1
fi

cd ~/IdeaProjects/Leetcode/src/leetcode

input=$1
paddedNumber=$(printf "%04d" "$input")
directory_name="problem$paddedNumber"
mkdir $directory_name

cd $directory_name
echo "package leetcode.$directory_name; /** ques: tags: complexity: */ public class Solution{}" > Solution.java
echo "package leetcode.$directory_name; import org.junit.jupiter.api.Test; public class SolutionTest{@Test public void testSolution() {}}" > SolutionTest.java
