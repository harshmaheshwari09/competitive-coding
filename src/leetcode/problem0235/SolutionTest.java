package leetcode.problem0235;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import resources.TreeNode;

public class SolutionTest {
    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        TreeNode root = TreeNode.arrayToTree(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        int actual = sol.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)).val;
        Assertions.assertEquals(6, actual);
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        TreeNode root = TreeNode.arrayToTree(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        int actual = sol.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)).val;
        Assertions.assertEquals(2, actual);
    }
}
