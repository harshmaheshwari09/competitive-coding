package leetcode.java.problems.problem0297;

import com.sun.source.tree.Tree;
import leetcode.java.model.TreeNode;

/**
 * Ques: https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preOrder(root, sb);
        return sb.toString().trim();
    }

    private void preOrder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("# ");
            return;
        }

        sb.append(root.val).append(" ");
        preOrder(root.left, sb);
        preOrder(root.right, sb);
    }

    // Decodes your encoded data to tree.
    int idx;
    public TreeNode deserialize(String data) {
        idx = 0;
        String[] nodeValues = data.split(" ");
        return helper(nodeValues);
    }

    private TreeNode helper(String[] nodeValues) {
        if ("#".equals(nodeValues[idx])) {
            idx++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(nodeValues[idx++]));
        node.left = helper(nodeValues);
        node.right = helper(nodeValues);
        return node;
    }
}

