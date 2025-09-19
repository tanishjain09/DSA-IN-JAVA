package algorithms.slidingWindowProblems;

public class BinarySubarrayWIthSum {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        System.out.println(numSubarraysWithSum(nums, 2));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return fn(nums, goal) - fn(nums, goal - 1);
    }
    private static int fn(int[] nums, int k){
        if(k < 0) return 0;
        int l = 0, r = 0, sum = 0, count = 0;
        while (r < nums.length){
            sum+=nums[r];
            while(sum > k){
                sum -= nums[l];
                l = l+1;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
}
