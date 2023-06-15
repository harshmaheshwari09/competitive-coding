package leetcode.problem0072;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        Assertions.assertEquals(3, sol.minDistance("horse", "ros"));
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        Assertions.assertEquals(5, sol.minDistance("intention", "execution"));
    }
}
