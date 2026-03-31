package leetcode.java.problems.problem2965;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        int[][] grid = {
            {1, 3},
            {2, 2}
        };

        Solution sol = new Solution();
        int[] actual = sol.findMissingAndRepeatedValues(grid);

        Assertions.assertArrayEquals(new int[]{2, 4}, actual);
    }

    @Test
    public void testSolution2() {
        int[][] grid = {
            {9, 1, 7},
            {8, 9, 2},
            {3, 4, 6}
        };

        Solution sol = new Solution();
        int[] actual = sol.findMissingAndRepeatedValues(grid);

        Assertions.assertArrayEquals(new int[]{9, 5}, actual);
    }
}
