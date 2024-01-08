package leetcode.java.problems.problem0938;

import leetcode.java.model.TreeNode;

/**
 * Ques: https://leetcode.com/problems/range-sum-of-bst/
 * Tags: #bst
 * Complexity: Time: O(n), Space: O(1)
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int left = rangeSumBST(root.left, low, high);
        int right = rangeSumBST(root.right, low, high);

        return left + right + (low <= root.val && root.val <= high ? root.val : 0);
    }
}