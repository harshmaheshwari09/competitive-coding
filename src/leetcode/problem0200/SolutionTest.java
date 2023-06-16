package leetcode.problem0200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution1() {
        char[][] inputArray = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        Solution sol = new Solution();
        Assertions.assertEquals(1, sol.numIslands(inputArray));
    }

    @Test
    public void testSolution2() {
        char[][] inputArray = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        Solution sol = new Solution();
        Assertions.assertEquals(3, sol.numIslands(inputArray));
    }
}
