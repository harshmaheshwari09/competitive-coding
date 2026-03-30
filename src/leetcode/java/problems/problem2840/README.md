# 2840. CHECK IF STRINGS CAN BE MADE EQUAL WITH OPERATIONS II

* Question: [LeetCode](https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-ii/description/)
* Solution: [here](Solution.java)
* Testing: [here](SolutionTest.java)
* Tags: #hash-table #string #sorting
* Complexity: Time: O(n), Space: O(1)

## Solution Explanation:

1. Characters can only be swapped with other characters at positions of the same parity, so even indices stay within
   the even group and odd indices stay within the odd group.

2. Count the frequency of each character at even positions and odd positions in `s1`.

3. Subtract the corresponding frequencies from `s2`.

4. If every frequency returns to zero, the two strings can be made equal. Otherwise, they cannot.

The algorithm scans both strings once. Since the alphabet size is fixed at 26 lowercase letters, the extra space is
`O(1)`.
