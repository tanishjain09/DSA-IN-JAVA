package dataStructures.Tree.Questions;

import java.util.HashMap;
import java.util.Map;

public class BTFromPreorderAndInorder {
    class TreeNode{
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    public static void main(String[] args) {
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length, map);
        return root;
    }
    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map){
        if(preStart > preEnd || inStart > preEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int iroot = map.get(root.val);
        int leftNum = iroot - inStart;

        root.left = buildTree(preorder, preStart + 1, preStart + leftNum, inorder, inStart, iroot - 1, map);
        root.right = buildTree(preorder, preStart + leftNum + 1, preEnd, inorder, iroot + 1, inEnd, map);
        return root;
    }
}
