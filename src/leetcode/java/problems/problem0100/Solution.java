package leetcode.java.problems.problem0100;

import leetcode.java.model.TreeNode;

/**
 * Ques: https://leetcode.com/problems/same-tree/
 * Tags: #tree
 * Complexity: Time: O(n), Space: O(1)
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}