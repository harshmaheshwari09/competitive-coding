package leetcode.java.problems.problem0207;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        int[][] preq = {};
        Solution sol = new Solution();
        Assertions.assertTrue(sol.canFinish(2, preq));
    }
}
