package leetcode.java.problems.problem0152;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution solution = new Solution();
        int[] nums = {7, -8, 2, 1, 4, 6};
        Assertions.assertEquals(48, solution.maxProduct(nums));
    }
}
