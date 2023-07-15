package leetcode.java.problems.problem0084;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void solutionTest1() {
        Solution sol = new Solution();
        int[] heights = {1, 1};
        Assertions.assertEquals(2, sol.largestRectangleArea(heights));
    }

    @Test
    public void solutionTest2() {
        Solution sol = new Solution();
        int[] heights = {4, 1};
        Assertions.assertEquals(4, sol.largestRectangleArea(heights));
    }
}
