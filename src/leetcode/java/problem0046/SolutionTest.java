package leetcode.java.problem0046;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import leetcode.java.model.Operations;

public class SolutionTest {
    @Test
    public void testSolution1() {
        int[] input = {1, 2, 3};
        Solution sol = new Solution();
        Integer[][] actual = Operations.convertToNestedIntegerArray(sol.permute(input));
        Integer[][] expected = {{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 2, 1}, {3, 1, 2}};
        Assertions.assertArrayEquals(expected, actual);
    }
}
