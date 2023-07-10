package leetcode.java.problems.problem0226;

import leetcode.java.model.TreeNode;

/**
 * Ques: https://leetcode.com/problems/invert-binary-tree/
 * Tags: #tree
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
