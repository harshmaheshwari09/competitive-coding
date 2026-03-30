package leetcode.java.problems.problem2840;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        boolean actual = sol.checkStrings("abcdba", "cabdab");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        boolean actual = sol.checkStrings("abe", "bea");
        Assertions.assertFalse(actual);
    }

    @Test
    public void testSolution3() {
        Solution sol = new Solution();
        boolean actual = sol.checkStrings("kvwdssgl", "wskxsdgv");
        Assertions.assertFalse(actual);
    }
}
