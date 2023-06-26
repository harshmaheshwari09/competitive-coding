# 130. SURROUNDED REGIONS

* Question: https://leetcode.com/problems/surrounded-regions
* Solution: [here](Solution.java)
* Tags: #graph
* Complexity: Time: O(n^2), Space: O(1)

## Approach

The algorithm follows these steps:

1. Iterate over the boundary cells of the board. If the current boundary cell is 'O', mark it as 'B' and perform a
   depth-first search (DFS) on its four neighbors.
2. During the DFS, for each neighbor that is 'O', mark it as 'B' and recursively perform DFS on its neighbors.
3. After the DFS is complete, iterate over the entire board. Mark any remaining 'O' cells as 'X' and any 'B' cells as '
   O'.