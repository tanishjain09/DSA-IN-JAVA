package dataStructures.Stack_AND_Queue;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] nums = {4, 8, 5, 2, 25};
        System.out.println(Arrays.toString(nextSmallerElements(nums)));
    }
    public static int[] nextSmallerElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] nse = new int[n];

        for(int i = nums.length -1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() >= nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nse[i] = -1;
            }else{
                nse[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return nse;
    }
}
