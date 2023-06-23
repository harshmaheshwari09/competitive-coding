package leetcode.java.problems.problem0543;

import leetcode.java.model.TreeNode;

/**
 * Ques: https://leetcode.com/problems/diameter-of-binary-tree/
 * Tags: #
 * Complexity: Time: , Space:
 */
class Solution {

    int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        helper(root);
        return diameter;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);

        diameter = Math.max(diameter, left + right);
        return 1 + Math.max(left, right);
    }
}
