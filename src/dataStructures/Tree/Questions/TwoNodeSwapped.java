package dataStructures.Tree.Questions;
class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}
public class TwoNodeSwapped {
    Node first;
    Node second;
    Node prev;
    public void helper(Node root){
        inorder(root);

        //swap
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    private void inorder(Node node){
        if(node ==null) return;

        inorder(node.left);

        if(prev != null && prev.val > node.val){
            if(first == null){
                first = prev;
            }else{
                second = node;
            }
        }
        prev = node;

        inorder(node.right);
    }
}
