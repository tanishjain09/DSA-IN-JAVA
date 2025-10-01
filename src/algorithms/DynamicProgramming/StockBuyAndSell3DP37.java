package algorithms.DynamicProgramming;

import java.util.Arrays;

public class StockBuyAndSell3DP37 {
    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfitTabulation(prices));
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n][2][3];

        for(int[][] row : dp){
            for(int[] cell : row){
                Arrays.fill(cell, -1);
            }
        }
        return solve(0, 1, 2, prices, dp);
    }
    private static int solve(int ind, int buy, int cap, int[] prices, int[][][] dp){
        if(ind == prices.length || cap == 0) return 0;
        if(dp[ind][buy][cap] != -1) return dp[ind][buy][cap];

        if(buy == 1){
            return dp[ind][buy][cap] = Math.max(-prices[ind] + solve(ind+1,0,cap,prices,dp), solve(ind+1,1,cap,prices,dp));
        }

        return dp[ind][buy][cap] = Math.max(prices[ind] + solve(ind+1,1,cap-1,prices,dp), solve(ind+1,0,cap,prices,dp));
    }
    public static int maxProfitTabulation(int[] prices){
        int n = prices.length;
        int[][][] dp = new int[n+1][2][3]; //extra row for base case

        for(int i = n-1; i >= 0; i--){
            for(int buy = 1; buy >= 0; buy--){
                for(int cap = 2; cap >= 1; cap--){
                    if(buy == 1){
                        dp[i][buy][cap] = Math.max(-prices[i] + dp[i+1][0][cap], dp[i+1][1][cap]);
                    }else{
                        dp[i][buy][cap] = Math.max(prices[i] + dp[i+1][1][cap-1], dp[i+1][0][cap]);
                    }
                }
            }
        }
        return dp[0][1][2];
    }
}
