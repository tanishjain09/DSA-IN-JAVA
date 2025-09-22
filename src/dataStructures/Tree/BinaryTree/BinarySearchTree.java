package dataStructures.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }

    private Node root;

    public BinarySearchTree(){

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }
        node.height =Math.max(height(node.right), height(node.left)) + 1;

        return node;
    }
    public void display(){
        display(root,"Root Node: ");
    }

    public void populate(int[] nums){
        for(int i = 0; i < nums.length; i++){
            this.insert(nums[i]);
        }
    }
    public void populateSortedArray(int[] nums){
        populateSortedArray(nums, 0, nums.length);
    }
    private void populateSortedArray(int[] nums, int start, int end){
        if(start > end){
            return;
        }
        int mid = (start + end) / 2;

        this.insert(mid);
        populateSortedArray(nums, start+1, mid -1);
        populateSortedArray(nums, mid+1, end);
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " +node.getValue() + " : ");
        display(node.right, "Right child of " +node.getValue() + " : ");
    }

    public boolean balanced(){
        return balanced(root);
    }
    private  boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    //iterative traversal
    public List<Integer> preOrderIterative(){
        List<Integer> preorder = new ArrayList<>();

        if(root == null) return preorder;
        Stack<Node> st = new Stack<>();

        st.push(root);
        while (!st.isEmpty()){
            root = st.pop();

            preorder.add(root.value);

            if(root.right != null) st.push(root.right);
            if(root.left != null) st.push(root.left);
        }
        return preorder;
    }
    public List<Integer> inorderIterative(){
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost Node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            // Current must be null here
            current = stack.pop();
            result.add(current.value);  // Visit node

            // Move to the right subtree
            current = current.right;
        }

        return result;
    }
}
