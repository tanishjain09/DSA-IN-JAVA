package dataStructures.Tree.Questions;

public class BSTFromPreorder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    int i = 0;
    public static void main(String[] args) {}
    public TreeNode bstFromPreorder(int[] A){
        return bstFromPreorder(A, Integer.MAX_VALUE);
    }
    private TreeNode bstFromPreorder(int[] A, int bound){
        if(i == A.length || A[i] > bound) return null;

        TreeNode root = new TreeNode(A[i++]);
        root.left = bstFromPreorder(A, root.val);
        root.right = bstFromPreorder(A, bound);
        return root;
    }
}
