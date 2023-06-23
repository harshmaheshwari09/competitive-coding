#!/bin/bash

url="$1"
number=$2

# Extract the last part of the URL as the filename
filename=$(basename "$url")

# Remove any file extension from the filename
filename="${filename%.*}"

# Replace dashes with spaces
filename="${filename//-/ }"

# Convert the filename parts to have the first letter uppercase and the rest lowercase
filename=$(echo "$filename" | awk '{ for (i=1; i<=NF; i++) $i=tolower(substr($i,1,1)) substr($i,2) } 1' | tr '[:lower:]' '[:upper:]')

# Create the final filename in the format: "$number. UPPERCASE(str).md"
file_name="$number. $filename.md"

# Create the contents of the file
file_contents="$url\n$number"


cd ~/IdeaProjects/competitive-coding/src/leetcode/java/problems/

paddedNumber=$(printf "%04d" "$number")
directory_name="problem$paddedNumber"
mkdir $directory_name

cd $directory_name
echo -e "# $number. $filename\n\n* Question: $url \n* Solution: [here](Solution.java) \n* Testing: [here](SolutionTest.java) \n* Tags: # \n* Complexity: " > "$file_name"
echo -e "# $number. $filename\n\n* Question: $url \n* Solution: [here](Solution.java) \n* Testing: [here](SolutionTest.java) \n* Tags: # \n* Complexity: " > README.md
echo -e "package leetcode.java.problems.$directory_name; /** Ques: $url \nTags: # \nComplexity: Time: , Space:*/ public class Solution{}" > Solution.java
#echo -e "package leetcode.java.problems.$directory_name; import org.junit.jupiter.api.Test; public class SolutionTest{@Test public void testSolution1() {}}" > SolutionTest.java
