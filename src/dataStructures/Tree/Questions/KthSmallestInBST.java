package dataStructures.Tree.Questions;

import java.util.PriorityQueue;

public class KthSmallestInBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
    }
    public int kthSmallest(TreeNode root, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        helper(root, k, minHeap);

        //remove k elements
        int ans = 0;
        for(int i = 0; i < k; i++){
            ans = minHeap.poll();
        }
        return ans;
    }
    private void helper(TreeNode node, int k, PriorityQueue<Integer> minHeap){
        if(node == null) return;
        helper(node.left, k, minHeap);
        minHeap.offer(node.val);
        helper(node.right, k, minHeap);
    }
}
