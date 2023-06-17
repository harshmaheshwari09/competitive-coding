package leetcode.problem0322;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        int coins[] = new int[]{1, 2, 5};
        Assertions.assertEquals(3, sol.coinChange(coins, 11));
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        int coins[] = new int[]{2};
        Assertions.assertEquals(-1, sol.coinChange(coins, 3));
    }

    @Test
    public void testSolution3() {
        Solution sol = new Solution();
        int coins[] = new int[]{1};
        Assertions.assertEquals(0, sol.coinChange(coins, 0));
    }
}
