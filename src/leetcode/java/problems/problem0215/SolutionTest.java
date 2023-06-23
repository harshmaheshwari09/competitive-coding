package leetcode.java.problems.problem0215;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testMinHeapSolution() {
        int[] arr = {3, 2, 1 , 5, 6, 4};
        MinHeapApproach sol = new MinHeapApproach();
        Assertions.assertEquals(5, sol.findKthLargest(arr, 2));
    }

    @Test
    public void testQuickSelectSolution() {
        int[] arr = {3, 2, 1 , 5, 6, 4};
        QuickSelectApproach sol = new QuickSelectApproach();
        Assertions.assertEquals(5, sol.findKthLargest(arr, 2));
    }
}
