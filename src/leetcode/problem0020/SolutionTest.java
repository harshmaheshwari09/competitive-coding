package leetcode.problem0020;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        Assertions.assertTrue(sol.isValid("()"));
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        Assertions.assertTrue(sol.isValid("(){}[]"));
    }

    @Test
    public void testSolution3() {
        Solution sol = new Solution();
        Assertions.assertFalse(sol.isValid("(]"));
    }
}
