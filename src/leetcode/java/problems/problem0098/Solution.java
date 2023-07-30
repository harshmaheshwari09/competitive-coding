package leetcode.java.problems.problem0098;

import leetcode.java.model.TreeNode;

/**
 * Ques: https://leetcode.com/problems/validate-binary-search-tree/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.val <= min || root.val >= max) {
            return false;
        }

        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}
