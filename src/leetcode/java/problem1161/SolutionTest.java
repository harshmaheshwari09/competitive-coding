package leetcode.java.problem1161;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import leetcode.java.resources.TreeNode;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Integer[] arr = {1, 7, 0, 7, -8, null, null};
        TreeNode node = TreeNode.arrayToTree(arr);
        Solution sol = new Solution();
        Assertions.assertEquals(2, sol.maxLevelSum(node));
    }

    @Test
    public void testSolution2() {
        Integer[] arr = {989, null, 10250, 98693, -89388, null, null, null, -32127};
        TreeNode node = TreeNode.arrayToTree(arr);
        Solution sol = new Solution();
        Assertions.assertEquals(2, sol.maxLevelSum(node));
    }
}
