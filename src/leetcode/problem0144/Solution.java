package leetcode.problem0144;

import resources.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * ques: https://leetcode.com/problems/binary-tree-preorder-traversal/
 * tags: #tree
 * complexity: O(n)
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public void helper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        helper(node.left, result);
        helper(node.right, result);
    }
}
