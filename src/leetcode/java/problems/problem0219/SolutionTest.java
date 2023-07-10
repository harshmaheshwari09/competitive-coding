package leetcode.java.problems.problem0219;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution1() {
        Solution solution = new Solution();
        int[] input = {1,2,3,1,2,3};
        Assertions.assertFalse(solution.containsNearbyDuplicate(input, 2));
    }
}
