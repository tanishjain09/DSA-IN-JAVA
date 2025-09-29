package algorithms.DynamicProgramming;

public class PartitionArrayToMinimizeDP16 {
    public static void main(String[] args) {
        int[] nums = {-36,36};
        System.out.println(minimumDifference(nums));
    }
    public static int minimumDifference(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        int k = totalSum;
        boolean[][] dp = new boolean[n][k+1];

        for(int i  = 0; i < n; i++){
            dp[i][0] = true;
        }
        if(nums[0] <= totalSum) dp[0][nums[0]] = true;

        for(int i = 1; i < n; i++){
            for(int target = 1; target <= k; target++){
                boolean notTaken = dp[i-1][target];
                boolean taken = false;
                if( nums[i] > 0 && nums[i] <= target){
                    taken = dp[i-1][target-nums[i]];
                }
                dp[i][target] = taken || notTaken;
            }
        }
        int mini = (int)Math.pow(10, 9);
        for(int s1 = 0; s1 <= totalSum/2; s1++){
            if(dp[n-1][s1]){
                int s2 = totalSum - s1;
                mini = Math.min(mini, Math.abs(s1-s2));
            }
        }
        return mini;
    }
}
