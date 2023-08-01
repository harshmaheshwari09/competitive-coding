package leetcode.java.problems.problem0417;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void solutionTest1() {
        Solution sol = new Solution();
        int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        Integer[][] expected = {{0,4}, {1,3}, {1,4}, {2,2},{3,0},{3,1},{4,0}};
        Integer[][] actual = sol.pacificAtlantic(heights).stream()
            .map(rowList -> rowList.toArray(new Integer[0]))
            .toArray(Integer[][]::new);
        Assertions.assertArrayEquals(expected, actual);
    }
}
