package algorithms.DynamicProgramming;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fiboMemo(n, dp));
        fiboTabu(n);
        fiboTabuEff(n);
    }

    private static int fiboMemo(int n, int[] dp){ //this will use O(n) time and space complexity
        if(n <= 1) return n;

        if(dp[n] != -1) return dp[n];
        return dp[n] = fiboMemo(n-1, dp) + fiboMemo(n-2, dp);
    }

    private static void fiboTabu(int n){ // this will also use O(n) time and space complexity
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }

    private static void fiboTabuEff(int n){ //this is efficient use O(n) T.C and S.C is constant
        int prev2 = 0;
        int prev = 1;

        for(int i = 2; i <= n; i++){
            int cur_i = prev2 + prev;
            prev2 = prev;
            prev = cur_i;
        }
        System.out.println(prev);
    }
}
