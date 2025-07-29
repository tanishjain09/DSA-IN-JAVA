package algorithms.slidingWindowProblems;

public class MaxConsecutiveOne3Leetcode {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(arr, 2));
    }
    public static  int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int max =0;
        int count = 0; //count the number of zeroes in the current window
        while(j < nums.length){
            if(nums[j] == 0){
                count++;
            }

            if(count > k){
                i++;
                count--;
            }
            max = Math.max(max, j - i + 1);

            j++;
        }
        return max;
    }
}
