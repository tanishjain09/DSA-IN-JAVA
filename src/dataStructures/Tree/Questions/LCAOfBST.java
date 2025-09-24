package dataStructures.Tree.Questions;

public class LCAOfBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {}
    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
        TreeNode curr = root;
        while (curr!=null){
            if(p.val < curr.val && q.val < curr.val){
                curr = curr.left;
            }else if(p.val > curr.val && q.val > curr.val){
                curr = curr.right;
            }else{
                return curr;
            }
        }
        return null;
    }
}
