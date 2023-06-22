package leetcode.java.problems.problem0104;

import leetcode.java.model.TreeNode;

/**
 * Ques: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Tags: #tree
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
    }
}
