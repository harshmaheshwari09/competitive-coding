package leetcode.problem0103;

import org.junit.jupiter.api.Test;
import resources.TreeNode;
import resources.ValidationMethods;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        Integer[] arr = {3, 9, 20, null, null, 15, 7};
        TreeNode head = TreeNode.arrayToTree(arr);
        List<List<Integer>> expected = List.of(List.of(3), List.of( 20, 9), List.of(15, 7));
        ValidationMethods.validateListOfList(expected, sol.zigzagLevelOrder(head));
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        Integer[] arr = {1};
        TreeNode head = TreeNode.arrayToTree(arr);
        List<List<Integer>> expected = List.of(List.of(1));
        ValidationMethods.validateListOfList(expected, sol.zigzagLevelOrder(head));
    }

    @Test
    public void testSolution3() {
        Solution sol = new Solution();
        Integer[] arr = {};
        TreeNode head = TreeNode.arrayToTree(arr);
        List<List<Integer>> expected = new ArrayList<>();
        ValidationMethods.validateListOfList(expected, sol.zigzagLevelOrder(head));
    }
}
