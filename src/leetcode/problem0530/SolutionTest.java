package leetcode.problem0530;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import resources.TreeNode;

public class SolutionTest {

    @Test
    public void testSolution1() {
        int[] arr = {4, 2, 6, 1, 3};
        TreeNode root = TreeNode.arrayToTree(arr);
        Solution sol = new Solution();
        Assertions.assertEquals(1, sol.getMinimumDifference(root));
    }

    @Test
    public void testSolution2() {
        int[] arr = {1, 0, 48, -1, -1, 12, 49};
        TreeNode root = TreeNode.arrayToTree(arr);
        Solution sol = new Solution();
        Assertions.assertEquals(1, sol.getMinimumDifference(root));
    }

    @Test
    public void testSolution3() {
        int[] arr = {1, 0, 48, 0, -1, 12, 49};
        TreeNode root = TreeNode.arrayToTree(arr);
        Solution sol = new Solution();
        Assertions.assertEquals(0, sol.getMinimumDifference(root));
    }
}
