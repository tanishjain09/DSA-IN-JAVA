package algorithms.DynamicProgramming;

import java.util.Arrays;

public class EditDistanceDP33 {
    public static void main(String[] args) {
        System.out.println(minDistance("horse", "ros"));
        System.out.println(minDistanceTabulation("horse", "ros"));
    }
    public static int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n+1][m+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return solve(n-1, m-1, word1, word2, dp);
    }
    private static int solve(int i, int j, String s, String t, int[][] dp){
        if(i < 0) return j+1;
        if(j < 0) return i+1;

        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i) == t.charAt(j)) return solve(i-1, j-1, s, t, dp);

        int ins = 1 + solve(i, j-1, s, t, dp);
        int del = 1 + solve(i-1, j, s, t, dp);
        int repl = 1 + solve(i-1, j-1, s, t, dp);

        return dp[i][j] = Math.min(ins, Math.min(del, repl));
    }
    public static int minDistanceTabulation(String s, String t){
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i <= n; i++) dp[i][0] = i;
        for(int j = 0; j <= m; j++) dp[0][j] = j;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    int ins = dp[i-1][j];
                    int del = dp[i][j-1];
                    int repl = dp[i-1][j-1];

                    dp[i][j] = 1 + Math.min(ins, Math.min(del, repl));
                }
            }
        }
        return dp[n][m];
    }
}
