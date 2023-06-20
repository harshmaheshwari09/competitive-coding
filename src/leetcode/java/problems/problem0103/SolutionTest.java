package leetcode.java.problems.problem0103;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import leetcode.java.util.Operations;
import leetcode.java.model.TreeNode;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        Integer[] arr = {3, 9, 20, null, null, 15, 7};
        TreeNode head = TreeNode.arrayToTree(arr);
        Integer[][] expected = {{3}, {20, 9}, {15, 7}};
        Integer[][] actual = Operations.convertToNestedIntegerArray(sol.zigzagLevelOrder(head));
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        Integer[] arr = {1};
        TreeNode head = TreeNode.arrayToTree(arr);
        Integer[][] expected = {{1}};
        Integer[][] actual = Operations.convertToNestedIntegerArray(sol.zigzagLevelOrder(head));
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution3() {
        Solution sol = new Solution();
        Integer[] arr = {};
        TreeNode head = TreeNode.arrayToTree(arr);
        Integer[][] expected = {};
        Integer[][] actual = Operations.convertToNestedIntegerArray(sol.zigzagLevelOrder(head));
        Assertions.assertArrayEquals(expected, actual);
    }
}
