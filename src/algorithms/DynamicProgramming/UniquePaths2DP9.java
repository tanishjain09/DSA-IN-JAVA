package algorithms.DynamicProgramming;

import java.util.Arrays;

public class UniquePaths2DP9 {
    public static void main(String[] args) {

    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(n-1, m-1, grid, dp);
    }
    private int solve(int n, int m, int[][] grid,int[][] dp){
        if(n < 0 || m < 0) return 0;
        if(grid[n][m] == 1) return 0;
        if(n == 0 && m == 0) return 1;
        if(dp[n][m] != -1) return dp[n][m];
        int up = solve(n-1, m, grid, dp);
        int left = solve(n, m-1, grid, dp);
        return dp[n][m] =  up + left;
    }
    public int withTabulation(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1) dp[i][j] = 0;
                else if(i == 0 && j == 0) dp[i][j]=1;
                else{
                    int up = (i > 0) ? dp[i-1][j] : 0;
                    int left = (j > 0) ? dp[i][j-1] : 0;
                    dp[i][j] = up+left;
                }
            }
        }
        return dp[n-1][m-1];
    }
}
