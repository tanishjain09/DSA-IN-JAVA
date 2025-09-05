package dataStructures.Stack_AND_Queue;

import java.util.Arrays;
import java.util.Stack;

public class PSE {
    public static void main(String[] args) {
        int[] arr = {9, 6, 10, 9, 5};
        System.out.println(Arrays.toString(pse(arr)));
    }
    private static int[] pse(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] pse = new int[n];
        for(int i =0; i < n; i++){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            pse[i] = stack.isEmpty()? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return pse;
    }
}
