package dataStructures.Tree.Questions;

import java.util.*;

public class TopVIewOfTree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    static class Pair{
        Node node;
        int line;
        Pair (Node node, int line){
            this.node = node;
            this.line =line;
        }
    }
    public static void main(String[] args) {}
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()){
            Pair pair = q.poll();
            Node node = pair.node;
            int line = pair.line;

            if(!map.containsKey(line)){
                map.put(line, node.data);
            }
            if(node.left != null) q.add(new Pair(node.left, line-1));
            if(node.right != null) q.add(new Pair(node.right, line+1));
        }
        res.addAll(map.values());
        return res;
    }
}
