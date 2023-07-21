package leetcode.java.problems.problem0036;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        char[][] board = {
            {'7', '.', '.', '.', '4', '.', '.', '.', '.'},
            {'.', '.', '.', '8', '6', '5', '.', '.', '.'},
            {'.', '1', '.', '2', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '9', '.', '.', '.'},
            {'.', '.', '.', '.', '5', '.', '5', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };
        Assertions.assertFalse(sol.isValidSudoku(board));
    }
}
