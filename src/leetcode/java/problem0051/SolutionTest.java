package leetcode.java.problem0051;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import leetcode.java.resources.Operations;

public class SolutionTest {
    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        String[][] actual = Operations.convertToNestedStringArray(sol.solveNQueens(4));
        String[][] expected = {{".Q..","...Q","Q...","..Q."}, {"..Q.","Q...","...Q",".Q.."}};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        String[][] actual = Operations.convertToNestedStringArray(sol.solveNQueens(1));
        String[][] expected = {{"Q"}};
        Assertions.assertArrayEquals(expected, actual);
    }
}
