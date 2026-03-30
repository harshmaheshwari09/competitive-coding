# 88. MERGE SORTED ARRAY

* Question: [LeetCode](https://leetcode.com/problems/merge-sorted-array/description/)
* Solution: [here](Solution.java)
* Testing: [here](SolutionTest.java)
* Tags: #array #two-pointers #sorting
* Complexity: Time: O(m + n), Space: O(1)

## Solution Explanation:

1. Start from the end of both valid ranges: `i = m - 1` for `nums1` and `j = n - 1` for `nums2`.

2. Fill `nums1` from the back using `k = m + n - 1`, always placing the larger of `nums1[i]` and `nums2[j]`.

3. Move the corresponding pointer backward after each placement.

4. If elements remain in `nums2`, copy them into the front of `nums1`. Remaining elements in `nums1` are already in
   the correct place.

This avoids shifting elements and performs the merge in-place, giving `O(m + n)` time and `O(1)` extra space.
