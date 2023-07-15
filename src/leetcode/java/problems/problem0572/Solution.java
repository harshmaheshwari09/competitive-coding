package leetcode.java.problems.problem0572;

import com.sun.source.tree.Tree;
import leetcode.java.model.TreeNode;

/**
 * Ques: https://leetcode.com/problems/subtree-of-another-tree/
 * Tags: #tree
 * Complexity: Time: O(n + m), Space: O(1)
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == subRoot) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (isSame(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSame(TreeNode p1, TreeNode p2) {
        if (p1 == p2) {
            return true;
        }

        if (p1 == null || p2 == null || p1.val != p2.val) {
            return false;
        }

        return isSame(p1.left, p2.left) && isSame(p1.right, p2.right);
    }
}