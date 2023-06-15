package leetcode.problem2673;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        int[] cost = {1, 5, 2, 2, 3, 3, 1};

        Solution solution = new Solution();
        int minCost = solution.minIncrements(7, cost);

        Assertions.assertEquals(6, minCost);
    }

    @Test
    public void testSolution2() {
        int[] tree = {5, 5, 5, 5, 5, 2, 5};

        Solution solution = new Solution();
        int minCost = solution.minIncrements(7, tree);

        Assertions.assertEquals(3, minCost);
    }

    @Test
    public void testSolution3() {
        int[] tree = {10, 20, 30, 40, 50, 60, 70};

        Solution solution = new Solution();
        int minCost = solution.minIncrements(7, tree);

        Assertions.assertEquals(50, minCost);
    }

    @Test
    public void testSolution4() {
        int[] tree = {1, 1, 1};

        Solution solution = new Solution();
        int minCost = solution.minIncrements(3, tree);

        Assertions.assertEquals(0, minCost);
    }

    @Test
    public void testSolution5() {
        int[] tree = {5, 1, 1};

        Solution solution = new Solution();
        int minCost = solution.minIncrements(3, tree);

        Assertions.assertEquals(0, minCost);
    }
}
