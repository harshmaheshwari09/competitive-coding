package leetcode.java.problems.problem0124;

import com.sun.source.tree.Tree;
import leetcode.java.model.TreeNode;

/**
 * Ques: https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    int ans;
    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        helper(root);
        return ans;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);

        ans = Math.max(ans, left + right + root.val);

        return root.val + Math.max(left, right);
    }
}
