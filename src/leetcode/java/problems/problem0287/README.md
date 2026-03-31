# 287. FIND THE DUPLICATE NUMBER

* Question: [LeetCode](https://leetcode.com/problems/find-the-duplicate-number/)
* Solution: [here](Solution.java)
* Tags: #array #two-pointers #linked-list
* Complexity: Time: O(n), Space: O(1)

## Solution Explanation:

1. Treat each index as a node and `nums[i]` as the next pointer. Because one value is duplicated, this mapping creates
   a cycle.

2. Use Floyd's cycle detection algorithm:
   move `slow` by one step and `fast` by two steps until they meet inside the cycle.

3. Reset `slow` to the start and move both pointers one step at a time.

4. The position where they meet again is the duplicate value.

This avoids modifying the array and uses only constant extra space, while still finishing in `O(n)` time.
