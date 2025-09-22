package dataStructures.Tree.Questions;

import java.util.*;

public class VerticalOrderTraversal {
    class TreeNode{
        int data;
        Node left;
        Node right;
        TreeNode(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    static class Pair {
        TreeNode node;
        int line;

        Pair(TreeNode node, int line) {
            this.node = node;
            this.line = line;
        }
    }

    public static void main(String[] args) {}
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair pair = q.poll();
            TreeNode node = pair.node;
            int line = pair.line;

            map.putIfAbsent(line, new ArrayList<>());
            map.get(line).add(node.data);

//            if(node.left != null)  q.add(new Pair(node.left, line-1));
//            if(node.right != null) q.add(new Pair(node.right, line+1));
        }
        for(List<Integer> list : map.values()){
            ans.add(list);
        }
        return ans;
    }

}
