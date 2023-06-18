package leetcode.java.problem0994;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        int[][] matrix = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        Assertions.assertEquals(4, sol.orangesRotting(matrix));
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        int[][] matrix = {
            {2, 1, 1},
            {0, 1, 1},
            {1, 0, 1}
        };
        Assertions.assertEquals(-1, sol.orangesRotting(matrix));
    }

    @Test
    public void testSolution3() {
        Solution sol = new Solution();
        int[][] matrix = {{2, 0}};
        Assertions.assertEquals(0, sol.orangesRotting(matrix));
    }

    @Test
    public void testSolution4() {
        Solution sol = new Solution();
        int[][] matrix = {{1, 0}};
        Assertions.assertEquals(-1, sol.orangesRotting(matrix));
    }

    @Test
    public void testSolution5() {
        Solution sol = new Solution();
        int[][] matrix = {{0, 0}};
        Assertions.assertEquals(0, sol.orangesRotting(matrix));
    }
}
