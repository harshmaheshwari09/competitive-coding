package leetcode.problem0094;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import resources.TreeNode;

public class SolutionTest {
    @Test
    public void testSolution1() {
        TreeNode node = TreeNode.arrayToTree(new Integer[]{1, null, 2, null, null, 3, null});
        Solution sol = new Solution();
        Integer[] actual = sol.inorderTraversal(node).toArray(new Integer[0]);
        Integer[] expected ={1, 3, 2};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution2() {
        TreeNode node = TreeNode.arrayToTree(new Integer[]{});
        Solution sol = new Solution();
        Integer[] actual = sol.inorderTraversal(node).toArray(new Integer[0]);
        Integer[] expected ={};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution3() {
        TreeNode node = TreeNode.arrayToTree(new Integer[]{1});
        Solution sol = new Solution();
        Integer[] actual = sol.inorderTraversal(node).toArray(new Integer[0]);
        Integer[] expected ={1};
        Assertions.assertArrayEquals(expected, actual);
    }
}
