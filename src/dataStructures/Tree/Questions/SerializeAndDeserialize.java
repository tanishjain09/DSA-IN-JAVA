package dataStructures.Tree.Questions;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserialize {
    public class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public String serialize(TreeNode root) {
        if(root == null) return "";
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode node = q.poll();
            if(node == null){
                sb.append("#,");
            }
            sb.append(node.val+",");
            q.add(node.left);
            q.add(node.right);
        }
        return sb.toString();
    }
    public TreeNode deserialize(String data){
        if(data == null) return null;

        Queue<TreeNode> q = new LinkedList<>();
        String[] values = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        for(int i = 1; i < values.length; i++){
            TreeNode parent = q.poll();
            if(!values[i].equals("#")){
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                parent.left = left;
                q.add(left);
            }
            i++;
            if(i < values.length && !values[i].equals("#")){
                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return root;
    }
}
