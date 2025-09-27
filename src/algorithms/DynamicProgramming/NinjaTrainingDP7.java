package algorithms.DynamicProgramming;

import java.util.Arrays;

public class NinjaTrainingDP7 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 5},
                {3, 1, 1},
                {3, 3, 3}
        };
        System.out.println(maximumPoints(arr));
        System.out.println(solveTab(arr, arr.length));

    }
    public static int maximumPoints(int[][] arr) {
        int n = arr.length;
        int[][] dp = new int[n][4];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(n-1, 3, arr, dp);

    }
    private static int solve(int day, int last, int[][] arr, int[][] dp){
        if(day == 0){
            int maxi = 0;
            for(int task = 0; task < 3; task++){
                if(task != last) maxi = Math.max(maxi, arr[0][task]);
            }
            return maxi;
        }
        if(dp[day][last] != -1) return dp[day][last];
        int maxi = 0;
        for(int task = 0; task < 3; task++){
            if (task != last){
                int points = arr[day][task] + solve(day - 1, task, arr, dp);
                maxi = Math.max(maxi, points);
            }
        }
        return dp[day][last] = maxi;
    }

    private static int solveTab(int[][] arr, int n){
        int[][] dp = new int[n][4];

        dp[0][0] = Math.max(arr[0][1], arr[0][2]);
        dp[0][1] = Math.max(arr[0][0], arr[0][2]);
        dp[0][2] = Math.max(arr[0][0], arr[0][1]);
        dp[0][3] = Math.max(arr[0][0], Math.max(arr[0][1], arr[0][2]));

        for(int day = 1; day < n; day++){
            for(int last = 0; last < 4; last++){
                dp[day][last] = 0;
                for(int task = 0; task < 3; task++){
                    int point = arr[day][task] + dp[day-1][task];
                    dp[day][last] = Math.max(dp[day][last], point);
                }
            }
        }
        return dp[n-1][3];
    }
}
