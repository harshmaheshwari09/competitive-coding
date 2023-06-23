# 31. NEXT PERMUTATION

* Question: https://leetcode.com/problems/next-permutation/
* Solution: [here](Solution.java)
* Testing: [here](SolutionTest.java)
* Tags: #array
* Complexity: Time: O(n), Space: O(1)

## Solution Explaination

1) Find the first index left from the right side of the array where nums[left] < nums[left + 1]. This step identifies
   the first element that can be swapped to generate the next permutation.

2) If left is found, find the first index right from the right side of the array where nums[right] > nums[left]. This
   step finds the smallest element larger than nums[left] in the suffix to be swapped.

3) Swap the elements at indices left and right.

4) Reverse the elements starting from index left + 1 to the end of the array. This step ensures that the suffix is in
   the smallest possible lexicographic order.