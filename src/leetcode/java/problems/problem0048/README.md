# 48. ROTATE IMAGE

* Question: https://leetcode.com/problems/rotate-image/description/
* Solution: [here](Solution.java)
* Testing: [here](SolutionTest.java)
* Tags: #array #math #matrix
* Complexity: Time: O(n^2), Space: O(1)

## Solution Explanation:

1. Reverse every row of the matrix in-place. This mirrors the matrix horizontally.

2. Swap elements across the secondary diagonal, from the top-right to the bottom-left. This finishes the clockwise
   rotation without using any extra matrix.

3. Return implicitly by mutating the original `matrix`.

Because each cell is visited a constant number of times, the total time complexity is `O(n^2)` and the extra space is
`O(1)`.
