package algorithms.DynamicProgramming;

import java.util.Arrays;

public class CoinChangeDP20 {

    static final int INF = (int)1e9;

    public static void main(String[] args) {
        int[] nums = {1,2,5};
        System.out.println(coinChange(nums, 11));
        System.out.println(coinChangeTabulation(nums, 11));

    }
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        int ans = solve(n-1, coins, amount, dp);
        return ans >= INF ? -1 : ans;
    }
    private static int solve(int ind, int[] nums, int T, int[][] dp){
        if(ind == 0){
            if(T % nums[ind] == 0) return T / nums[ind];
            else return INF;
        }
        if(dp[ind][T] != -1) return dp[ind] [T];

        int notTaken = 0 + solve(ind-1, nums, T, dp);
        int taken = INF;
        if(nums[ind] <= T){
            taken = 1 + solve(ind, nums, T - nums[ind], dp);
        }
        return dp[ind][T] = Math.min(taken, notTaken);
    }
    public static int coinChangeTabulation(int[] coins, int T){
        int n = coins.length;
        int[][] dp = new int[n][T+1];


        for(int target = 0; target <= T; target++){
            if(target % coins[0] == 0) dp[0][target] = target / coins[0];
            else dp[0][target] = INF;
        }

        for(int i = 1; i < n; i++){
            for(int target = 0; target <= T; target++){
                int notTaken = dp[i-1][target];
                int taken = INF;
                if(coins[i] <= target) taken = 1 + dp[i][target - coins[i]];
                dp[i][target] = Math.min(taken, notTaken);
            }
        }

        int ans = dp[n-1][T];
        return ans >= INF ? -1 : ans;
    }
}
