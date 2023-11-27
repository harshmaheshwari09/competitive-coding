package leetcode.java.problems.problem2265;

import leetcode.java.model.TreeNode;

/**
 * Ques: https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
class Solution {
    int ans;
    public int averageOfSubtree(TreeNode root) {
        ans = 0;
        helper(root);
        return ans;
    }

    public int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] left = helper(root.left);
        int[] right = helper(root.right);

        int sum = root.val + left[0] + right[0];
        int count = 1 + left[1] + right[1];

        if (sum / count == root.val) {
            ans++;
        }
        return new int[]{sum, count};
    }
}