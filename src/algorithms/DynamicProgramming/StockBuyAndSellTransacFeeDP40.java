package algorithms.DynamicProgramming;

import java.util.Arrays;

public class StockBuyAndSellTransacFeeDP40 {
    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int k = 2;
        System.out.println(maxProfit(prices, k));
    }
    public static int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(0, 1, prices, dp, fee);
    }
    private static int solve(int ind, int buy, int[] arr, int[][] dp, int fee){
        if(ind >= arr.length) return 0;

        if(dp[ind][buy]!=-1) return dp[ind][buy];
        if(buy == 1){
            return Math.max(-arr[ind] + solve(ind+1,0, arr, dp, fee), solve(ind+1, 1, arr, dp, fee));
        }else{
            return Math.max(arr[ind]-fee+solve(ind+1, 1, arr,dp, fee), solve(ind + 1, 0, arr, dp, fee));
        }
    }
}
