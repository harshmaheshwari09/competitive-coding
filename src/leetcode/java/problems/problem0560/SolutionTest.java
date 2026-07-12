package leetcode.java.problems.problem0560;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void solutionTest1() {
        Solution sol = new Solution();
        int[] nums = {1, 1, 1};
        Assertions.assertEquals(2, sol.subarraySum(nums, 2));
    }

    @Test
    public void solutionTest2() {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        Assertions.assertEquals(2, sol.subarraySum(nums, 3));
    }

    @Test
    public void handlesNegativeNumbers() {
        Solution sol = new Solution();
        int[] nums = {1, -1, 0};
        Assertions.assertEquals(3, sol.subarraySum(nums, 0));
    }

    @Test
    public void handlesRepeatedPrefixSums() {
        Solution sol = new Solution();
        int[] nums = {0, 0, 0};
        Assertions.assertEquals(6, sol.subarraySum(nums, 0));
    }
}
