package leetcode.java.problems.problem0846;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        int input[] = {1, 1, 2, 2, 3, 3};
        Assertions.assertTrue(sol.isNStraightHand(input, 3));
    }
}
