package leetcode.java.problem0909;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        int[][] board = {
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 35, -1, -1, 13, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 15, -1, -1, -1, -1}
        };
        Solution sol = new Solution();
        Assertions.assertEquals(4, sol.snakesAndLadders(board));
    }

    @Test
    public void testSolution2() {
        int[][] board = {
            {-1, -1},
            {-1, 3}
        };
        Solution sol = new Solution();
        Assertions.assertEquals(1, sol.snakesAndLadders(board));
    }

    @Test
    public void testSolution3() {
        int[][] board = {
            {1, 1, -1},
            {1, 1, 1},
            {-1, 1, 1}
        };
        Solution sol = new Solution();
        Assertions.assertEquals(-1, sol.snakesAndLadders(board));
    }

    @Test
    public void testSolution4() {
        int[][] board = {
            {-1, 83, -1, 46, -1, -1, -1, -1, 40, -1},
            {-1, 29, -1, -1, -1, 51, -1, 18, -1, -1},
            {-1, 35, 31, 51, -1, 6, -1, 40, -1, -1},
            {-1, -1, -1, 28, -1, 36, -1, -1, -1, -1},
            {-1, -1, -1, -1, 44, -1, -1, 84, -1, -1},
            {-1, -1, -1, 31, -1, 98, 27, 94, 74, -1},
            {4, -1, -1, 46, 3, 14, 7, -1, 84, 67},
            {-1, -1, -1, -1, 2, 72, -1, -1, 86, -1},
            {-1, 32, -1, -1, -1, -1, -1, -1, -1, 19},
            {-1, -1, -1, -1, -1, 72, 46, -1, 92, 6}
        };
        Solution sol = new Solution();
        Assertions.assertEquals(3, sol.snakesAndLadders(board));
    }

    @Test
    public void testWithNotSuccess() {
        int[][] board = {
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 35, -1, -1, 13, -1},
            {1, -1, -1, -1, -1, 1},
            {1, 1, 1, 1, 1, 1}
        };
        Solution sol = new Solution();
        Assertions.assertEquals(-1, sol.snakesAndLadders(board));
    }

    @Test
    public void testWithSnakeAtEnd() {
        int[][] board = {
            {1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 30, -1, -1, 13, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 15, -1, -1, -1, -1}
        };
        Solution sol = new Solution();
        Assertions.assertEquals(4, sol.snakesAndLadders(board));
    }
}
