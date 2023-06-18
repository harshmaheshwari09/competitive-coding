package leetcode.java.problem0235;

import leetcode.java.resources.TreeNode;

/**
 * ques: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * tags: #tree
 * complexity: O(n)
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        if (left == null) {
            return right;
        }

        return left;
    }
}
