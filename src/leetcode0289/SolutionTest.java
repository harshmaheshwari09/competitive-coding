package leetcode0289;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        validate(expected, actual);
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
        validate(expected, actual);
    }

    public void validate(int[][] expected, int[][] actual) {
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[0].length; j++) {
                Assertions.assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }
}