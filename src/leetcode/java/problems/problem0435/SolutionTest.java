package leetcode.java.problems.problem0435;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        Assertions.assertEquals(1, sol.eraseOverlapIntervals(intervals));
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        int[][] intervals = {{1, 2}, {1, 2}, {1, 2}};
        Assertions.assertEquals(2, sol.eraseOverlapIntervals(intervals));
    }
}
