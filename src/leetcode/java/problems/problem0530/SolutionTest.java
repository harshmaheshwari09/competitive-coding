package leetcode.java.problems.problem0530;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import leetcode.java.model.TreeNode;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Integer[] arr = {4, 2, 6, 1, 3};
        TreeNode root = TreeNode.arrayToTree(arr);
        Solution sol = new Solution();
        Assertions.assertEquals(1, sol.getMinimumDifference(root));
    }

    @Test
    public void testSolution2() {
        Integer[] arr = {1, 0, 48, null, null, 12, 49};
        TreeNode root = TreeNode.arrayToTree(arr);
        Solution sol = new Solution();
        Assertions.assertEquals(1, sol.getMinimumDifference(root));
    }

    @Test
    public void testSolution3() {
        Integer[] arr = {1, 0, 48, 0, null, 12, 49};
        TreeNode root = TreeNode.arrayToTree(arr);
        Solution sol = new Solution();
        Assertions.assertEquals(0, sol.getMinimumDifference(root));
    }
}
