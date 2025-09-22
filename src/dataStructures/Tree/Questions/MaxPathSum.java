package dataStructures.Tree.Questions;

public class MaxPathSum {
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
    int ans = Integer.MIN_VALUE;
    public static void main(String[] args) {

    }
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    private int helper(TreeNode node){
        if(node == null) return 0;

        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(0, left);
        right = Math.max(0, right);

        int path = left + node.val + right;
        ans = Math.max(path, ans);

        return Math.max(left, right) + node.val;
    }

}
