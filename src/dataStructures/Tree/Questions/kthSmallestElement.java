package dataStructures.Tree.Questions;

public class kthSmallestElement {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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
    int count;
    public int kthSmallest(LCALeetcode.TreeNode root, int k) {
        return helper(root, k).val;
    }

    private LCALeetcode.TreeNode helper(LCALeetcode.TreeNode root, int k){
        if(root == null) return null;
        LCALeetcode.TreeNode left = helper(root.left, k);
        if(left != null) return left;
        count++;
        if(count==k) return root;
        return helper(root.right, k);

    }
}
