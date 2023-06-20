package leetcode.java.problems.problem1318;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void testWithRandomNumbers1() {
        Solution obj = new Solution();
        Assertions.assertEquals(3, obj.minFlips(2, 6, 5));
    }

    @Test
    public void testWithRandomNumbers2() {
        Solution obj = new Solution();
        Assertions.assertEquals(1, obj.minFlips(4, 2, 7));
    }

    @Test
    public void testWithNoSwaps() {
        Solution obj = new Solution();
        Assertions.assertEquals(0, obj.minFlips(4, 3, 7));
    }
}
