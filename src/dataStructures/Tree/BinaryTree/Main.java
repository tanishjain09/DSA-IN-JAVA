package dataStructures.Tree.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        tree.display();
//        tree.prettyDisplay();

        BinarySearchTree BST = new BinarySearchTree();

        int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        BST.populate(nums);
//        BST.display();

        int[] sortedArr = {1,2,3,4};
        BinarySearchTree bst1 = new BinarySearchTree();
        bst1.populateSortedArray(sortedArr);
        bst1.display();

        System.out.println("preorer"+bst1.preOrderIterative());
        System.out.println("inorder"+ bst1.inorderIterative());
        AVL tree = new AVL();

        for(int i=0; i < 1000; i++) {
            tree.insert(i);
        }

//        System.out.println(tree.height());

    }
}

