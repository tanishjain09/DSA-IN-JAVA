package dataStructures.Stack_AND_Queue;

import java.util.Map;
import java.util.Stack;

public class MaxReactangleInHistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int nse  = 0, pse = 0;
        int element = -1;
        int n = heights.length;
        for(int i = 0; i < n; i++){
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]){
                element = stack.pop();
                nse = i;
                pse = stack.isEmpty()? -1: stack.peek();
                maxArea = Math.max(maxArea, (nse - pse - 1) * heights[element]);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            nse = n;
            element = stack.pop();
            pse = stack.isEmpty()? -1: stack.peek();
            maxArea = Math.max(maxArea, (nse - pse - 1) * heights[element]);
        }
        return maxArea;
    }
}
