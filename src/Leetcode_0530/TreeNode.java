package Leetcode_0530;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode arrayToTree(int[] arr) {
        return constructTree(arr, 0);
    }

    public static TreeNode constructTree(int[] arr, int curr) {
        if (curr >= arr.length || arr[curr] == -1) {
            return null;
        }
        TreeNode node = new TreeNode(arr[curr]);
        TreeNode left = constructTree(arr, curr * 2 + 1);
        node.left = left;
        TreeNode right = constructTree(arr, curr * 2 + 2);
        node.right = right;
        return node;
    }

}
