package leetcode1351;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        int i = grid.length - 1;
        int j = 0;
        while (i >= 0 && j < grid[0].length) {
            if (grid[i][j] < 0) {
                ans += grid[0].length - j;
                i--;
            } else {
                j++;
            }
        }
        return ans;
    }
}
