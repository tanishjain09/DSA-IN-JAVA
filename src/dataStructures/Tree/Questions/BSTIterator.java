package dataStructures.Tree.Questions;

import java.util.Stack;

public class BSTIterator {
    Stack<TreeNode> st = new Stack<>();

    public BSTIterator(TreeNode root) {
        addAll(root);
    }
    public int next() {
        TreeNode temp = st.pop();
        addAll(temp.right);
        return temp.val;
    }
    public boolean hasNext() {
        return !st.isEmpty();
    }
    public void addAll(TreeNode root){
        while(root!=null){
            st.push(root);
            root = root.left;
        }
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
    }
    public static void main(String[] args) {}
}
