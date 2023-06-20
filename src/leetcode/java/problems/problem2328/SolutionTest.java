package leetcode.java.problems.problem2328;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testSolution1() {
        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };

        int result = solution.countPaths(grid);
        Assertions.assertEquals(22, result);
    }
}
