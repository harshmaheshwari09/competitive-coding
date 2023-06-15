package leetcode.problem0073;

import org.junit.jupiter.api.Test;
import resources.ValidationMethods;

public class SolutionTest {

    @Test
    public void testSolution1() {
        int[][] actual = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        Solution sol = new Solution();
        sol.setZeroes(actual);
        int[][] expected = {
            {1, 0, 1},
            {0, 0, 0},
            {1, 0, 1}
        };
        ValidationMethods.validateMatrices(expected, actual);
    }
}
