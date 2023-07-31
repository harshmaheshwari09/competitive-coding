package leetcode.java.problems.problem0105;

import leetcode.java.model.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void solutionTest1() {
        Solution sol = new Solution();
        int[] preorder = {3, 9, 20,15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        Integer[] arr = {3, 9, 20, null, null, 15, 7};
        TreeNode expected = TreeNode.constructTree(arr, 0);
        TreeNode actual = sol.buildTree(preorder, inorder);
        Assertions.assertTrue(TreeNode.isSameTree(expected, actual));
    }

    @Test
    public void solutionTest2() {
        Solution sol = new Solution();
        int[] preorder = {-1};
        int[] inorder = {-1};
        Integer[] arr = {-1};
        TreeNode expected = TreeNode.constructTree(arr, 0);
        TreeNode actual = sol.buildTree(preorder, inorder);
        Assertions.assertTrue(TreeNode.isSameTree(expected, actual));
    }
}
