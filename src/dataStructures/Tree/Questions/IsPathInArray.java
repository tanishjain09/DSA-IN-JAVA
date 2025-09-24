package dataStructures.Tree.Questions;

import com.sun.source.tree.Tree;

public class IsPathInArray {
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
        //given an array and tree check is the path in array is present in tree or not
        //notes question no 23
    }

    public static boolean hasPath(TreeNode root, int[] arr){
        if(root == null) return arr.length == 0;

        return helper(root, arr,0);
    }
    private static boolean helper(TreeNode node, int[] arr, int index){
        if(node == null) return false;

        if(index >= arr.length || node.val != arr[index]) return false;

        if(node.left == null && node.right == null && index == arr.length - 1) return true;

        return helper(node.left, arr, index+1) || helper(node.right, arr, index+1);
    }
}
