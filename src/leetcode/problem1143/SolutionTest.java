package leetcode.problem1143;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        Assertions.assertEquals(3, sol.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        Assertions.assertEquals(5, sol.longestCommonSubsequence("abcde", "abcde"));
    }

    @Test
    public void testSolution3() {
        Solution sol = new Solution();
        Assertions.assertEquals(0, sol.longestCommonSubsequence("abcde", "xyz"));
    }

    @Test
    public void testSolution4() {
        Solution sol = new Solution();
        Assertions.assertEquals(1, sol.longestCommonSubsequence("bsbininm", "jmjkbkjkv"));
    }
}
