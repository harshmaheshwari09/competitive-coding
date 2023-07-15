package leetcode.java.problems.problem0199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Ques: https://leetcode.com/problems/binary-tree-right-side-view/
 * Tags: #tree
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightView = new ArrayList<>();
        if (root == null) {
            return rightView;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (q.size() > 0) {
            int size = q.size();
            TreeNode node = null;
            while (size-- > 0) {
                node = q.poll();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            rightView.add(node.val);
        }
        return rightView;
    }
}
