package dataStructures.Stack_AND_Queue;

import java.util.Stack;

public class SumOfSubarrayMin {
    public static void main(String[] args) {

    }
    public static int sumSubarrayMins(int[] arr) {
        int[] nse = getNSE(arr);
        int[] pse = getPSE(arr);
        int total = 0;
        int MOD = (int)1e9 + 7;
        for(int i = 0; i < arr.length; i++){
            int left = i - pse[i];
            int right = nse[i] - i;
            total = (total + (right * left * arr[i]) % MOD) % MOD;
        }
        return total;
    }

    private static int[] getNSE(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] nse = new int[n];
        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            nse[i] = stack.isEmpty()? n : stack.peek();
            stack.push(i);
        }
        return nse;
    }

    private static int[] getPSE(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] pse = new int[n];
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                stack.pop();
            }
            pse[i] = stack.isEmpty()? -1 : stack.peek();
            stack.push(i);
        }
        return pse;
    }
}
