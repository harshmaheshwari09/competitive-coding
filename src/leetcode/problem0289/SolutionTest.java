package leetcode.problem0289;

import org.junit.jupiter.api.Test;
import resources.ValidationMethods;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        int[][] actual = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };
        sol.gameOfLife(actual);
        int[][] expected = {
            {0, 0, 0},
            {1, 0, 1},
            {0, 1, 1},
            {0, 1, 0}
        };
        ValidationMethods.validateMatrices(expected, actual);
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        int[][] actual = {
            {1, 1},
            {1, 0}
        };
        sol.gameOfLife(actual);
        int[][] expected = {
            {1, 1},
            {1, 1}
        };
        ValidationMethods.validateMatrices(expected, actual);
    }
}