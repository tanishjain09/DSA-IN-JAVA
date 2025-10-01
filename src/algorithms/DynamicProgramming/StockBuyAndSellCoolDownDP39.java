package algorithms.DynamicProgramming;

import java.util.Arrays;

public class StockBuyAndSellCoolDownDP39 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 0, 2};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(0, 1, prices, dp);
    }
    private static int solve(int ind, int buy, int[] arr, int[][] dp){
        if(ind >= arr.length) return 0;

        if(dp[ind][buy]!=-1) return dp[ind][buy];
        if(buy == 1){
            return Math.max(-arr[ind] + solve(ind+1,0, arr, dp), solve(ind+1, 1, arr, dp));
        }else{
            return Math.max(arr[ind] + solve(ind+2, 1, arr,dp), solve(ind + 1, 0, arr, dp));
        }
    }
}
