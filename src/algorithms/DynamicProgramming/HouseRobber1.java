package algorithms.DynamicProgramming;

import java.util.Arrays;
import java.util.Map;

public class HouseRobber1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp,-1);
        return rob(nums, n-1, dp);
    }
    private static int rob(int[] nums, int idx, int[] dp){
        if(idx == 0) return nums[idx];
        if(idx < 0) return 0;
        if(dp[idx] != -1) return dp[idx];
        int robbed = nums[idx] + rob(nums, idx-2, dp);
        int notRobbed = 0 + rob(nums, idx-1, dp);
        return dp[idx] = Math.max(robbed, notRobbed);
    }
}
