package dataStructures.Stack_AND_Queue;

import java.util.LinkedList;


public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = {5,10,-5};
    }
    public int[] asteroidCollision(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0) list.addLast(arr[i]);
            else{
                while(!list.isEmpty() && list.getLast() > 0 && list.getLast() < Math.abs(arr[i])){
                    list.removeLast();
                }
            }
            if(!list.isEmpty() && list.getLast() == Math.abs(arr[i])){
                list.removeLast();
            }else if(list.isEmpty() || list.getLast() < 0){
                list.add(arr[i]);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
