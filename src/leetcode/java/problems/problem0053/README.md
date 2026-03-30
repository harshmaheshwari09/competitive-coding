# 53. MAXIMUM SUBARRAY

* Question: [LeetCode](https://leetcode.com/problems/maximum-subarray/)
* Solution: [here](Solution.java)
* Tags: #array #dynamic-programming
* Complexity: Time: O(n), Space: O(1)

## Solution Explanation:

1. Track `maxSumSoFar`, the maximum subarray sum that must end at the current index.

2. For each element, either start a new subarray at that element or extend the previous subarray:
   `maxSumSoFar = max(nums[i], maxSumSoFar + nums[i])`.

3. Track `maxSum`, the best value seen anywhere in the array.

This is Kadane's algorithm. It scans the array once, so it runs in `O(n)` time and uses `O(1)` extra space.
