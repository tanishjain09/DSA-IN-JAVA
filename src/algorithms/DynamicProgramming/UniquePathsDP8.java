package algorithms.DynamicProgramming;

import java.util.Arrays;

public class UniquePathsDP8 {
    public static void main(String[] args) {

    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return uniquePaths(m-1, n-1, dp);
    }

    private int uniquePaths(int m, int n, int[][] dp){
        if(m == 0 || n == 0) return 1;
        if(dp[m][n] != -1)  return dp[m][n];
        int left = uniquePaths(m-1, n, dp);
        int right = uniquePaths(m, n-1, dp);

        return dp[m][n] = left + right;
    }
    public int uniquePathsTabulation(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0) dp[i][j] = 1;
                else{
                    int up = dp[i-1][j];
                    int left = dp[i][j-1];
                    dp[i][j] = up+left;
                }
            }
        }
        return dp[m-1][n-1];
    }
    public int uniquePathsSpaceOpti(int m, int n) {
        int[] prev = new int[n];
        for(int i = 0; i < m; i++){
            int[] temp = new int[n];
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0) temp[j] = 1;
                else{
                    temp[j] = prev[j] + temp[j-1];
                }
            }
            prev = temp;
        }
        return prev[n-1];
    }
}
