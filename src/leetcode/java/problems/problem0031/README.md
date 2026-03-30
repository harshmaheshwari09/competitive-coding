# 31. NEXT PERMUTATION

* Question: https://leetcode.com/problems/next-permutation/
* Solution: [here](Solution.java)
* Tags: #array #two-pointers
* Complexity: Time: O(n), Space: O(1)

## Solution Explanation:

1. Scan from right to left to find the first index `left` such that `nums[left] < nums[left + 1]`. This is the pivot
   where the permutation can be increased.

2. If such a pivot exists, scan again from the right to find the first value greater than `nums[left]`, then swap the
   two elements.

3. Reverse the suffix starting at `left + 1`. Since that suffix was originally in descending order, reversing it makes
   it the smallest possible suffix.

If no pivot exists, the array is already the largest permutation, and reversing the whole array returns the smallest
permutation.
