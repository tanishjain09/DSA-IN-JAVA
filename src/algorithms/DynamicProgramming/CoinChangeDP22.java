package algorithms.DynamicProgramming;

import java.util.Arrays;

public class CoinChangeDP22 {
    public static void main(String[] args) {
        int[] nums = {1,2,5};
        System.out.println(change(5, nums));
        System.out.println(changeTabulation(5, nums));
    }
    public static int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(n-1, amount, coins, dp);
    }
    private static int solve(int ind, int T, int[] nums, int[][] dp){
        if(ind == 0){
            return (T % nums[0] == 0) ? 1 : 0;
        }

        if(dp[ind][T]!=-1) return dp[ind][T];

        int notTaken = solve(ind-1,T,nums,dp);
        int taken = 0;
        if(nums[ind] <= T){
            taken = solve(ind,T-nums[ind], nums, dp);
        }
        return dp[ind][T] = taken + notTaken;
    }

    public static int changeTabulation(int amount, int[] coins){
        int n = coins.length;

        int[][] dp = new int[n][amount+1];
        for(int target = 0; target <= amount; target++){
            if(target % coins[0] == 0) dp[0][target] = 1;
        }

        for(int ind = 1; ind < n; ind++){
            for(int target = 0; target <= amount; target++){
                int notTaken = dp[ind -1][target];
                int taken = 0;
                if(coins[ind] <= target){
                    taken = dp[ind][target-coins[ind]];
                }
                dp[ind][target] = taken + notTaken;
            }
        }
        return dp[n-1][amount];
    }
}
