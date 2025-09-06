package dataStructures.Stack_AND_Queue;

import java.util.Stack;

public class SumOfSubarrayMax {
    public static void main(String[] args) {

    }
        public static int sumSubarrayMax(int[] arr){
            int[] nge = findNGE(arr);
            int[] pge = findPGE(arr);
            int total = 0;
            int MOD = (int)1e9 + 7;
            for(int i = 0; i < arr.length; i++){
                int left = i - pge[i];
                int right = nge[i] - i;
                long contrib = ((long) left * right % MOD * arr[i]) % MOD;
                total = (int)((total + contrib) % MOD);
            }
            return total;
        }

        private static int[] findNGE(int[] arr){
            Stack<Integer> stack = new Stack<>();
            int n = arr.length;
            int[] nge = new int[n];
            for(int i = n-1; i >= 0; i--){
                while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                    stack.pop();
                }
                nge[i] = stack.isEmpty()? n : stack.peek();
                stack.push(i);
            }
            return nge;
        }
        private static int[] findPGE(int[] arr){
            Stack<Integer> stack = new Stack<>();
            int n = arr.length;
            int[] pge = new int[n];
            for(int i = 0; i < n; i++){
                while (!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                    stack.pop();
                }
                pge[i] = stack.isEmpty()? -1 : stack.peek();
                stack.push(i);
            }
            return pge;
        }
}
