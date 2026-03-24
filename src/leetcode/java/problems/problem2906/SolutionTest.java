package leetcode.java.problems.problem2906;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void testSolution1() {
        Solution solution = new Solution();
        int[][] input = {{1,2},{3,4}};
        int[][] actual = solution.constructProductMatrix(input);
        int[][] expected = {{24,12},{8,6}};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution2() {
        Solution solution = new Solution();
        int[][] input = {{12345},{2},{1}};
        int[][] actual = solution.constructProductMatrix(input);
        int[][] expected = {{2},{0},{0}};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution3() {
        Solution solution = new Solution();
        int[][] input = {{12345},{2},{1}, {12345}};
        int[][] actual = solution.constructProductMatrix(input);
        int[][] expected = {{0},{0},{0}, {0}};
        Assertions.assertArrayEquals(expected, actual);
    }
}