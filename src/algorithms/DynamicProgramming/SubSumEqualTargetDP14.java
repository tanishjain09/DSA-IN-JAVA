package algorithms.DynamicProgramming;

import java.util.Arrays;

public class SubSumEqualTargetDP14 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int k  = 4;
        System.out.println(subsetSumToK(n, k, arr)) ;
    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        int[][] dp = new int[n][k+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(n-1, k, arr, dp);
    }
    private static boolean solve(int idx, int k, int[] arr, int[][] dp){
        if(k == 0) return true;
        if(idx == 0) return arr[idx] == k;
        if(dp[idx][k] != -1) return dp[idx][k] == 0 ? false : true;

        boolean notTaken = solve(idx - 1, k,arr,dp);
        boolean taken = false;
        if(arr[idx] <= k){
            taken = solve(idx-1,k-arr[idx], arr, dp);
        }

        dp[idx][k] = (taken || notTaken) ? 1 : 0;
        return taken || notTaken;
    }
}
