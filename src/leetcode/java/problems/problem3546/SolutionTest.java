package leetcode.java.problems.problem3546;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void testSolution1() {
        Solution solution = new Solution();
        int[][] input = {{1,4},{2,3}};
        boolean actual = solution.canPartitionGrid(input);
        Assertions.assertTrue(actual);
    }

    @Test
    public void testSolution2() {
        Solution solution = new Solution();
        int[][] input = {{1,3},{2,4}};
        boolean actual = solution.canPartitionGrid(input);
        Assertions.assertFalse(actual);
    }
}