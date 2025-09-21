package dataStructures.Tree.Questions;

public class SumRootToLeafLeetcode {
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

    public static void main(String[] args) {

    }

    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode node, int sum) {
        if (node == null) return 0;

        sum = sum * 10 + node.val;
        if (node.left == null && node.right == null) return sum;
        return helper(node.left, sum) + helper(node.right, sum);

    }
}
