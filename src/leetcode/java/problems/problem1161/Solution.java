package leetcode.java.problems.problem1161;

import leetcode.java.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
public class Solution {
    public int maxLevelSum(TreeNode root) {
        int ans = 0;
        long maxSum = Integer.MIN_VALUE;
        int level = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.size() > 0) {
            int size = queue.size();
            long sum = 0L;
            while (size-- > 0) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (sum > maxSum) {
                ans = level;
                maxSum = sum;
            }
            level++;
        }
        return ans;
    }
}
