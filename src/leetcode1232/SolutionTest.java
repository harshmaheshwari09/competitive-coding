package leetcode1232;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SolutionTest {

    @Test
    public void testWithStraightLine_Success() {
        Solution obj = new Solution();
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        Assertions.assertTrue(obj.checkStraightLine(coordinates));
    }

    @Test
    public void testWithStraightLineWithSomeRandomPoints_Failure() {
        Solution obj = new Solution();
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}, {1, 8}};
        Assertions.assertFalse(obj.checkStraightLine(coordinates));
    }

    @Test
    public void testWithNotStraightLine_Failure() {
        Solution obj = new Solution();
        int[][] coordinates = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        Assertions.assertFalse(obj.checkStraightLine(coordinates));
    }

    @Test
    public void testWithTwoPoint_Success() {
        Solution obj = new Solution();
        int[][] coordinates = {{1, 1}, {2, 2}};
        Assertions.assertTrue(obj.checkStraightLine(coordinates));
    }

    @Test
    public void testWithHorizontalLine_Success() {
        Solution obj = new Solution();
        int[][] coordinates = {{1, 0}, {2, 0}, {0, 0}};
        Assertions.assertTrue(obj.checkStraightLine(coordinates));
    }

    @Test
    public void testWithHorizontalWithSomeRandomPoints_Failure() {
        Solution obj = new Solution();
        int[][] coordinates = {{4, 2}, {4, 3}, {4, 4}, {8, 18}};
        Assertions.assertFalse(obj.checkStraightLine(coordinates));
    }

    @Test
    public void testWithVerticalLine_Success() {
        Solution obj = new Solution();
        int[][] coordinates = {{0, 1}, {0, 0}, {0, -1}};
        Assertions.assertTrue(obj.checkStraightLine(coordinates));
    }

    @Test
    public void testWithVerticalLineWithSomeRandomPoints_Failure() {
        Solution obj = new Solution();
        int[][] coordinates = {{2, 4}, {3, 4}, {5, 4}, {3, 8}};
        Assertions.assertFalse(obj.checkStraightLine(coordinates));
    }
}
