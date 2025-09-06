package dataStructures.Stack_AND_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaxLeetcode {
    public static void main(String[] args) {

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k  +1];
        Deque<Integer> deck = new ArrayDeque<>();
        int index = 0;
        for(int i = 0; i < n; i++){
            if(!deck.isEmpty() && deck.peek() <= i - k){
                deck.pop();
            }
            while (!deck.isEmpty() && nums[deck.peek()] < nums[i]){
                deck.pop();
            }
            deck.offer(i);
            if(i >= k-1){
                res[index++] = nums[deck.peek()];
            }
        }
        return res;
    }
}
