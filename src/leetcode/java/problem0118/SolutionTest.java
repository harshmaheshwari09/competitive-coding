package leetcode.java.problem0118;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import leetcode.java.resources.Operations;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        Integer[][] actual = Operations.convertToNestedIntegerArray(sol.generate(5));
        Integer[][] expected = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        Integer[][] actual = Operations.convertToNestedIntegerArray(sol.generate(1));
        Integer[][] expected = {{1}};
        Assertions.assertArrayEquals(expected, actual);
    }
}
