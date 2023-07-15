package leetcode.java.problems.problem0987;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Ques: https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
 * Tags: #tree
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Map<Integer, List<Integer>> globalMappings = new TreeMap<>();
        Queue<Map.Entry<TreeNode, Integer>> q = new LinkedList<>();
        q.offer(Map.entry(root, 0));
        while (q.size() > 0) {
            int size = q.size();
            Map<Integer, List<Integer>> levelMappings = new HashMap<>();
            while (size-- > 0) {
                Map.Entry<TreeNode, Integer> entry = q.poll();
                TreeNode node = entry.getKey();
                int level = entry.getValue();
                if (!levelMappings.containsKey(level)) {
                    levelMappings.put(level, new ArrayList<>());
                }
                levelMappings.get(level).add(node.val);
                if (node.left != null) {
                    q.offer(Map.entry(node.left, level - 1));
                }
                if (node.right != null) {
                    q.offer(Map.entry(node.right, level + 1));
                }
            }
            for (var entry : levelMappings.entrySet()) {
                int key = entry.getKey();
                List<Integer> list = entry.getValue();
                Collections.sort(list);
                if (!globalMappings.containsKey(key)) {
                    globalMappings.put(key, new ArrayList<>());
                }
                globalMappings.get(key).addAll(list);
            }
        }
        return globalMappings.values().stream().collect(Collectors.toList());
    }

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
}
