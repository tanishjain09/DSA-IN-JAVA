package dataStructures.Array;

public class SockBuySell1Leetcode {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] arr) {
        int maxProfit= 0;
        int besBuy = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > besBuy){
                maxProfit = Math.max(maxProfit, arr[i] - besBuy);
            }
            besBuy = Math.min(besBuy, arr[i]);
        }
        return maxProfit;
    }
}
