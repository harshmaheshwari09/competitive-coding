# 74. SEARCH A 2D MATRIX

* Question: https://leetcode.com/problems/search-a-2d-matrix/
* Solution: [here](Solution.java)
* Tags: #array #binary-search #matrix
* Complexity: Time: O(log(m * n)), Space: O(1)

## Solution Explanation:

1. Treat the matrix as if it were a single sorted array of length `m * n`.

2. Run binary search on the virtual index range `[0, m * n - 1]`.

3. Convert each midpoint index back into matrix coordinates using:
   `row = mid / n` and `col = mid % n`.

4. Compare `matrix[row][col]` with `target` and move the binary-search boundaries accordingly.

Because each step cuts the search space in half and uses only a few variables, the solution runs in
`O(log(m * n))` time with `O(1)` extra space.
