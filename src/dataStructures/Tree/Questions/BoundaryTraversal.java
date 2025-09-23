package dataStructures.Tree.Questions;

import java.util.ArrayList;

public class BoundaryTraversal {
    class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }

    public static void main(String[] args) {
    }

    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if (node == null) return res;
        if (!isLeaf(node)) res.add(node.data);
        addLeft(node.left, res);
        addBottom(node, res);
        addRight(node.right, res);
        return res;
    }

    private void addLeft(Node node, ArrayList<Integer> res) {
        while (node != null) {
            if (!isLeaf(node)) res.add(node.data);
            if (node.left != null) node = node.left;
            else node = node.right;
            }
        }


    private void addBottom(Node root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
        }
        if (root.left != null) {
            addBottom(root.left, res);
        }
        if (root.right != null) {
            addBottom(root.right, res);
        }
    }

    private void addRight(Node node, ArrayList<Integer> res) {
        ArrayList<Integer> list = new ArrayList<>();

        while (node != null) {
            if (!isLeaf(node)) {
                list.add(node.data);
            }
            if (node.right != null) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            res.add(list.get(i));
        }

    }

    private boolean isLeaf(Node node){
    return node.left == null && node.right == null;
}


}