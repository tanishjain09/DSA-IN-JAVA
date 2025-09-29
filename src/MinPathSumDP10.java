import java.util.Arrays;

public class MinPathSumDP10 {
    public static void main(String[] args) {

    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int[] row: dp){
            Arrays.fill(row, - 1);
        }
        return solve(n-1, m-1, grid, dp);
    }
    private int solve(int n, int m, int[][] grid, int[][] dp){
        if(n == 0 && m == 0) return grid[n][m];
        if(n < 0 || m < 0) return (int)Math.pow(10, 9);

        if(dp[n][m] != -1) return dp[n][m];

        int up = grid[n][m] + solve(n-1, m, grid, dp);
        int left = grid[n][m] + solve(n, m-1, grid, dp);

        return dp[n][m] = Math.min(up, left);
    }
    public int minPathSumTabulation(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < m; j++){
                if(i == 0 && j == 0) dp[i][j] = grid[0][0];
                else {
                    int up = grid[i][j];
                    if(i > 0) up  = up + dp[i-1][j];
                    else up += Math.pow(10,9);

                    int left = grid[i][j];
                    if(j > 0) left += dp[i][j-1];
                    else left += Math.pow(10,9);

                    dp[i][j] = Math.min(left, up);
                }
            }
        }
        return dp[n-1][m-1];
    }
}
