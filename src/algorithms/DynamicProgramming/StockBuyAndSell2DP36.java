package algorithms.DynamicProgramming;

import java.awt.desktop.AboutEvent;
import java.util.Arrays;

public class StockBuyAndSell2DP36 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfitTabulation(prices));
        System.out.println(maxProfitOptimize(prices));
    }
    public static int maxProfit(int[] prices) {
        int n  =prices.length;
        int[][] dp = new int[n][2];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(0, 1, prices, dp);
    }
    private static int solve(int ind, int buy, int[] arr, int[][] dp){
            if(ind == arr.length) return 0;

            if(dp[ind][buy]!=-1) return dp[ind][buy];
            int profit;
            if(buy == 1){
                profit = Math.max(-arr[ind] + solve(ind+1,0, arr, dp), solve(ind+1, 1, arr, dp));
            }else{
                profit = Math.max(arr[ind] + solve(ind + 1, 1, arr,dp), solve(ind + 1, 0, arr, dp));
            }
            return profit;
    }

    //this is bottom up appraoch
    public static int maxProfitTabulation(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        dp[n][0] = dp[n][1] = 0; //skip

        for(int ind = n-1; ind >= 0; ind--){
            for(int buy = 0; buy <= 1; buy++){
                int profit ;
                if(buy == 1){
                    profit = Math.max(-prices[ind] + dp[ind+1][0], dp[ind+1][1]);
                }else{
                    profit = Math.max(prices[ind] + dp[ind+1][1], dp[ind+1][0]);
                }
                dp[ind][buy] = profit;
            }
        }
        return dp[0][1];
    }
    private static int maxProfitOptimize(int[] prices){
        int n = prices.length;

        int[] above = new int[2];
        int[] curr = new int[2];
        for(int ind = n-1; ind >= 0; ind--){
            for(int buy = 0; buy <= 1; buy++){
                int profit ;
                if(buy == 1){
                    profit = Math.max(-prices[ind] + above[0], above[1]);
                }else{
                    profit = Math.max(prices[ind] + above[1], above[0]);
                }
                curr[buy] = profit;
            }
            above = curr.clone();
        }
        return above[1];
    }
}
