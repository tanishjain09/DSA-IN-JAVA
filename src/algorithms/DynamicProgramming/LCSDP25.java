package algorithms.DynamicProgramming;

import java.util.Arrays;

public class LCSDP25 {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(longestCommonSubsequence(s1, s2));
        System.out.println(lcsTabulation(s1, s2));
        System.out.println(lcsOptimised(s1, s2));
    }
    public static int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(s1, s2, n-1, m-1, dp);
    }
    private static int solve(String s1, String s2, int n, int m, int[][] dp){
        if(n < 0 || m < 0) return 0;
        if(dp[n][m] != -1) return dp[n][m];

        if(s1.charAt(n) == s2.charAt(m)) return dp[n][m] = 1 + solve(s1, s2, n-1, m-1, dp);

        return dp[n][m] = Math.max(solve(s1, s2, n-1, m, dp), solve(s1, s2, n, m-1, dp));
    }
    public static int lcsTabulation(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i <= n; i++) dp[i][0] = 0;
        for(int j = 0; j <= m; j++) dp[0][j] = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
    public static int lcsOptimised(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int[] prev = new int[m+1];
        int[] curr = new int[m+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) curr[j] = 1 + prev[j-1];
                else curr[j] = Math.max(prev[j], curr[j-1]);
            }
            prev = curr.clone();
        }
        return prev[m];
    }
}
