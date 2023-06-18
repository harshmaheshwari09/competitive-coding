package leetcode.java.problem0103;

import leetcode.java.resources.TreeNode;

import java.util.*;

// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
// #bfs
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean shouldReverseList = false;
        while (queue.size() > 0) {
            int size = queue.size();
            List<Integer> intermediateList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                intermediateList.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (shouldReverseList) {
                Collections.reverse(intermediateList);
            }
            ans.add(intermediateList);
            shouldReverseList = !shouldReverseList;
        }
        return ans;
    }
}