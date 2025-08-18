package algorithms.DynamicProgramming;

public class ClimbStairLeetcode {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) { //space optimized
        int prev2 = 1;
        int prev = 1;
        for(int i = 2; i <= n; i++){
            int curr_i = prev + prev2;
            prev2 = prev;
            prev = curr_i;
        }

        return prev;
    }

}
