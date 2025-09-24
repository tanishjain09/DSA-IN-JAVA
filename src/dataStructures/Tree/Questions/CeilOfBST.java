package dataStructures.Tree.Questions;

public class CeilOfBST {
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    public int findCeil(Node root, int k){
        int ceil = -1;
        while (root!=null){
            if(root.data == k){
                ceil = root.data;
            }else if(root.data < k){
                root = root.right;
            }else{
                ceil = root.data;
                root = root.left;
            }
        }
        return ceil;
    }
}
