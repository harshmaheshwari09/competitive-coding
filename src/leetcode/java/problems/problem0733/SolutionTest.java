package leetcode.java.problems.problem0733;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final static Solution solution = new Solution();

    @Test
    public void testSolution1() {
        int[][] input = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] expected = {{2,2,2},{2,2,0},{2,0,1}};
        Assertions.assertArrayEquals(expected, solution.floodFill(input, 1, 1, 2));
    }
}
