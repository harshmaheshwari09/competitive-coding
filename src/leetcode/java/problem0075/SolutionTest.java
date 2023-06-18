package leetcode.java.problem0075;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SolutionTest {
    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        int[] input = {2, 0, 2, 1, 1, 0};
        sol.sortColors(input);
        int[] expected = {0, 0, 1, 1, 2, 2};
        Assertions.assertArrayEquals(expected, input);
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        int[] input = {2, 0, 1};
        sol.sortColors(input);
        int[] expected = {0, 1, 2};
        Assertions.assertArrayEquals(expected, input);
    }
}
