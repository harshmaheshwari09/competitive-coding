package leetcode.java.problems.problem0105;

import leetcode.java.model.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Ques: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {

    int idx;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }

        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        idx = 0;
        return helper(preorder, inorderMap, 0, preorder.length - 1);
    }

    private TreeNode helper(int[] preOrder, Map<Integer, Integer> inorder, int left, int right) {
        if (idx == preOrder.length) {
            return null;
        }

        int pos = inorder.get(preOrder[idx]);
        if (pos < left || pos > right) {
            return null;
        }

        TreeNode node = new TreeNode(preOrder[idx++]);
        node.left = helper(preOrder, inorder, left, pos - 1);
        node.right = helper(preOrder, inorder, pos + 1, right);
        return node;
    }
}
