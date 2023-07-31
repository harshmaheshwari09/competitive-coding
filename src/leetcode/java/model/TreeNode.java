package leetcode.java.model;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode arrayToTree(Integer[] arr) {
        return constructTree(arr, 0);
    }

    public static TreeNode constructTree(Integer[] arr, int curr) {
        if (curr >= arr.length || arr[curr] == null) {
            return null;
        }
        TreeNode node = new TreeNode(arr[curr]);
        TreeNode left = constructTree(arr, curr * 2 + 1);
        node.left = left;
        TreeNode right = constructTree(arr, curr * 2 + 2);
        node.right = right;
        return node;
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
