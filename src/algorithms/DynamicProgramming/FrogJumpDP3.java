package algorithms.DynamicProgramming;

import java.util.Arrays;

public class FrogJumpDP3 {
    public static void main(String[] args) {
        int[] height = {30, 10, 60, 10, 60, 50};
        int n = height.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(frogJump(n-1, height, dp));
    }
    private static int frogJump(int index, int[] height, int[] dp){
        if(index == 0) return 0;

        if(dp[index] != -1) return dp[index];
        int jumpTwo = Integer.MAX_VALUE;
        int jumpOne = frogJump(index - 1, height, dp) + Math.abs(height[index] - height[index-1]);
        if(index > 1){
            jumpTwo = frogJump(index - 2, height, dp) + Math.abs(height[index] - height[index - 2]);
        }
        return dp[index] = Math.min(jumpOne, jumpTwo);
    }
}
