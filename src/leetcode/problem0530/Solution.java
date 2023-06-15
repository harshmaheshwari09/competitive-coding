package leetcode.problem0530;

import resources.TreeNode;

class Solution {
    int ans;
    public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        helper(root);
        return ans;
    }

    public int[] helper(TreeNode node) {
        int[] returnVal = {node.val, node.val};
        if (node.left != null) {
            var left = helper(node.left);
            returnVal[0] = left[0];
            ans = Math.min(ans, Math.abs(node.val - left[1]));
        }
        if (node.right != null) {
            var right = helper(node.right);
            returnVal[1] = right[1];
            ans = Math.min(ans, Math.abs(node.val - right[0]));
        }
        return returnVal;
    }
}