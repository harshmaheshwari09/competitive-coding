package leetcode.java.problems.problem0050;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        double actual = sol.myPow(2.00000, 10);
        Assertions.assertEquals(1024.00000, actual, 1e-5);
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        double actual = sol.myPow(2.10000, 3);
        Assertions.assertEquals(9.26100, actual, 1e-5);
    }

    @Test
    public void testSolution3() {
        Solution sol = new Solution();
        double actual = sol.myPow(2.00000, -2);
        Assertions.assertEquals(0.25000, actual, 1e-5);
    }
}
