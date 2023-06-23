package leetcode.java.problems.problem0151;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        Assertions.assertEquals("blue is sky the", sol.reverseWords("the sky is blue"));
    }
}
