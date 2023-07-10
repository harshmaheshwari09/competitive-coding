package leetcode.java.problems.problem0110;

import leetcode.java.model.TreeNode;

/**
 * Ques: https://leetcode.com/problems/balanced-binary-tree/
 * Tags: #tree
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        int[] res = helper(root);
        return res[1] == 0;
    }

    private int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        if (left[1] == 1 || right[1] == 1 || Math.abs(right[0] - left[0]) > 1) {
            return new int[]{0, 1};
        }
        return new int[]{1 + Math.max(left[0], right[0]), 0};
    }
}
