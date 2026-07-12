# 327. COUNT OF RANGE SUM

* Question: https://algomaster.io/learn/dsa/count-of-range-sum
* LeetCode: https://leetcode.com/problems/count-of-range-sum/
* Solution: [here](Solution.java)
* Tags: #prefix_sum #merge_sort #divide_and_conquer #binary_indexed_tree
* Complexity: Time: O(n log n), Space: O(n)

## Problem

Given an integer array `nums` and two integers `lower` and `upper`, return the number of range sums that lie in the inclusive interval `[lower, upper]`.

A range sum is the sum of elements from index `i` through index `j`, where `0 <= i <= j < nums.length`.

## Examples

### Example 1

```text
Input: nums = [-2,5,-1], lower = -2, upper = 2
Output: 3
Explanation: The valid ranges are [0,0], [2,2], and [0,2].
```

### Example 2

```text
Input: nums = [0], lower = 0, upper = 0
Output: 1
```

## Constraints

```text
1 <= nums.length <= 100000
-2147483648 <= nums[i] <= 2147483647
-100000 <= lower <= upper <= 100000
```
