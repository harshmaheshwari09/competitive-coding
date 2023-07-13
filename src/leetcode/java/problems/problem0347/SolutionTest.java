package leetcode.java.problems.problem0347;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void solutionTest1() {
        Solution sol = new Solution();
        int[] input = {1,1,1,2,2,3};
        int[] expected = {1, 2};
        Assertions.assertArrayEquals(expected, sol.topKFrequent(input, 2));
    }
}
