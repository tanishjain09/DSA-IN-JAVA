package algorithms.DynamicProgramming;

import java.util.Arrays;

public class WildCardMatchingDP34 {
    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));
    }
    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int[][] dp = new int[n][m];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return solve(n-1, m-1, s, p, dp);
    }
    private static boolean solve(int i, int j, String s, String p, int[][] dp){
        if(j < 0 && i < 0) return true;
        if(j < 0 && i >= 0) return false;
        if(i <= 0 && j >= 0 ){
            for(int jj = 0; jj <= j; jj++){
                if(p.charAt(jj) != '*') return false;
            }
            return true;
        }
        if(dp[i][j] != -1) return dp[i][j] == 1;
        boolean ans;

        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') ans=solve(i-1,j-1,s,p,dp);

        else if(p.charAt(j) == '*'){
            ans = solve(i-1, j, s, p, dp) || solve(i, j-1, s, p, dp);
        }
        else{
            ans = false;
        }
        dp[i][j] = ans ? 1 : 0;
        return ans;
    }

    //try to convert memoization to 1 base index than convert to tabulation

//    public static boolean isMathTabulation(String s, String t){
//
//    }
}
