package leetcode.java.problems.problem0238;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution solution = new Solution();
        int[] input = {1, 2, 3, 4};
        int[] actual = solution.productExceptSelf(input);
        int[] expected = {24, 12, 8, 6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution2() {
        Solution solution = new Solution();
        int[] input = {-1, 1, 0, -3, 3};
        int[] actual = solution.productExceptSelf(input);
        int[] expected = {0, 0, 9, 0, 0};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution3() {
        Solution solution = new Solution();
        int[] input = {-1, 1, 0, -3, 3, 0};
        int[] actual = solution.productExceptSelf(input);
        int[] expected = {0, 0, 0, 0, 0, 0};
        Assertions.assertArrayEquals(expected, actual);
    }
}
