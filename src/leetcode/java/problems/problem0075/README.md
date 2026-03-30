# 75. SORT COLORS

* Question: [LeetCode](https://leetcode.com/problems/sort-colors/)
* Solution: [here](Solution.java)
* Testing: [here](SolutionTest.java)
* Tags: #array #two-pointers #sorting
* Complexity: Time: O(n), Space: O(1)

## Solution Explanation:

1. Maintain three regions using pointers:
   `zeroPtr` for the next position of `0`,
   `onePtr` for the current element being examined,
   and `twoPtr` for the next position of `2`.

2. If the current value is `0`, swap it to the front and advance both `zeroPtr` and `onePtr`.

3. If the current value is `1`, it is already in the correct middle region, so just advance `onePtr`.

4. If the current value is `2`, swap it with the value at `twoPtr` and shrink the right region. Do not advance
   `onePtr` yet, because the swapped-in value still needs to be examined.

This is the Dutch National Flag algorithm. It processes each element at most a constant number of times, so it runs in
`O(n)` time and uses `O(1)` extra space.
