package algorithms.DynamicProgramming;

public class HouseRobber2 {
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int ans1 = rob(nums, 0, n-1);
        int ans2 = rob(nums, 1, n);
        return Math.max(ans2, ans1);
    }
    private static int rob(int[] nums, int start, int end){
        int prev2 = 0;
        int prev = nums[start];

        for(int i = start; i < end; i++){
            int taken = nums[i];
            if(i - start > 1) taken+=prev2;

            int notTaken = 0 + prev;
            int curri = Math.max(taken, notTaken);
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }
}
