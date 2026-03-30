# 1. TWO SUM

* Question: https://leetcode.com/problems/two-sum/
* Solution: [here](Solution.java)
* Tags: #array #hash-table
* Complexity: Time: O(n), Space: O(n)

## Solution Explanation:

1. Iterate through the array once while storing previously seen numbers in a hash map from value to index.

2. For each number `nums[idx]`, compute its complement `target - nums[idx]`.

3. If the complement is already in the map, return the stored index together with the current index.

4. Otherwise store the current number and its index in the map and continue.

The hash map makes each lookup constant time on average, so the full solution runs in `O(n)` time and uses `O(n)`
extra space.
