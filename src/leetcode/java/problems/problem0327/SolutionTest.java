package leetcode.java.problems.problem0327;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void solutionTest1() {
        Solution sol = new Solution();
        int[] nums = {-2, 5, -1};
        Assertions.assertEquals(3, sol.countRangeSum(nums, -2, 2));
    }

    @Test
    public void solutionTest2() {
        Solution sol = new Solution();
        int[] nums = {0};
        Assertions.assertEquals(1, sol.countRangeSum(nums, 0, 0));
    }

    @Test
    public void handlesLargePrefixSums() {
        Solution sol = new Solution();
        int[] nums = {-2147483647, 0, -2147483647, 2147483647};
        Assertions.assertEquals(3, sol.countRangeSum(nums, -564, 3864));
    }
}
