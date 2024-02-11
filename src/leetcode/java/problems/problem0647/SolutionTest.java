package leetcode.java.problems.problem0647;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        Assert.assertEquals(3, sol.countSubstrings("abc"));
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        Assert.assertEquals(6, sol.countSubstrings("aaa"));
    }

    @Test
    public void testSolution3() {
        Solution sol = new Solution();
        Assert.assertEquals(6, sol.countSubstrings("abba"));
    }
}
