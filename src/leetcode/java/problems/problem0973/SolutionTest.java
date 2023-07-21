package leetcode.java.problems.problem0973;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        int[][] points = {{1, 3}, {-2, 2}};
        int[][] expected = {{-2, 2}};
        Assertions.assertArrayEquals(expected, sol.kClosest(points, 1));
    }
}
