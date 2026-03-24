package leetcode.java.problems.problem2906;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void testWithZeroMod() {
        Solution solution = new Solution();
        int[][] input = {{1,2},{3,4}};
        int[][] actual = solution.constructProductMatrix(input);
        int[][] expected = {{24,12},{8,6}};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWithOneMod() {
        Solution solution = new Solution();
        int[][] input = {{12345},{2},{1}};
        int[][] actual = solution.constructProductMatrix(input);
        int[][] expected = {{2},{0},{0}};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWithMoreThanOneMod() {
        Solution solution = new Solution();
        int[][] input = {{12345},{2},{1}, {12345}};
        int[][] actual = solution.constructProductMatrix(input);
        int[][] expected = {{0},{0},{0}, {0}};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution() {
        Solution solution = new Solution();
        int[][] input = {{3,2,5},{6,4,3},{6,3,1}};
        int[][] actual = solution.constructProductMatrix(input);
        int[][] expected = {{615,922,369},{307,461,615},{307,615,1845}};
        Assertions.assertArrayEquals(expected, actual);
    }
}