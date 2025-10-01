package algorithms.DynamicProgramming;

public class StockBuyAndSell1DP35 {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxProfit = 0;
        for(int i= 1;i < prices.length; i++){
            int profit = prices[i] - mini;
            maxProfit = Math.max(maxProfit, profit);
            mini = Math.min(mini, prices[i]);
        }
        return maxProfit;
    }
}
