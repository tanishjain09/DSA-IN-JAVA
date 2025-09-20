package algorithms.greedyAlogoProblem;

public class JumpGame1 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
        int[] nums2 = {3,2,1,0,4};
        System.out.println(canJump(nums2));
    }
    public static boolean canJump(int[] nums) {
        int maxInd = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > maxInd) return false;
            maxInd = Math.max(maxInd, i + nums[i]);
            if(maxInd >= nums.length - 1) return true;
        }
        return true;
    }
}
