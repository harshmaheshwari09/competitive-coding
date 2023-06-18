package leetcode.java.problem1351;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SolutionTest {

    @Test
    public void testWithFewPositiveAndNegative() {
        Solution obj = new Solution();
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        Assertions.assertEquals(8, obj.countNegatives(grid));
    }

    @Test
    public void testWithAllPositive() {
        Solution obj = new Solution();
        int[][] grid = {{3, 2}, {1, 0}};
        Assertions.assertEquals(0, obj.countNegatives(grid));
    }

    @Test
    public void testWithAllNegative() {
        Solution obj = new Solution();
        int[][] grid = {{-3, -2}, {-10, -12}};
        Assertions.assertEquals(4, obj.countNegatives(grid));
    }
}
