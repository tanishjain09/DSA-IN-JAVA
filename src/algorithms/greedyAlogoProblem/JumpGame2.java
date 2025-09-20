package algorithms.greedyAlogoProblem;

public class JumpGame2 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        int n = nums.length;
        int l = 0, r = 0, count = 0;
        while(r < n -1){
            int farthest = 0;
            for(int i = l; i <= r; i++){
                farthest = Math.max(farthest, nums[i]+i);
            }
            l = r+1;
            r = farthest;
            count++;
        }
        return count;
    }
}
