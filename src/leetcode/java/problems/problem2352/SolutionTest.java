package leetcode.java.problems.problem2352;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        int[][] grid = {
            {3, 2, 1},
            {1, 7, 6},
            {2, 7, 7}
        };
        Assertions.assertEquals(1, sol.equalPairs(grid));
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        int[][] grid = {
            {3, 1, 2, 2},
            {1, 4, 4, 5},
            {2, 4, 2, 2},
            {2, 4, 2, 2}
        };
        Assertions.assertEquals(3, sol.equalPairs(grid));
    }

    @Test
    public void testSolution3() {
        Solution sol = new Solution();
        int[][] grid = {
            {1, 2, 3, 4, 5, 6, 7, 8},
            {2, 4, 6, 8, 10, 12, 14, 16},
            {3, 6, 9, 12, 15, 18, 21, 24},
            {4, 8, 12, 16, 20, 24, 28, 32},
            {5, 10, 15, 20, 25, 30, 35, 40},
            {6, 12, 18, 24, 30, 36, 42, 48},
            {7, 14, 21, 28, 35, 42, 49, 56},
            {8, 16, 24, 32, 40, 48, 56, 64}
        };
        Assertions.assertEquals(8, sol.equalPairs(grid));
    }

    @Test
    public void testSolution4() {
        Solution sol = new Solution();
        int[][] grid = {
            {11, 1},
            {1, 11}
        };
        Assertions.assertEquals(2, sol.equalPairs(grid));
    }

    @Test
    public void testSolution5() {
        Solution sol = new Solution();
        int[][] grid = {
            {11, 11},
            {11, 11}
        };
        Assertions.assertEquals(4, sol.equalPairs(grid));
    }
}