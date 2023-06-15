package leetcode.problem0416;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution1() {
        int[] arr = {1, 5, 11, 5};
        Solution sol = new Solution();
        Assertions.assertTrue(sol.canPartition(arr));
    }

    @Test
    public void testSolution2() {
        int[] arr = {1,2,3,5};
        Solution sol = new Solution();
        Assertions.assertFalse(sol.canPartition(arr));
    }
}
