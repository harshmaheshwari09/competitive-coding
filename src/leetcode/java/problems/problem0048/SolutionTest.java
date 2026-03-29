package leetcode.java.problems.problem0048;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        int[][] actual = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Solution sol = new Solution();
        sol.rotate(actual);
        int[][] expected = {
            {7, 4, 1},
            {8, 5, 2},
            {9, 6, 3}
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution2() {
        int[][] actual = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };
        Solution sol = new Solution();
        sol.rotate(actual);
        int[][] expected = {
            {15, 13, 2, 5},
            {14, 3, 4, 1},
            {12, 6, 8, 9},
            {16, 7, 10, 11}
        };
        Assertions.assertArrayEquals(expected, actual);
    }
}
