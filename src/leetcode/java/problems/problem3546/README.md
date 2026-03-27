# 3546. Equal Sum Grid Partition I

## Description

You are given an `m x n` matrix `grid` of positive integers. Your task is to determine if it is possible to make either one horizontal or one vertical cut on the grid such that:

- Each of the two resulting sections formed by the cut is non-empty.
- The sum of the elements in both sections is equal.

Return `true` if such a partition exists; otherwise return `false`.

## Examples

### Example 1

**Input:** grid = [[1,4],[2,3]]  
**Output:** true  

**Explanation:**  
A horizontal cut between row 0 and row 1 results in two non-empty sections, each with a sum of 5. Thus, the answer is `true`.

### Example 2

**Input:** grid = [[1,3],[2,4]]  
**Output:** false  

**Explanation:**  
No horizontal or vertical cut results in two non-empty sections with equal sums. Thus, the answer is `false`.

## Constraints

- `1 <= m == grid.length <= 10^5`
- `1 <= n == grid[i].length <= 10^5`
- `2 <= m * n <= 10^5`
- `1 <= grid[i][j] <= 10^5`

## Solution Approach

1. Compute the total sum of the grid.
2. If `totalSum` is odd, return `false` (cannot split into equal halves).
3. Compute `halfSum = totalSum / 2`.
4. Check horizontal cuts in one pass:
   - Maintain `sum` (no extra array) and add row values to it during row traversal.
   - For each row `i` from `0` to `m-2`, do `sum += sum(row i)` and check `if sum == halfSum`.
   - If true, return `true`.
5. Check vertical cuts in one pass:
   - Reset `sum = 0`, then for each column `j` from `0` to `n-2`, do `sum += sum(column j)` while traversing rows.
   - If `sum == halfSum`, return `true`.
6. Otherwise return `false`.

## Complexity

- Time: O(m * n)
- Space: O(1)

## Topics

- Array
- Matrix
- Enumeration
- Running Sum
* Testing: [here](SolutionTest.java)
