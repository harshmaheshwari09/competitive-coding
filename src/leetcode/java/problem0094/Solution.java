package leetcode.java.problem0094;

import leetcode.java.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * ques: https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 * tags: #tree
 * complexity: O(n)
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public void helper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        helper(node.left, result);
        result.add(node.val);
        helper(node.right, result);
    }
}
