package dataStructures.Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NGE1Leetcode {
    public static void main(String[] args) {
        int[] num1= {4,1,2};
        int[] num2={1,3,4,2};

        System.out.println(Arrays.toString(nextGreaterElement(num1,num2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = nums2.length - 1; i >=0; i--){
            while (!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                mpp.put(nums2[i],-1);
            }else{
                mpp.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }

        int[] nge = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++){
            nge[i] = mpp.get(nums1[i]);
        }
        return nge;
    }
}
