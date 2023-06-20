package leetcode.java.problems.problem1732;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    Solution obj = new Solution();

    @Test
    public void testSolution1() {
        int[] gain1 = {-5, 1, 5, -2, 3};
        int expected1 = 2;
        int result1 = obj.largestAltitude(gain1);
        Assertions.assertEquals(expected1, result1);
    }

    @Test
    public void testSolution2() {
        int[] gain1 = {-4,-3,-2,-1,4,3,2};
        int expected1 = 0;
        int result1 = obj.largestAltitude(gain1);
        Assertions.assertEquals(expected1, result1);
    }
}
