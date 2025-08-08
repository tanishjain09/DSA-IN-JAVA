package dataStructures.Tree.BinaryTree;

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
}
