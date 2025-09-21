package dataStructures.Tree.Questions;

public class BSTToDLL {
    LLNode head;
    LLNode tail;

    public LLNode convert(TreeNode root) {
        if (root == null) ;

        helper(root);

        return head;
    }
    private void helper(TreeNode node){
        if(node == null){
            return;
        }
        helper(node.left);

        LLNode newNode = new LLNode(node.val);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        helper(node.right);
    }
}

    class LLNode {
        int val;
        LLNode next;
        LLNode prev;

        public LLNode(int val){
            this.val = val;
        }
    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

