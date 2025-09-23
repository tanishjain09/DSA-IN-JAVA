package dataStructures.Tree.Questions;


import java.util.*;

public class AllNodeWIthDistanceK {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {}
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parentTrack = new HashMap<>();
        findParent(root, parentTrack);
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        q.offer(target);
        visited.add(target);
        int level = 0;
        while (!q.isEmpty()){
            int size = q.size();
            if(level == k) break;
            level++;
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                while (curr.left != null && !visited.contains(curr.left)) {
                    q.offer(curr.left);
                    visited.add(curr.left);
                }
                while (curr.right != null && !visited.contains(curr.right)) {
                    q.offer(curr.right);
                    visited.add(curr.right);
                }
                while (parentTrack.get(curr) != null && !visited.contains(parentTrack.get(curr))) {
                    q.offer(parentTrack.get(curr));
                    visited.add(parentTrack.get(curr));
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            list.add(curr.val);
        }
        return list;
    }
    private void findParent(TreeNode root, Map<TreeNode, TreeNode> parentTrack){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode current = q.poll();
            if(current.left!=null){
                parentTrack.put(current.left, current);
                q.offer(current.left);
            }
            if(current.right!=null){
                parentTrack.put(current.right, current);
                q.offer(current.right);
            }
        }
    }
}
