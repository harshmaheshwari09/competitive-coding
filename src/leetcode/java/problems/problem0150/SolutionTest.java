package leetcode.java.problems.problem0150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        String[] tokens = {"4","13","5","/","+"};
        Assertions.assertEquals(6, sol.evalRPN(tokens));
    }
}
