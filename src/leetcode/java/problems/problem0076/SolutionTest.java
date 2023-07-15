package leetcode.java.problems.problem0076;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        String s = "ADOBECODEBANC", t = "ABC", expected = "BANC";
        Assertions.assertEquals(expected, sol.minWindow(s, t));

    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        String s = "a", t = "aa", expected = "";
        Assertions.assertEquals(expected, sol.minWindow(s, t));

    }

    @Test
    public void testSolution3() {
        Solution sol = new Solution();
        String s = "abbbbbbbba", t = "aa", expected = "abbbbbbbba";
        Assertions.assertEquals(expected, sol.minWindow(s, t));

    }
}
