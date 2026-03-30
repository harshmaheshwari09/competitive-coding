package leetcode.java.problems.problem0088;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        Solution sol = new Solution();
        sol.merge(nums1, 3, nums2, 3);

        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void testSolution2() {
        int[] nums1 = {1};
        int[] nums2 = {};

        Solution sol = new Solution();
        sol.merge(nums1, 1, nums2, 0);

        Assertions.assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testSolution3() {
        int[] nums1 = {0};
        int[] nums2 = {1};

        Solution sol = new Solution();
        sol.merge(nums1, 0, nums2, 1);

        Assertions.assertArrayEquals(new int[]{1}, nums1);
    }
}
