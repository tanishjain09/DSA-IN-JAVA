package dataStructures.Stack_AND_Queue;

import java.util.Arrays;
import java.util.Stack;

public class NGE2Leetcode {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] nge = new int[n];
        for(int i = 2*n -1; i >=0 ;i--){
            while (!stack.isEmpty() && stack.peek() <= nums[i%n]){
                stack.pop();
            }
            if(i < n){
                nge[i] = stack.isEmpty()? -1: stack.peek();
            }
            stack.push(nums[i%n]);
        }
        return nge;
    }
}
