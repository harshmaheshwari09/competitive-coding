package leetcode.problem0094;

import org.junit.jupiter.api.Test;
import resources.TreeNode;
import resources.ValidationMethods;

import java.util.List;

public class SolutionTest {
    @Test
    public void testSolution1() {
        TreeNode node = TreeNode.arrayToTree(new Integer[]{1, null, 2, null, null, 3, null});
        Solution sol =  new Solution();
        ValidationMethods.validateList(List.of(1,3,2), sol.inorderTraversal(node));
    }

    @Test
    public void testSolution2() {
        TreeNode node = TreeNode.arrayToTree(new Integer[]{});
        Solution sol =  new Solution();
        ValidationMethods.validateList(List.of(), sol.inorderTraversal(node));
    }

    @Test
    public void testSolution3() {
        TreeNode node = TreeNode.arrayToTree(new Integer[]{1});
        Solution sol =  new Solution();
        ValidationMethods.validateList(List.of(1), sol.inorderTraversal(node));
    }
}
