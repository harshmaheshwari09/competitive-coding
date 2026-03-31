# 2965. FIND MISSING AND REPEATED VALUES

* Question: [LeetCode](https://leetcode.com/problems/find-missing-and-repeated-values/description/)
* Solution: [here](Solution.java)
* Testing: [here](SolutionTest.java)
* Tags: #array #math #matrix
* Complexity: Time: O(n^2), Space: O(1)

## Solution Explanation:

1. Let the repeated number be `a` and the missing number be `b`.

2. Compute the expected sum and expected sum of squares for all numbers from `1` to `n^2`.

3. Subtract every value in the grid from those totals:
   after this, `sumDiff = b - a` and `sumSqDiff = b^2 - a^2`.

4. Use the identity `b^2 - a^2 = (b - a)(b + a)` to recover `b + a` from:
   `sumSqDiff / sumDiff`.

5. Solve the two equations to get:
   `a = ( (b + a) - (b - a) ) / 2`
   and
   `b = a + (b - a)`.

The grid is scanned once, so the runtime is `O(n^2)`, and only a few variables are used, so the extra space is
`O(1)`.
