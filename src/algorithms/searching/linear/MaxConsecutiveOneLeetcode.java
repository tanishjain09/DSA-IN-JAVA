package algorithms.searching.linear;
//Question -> 485Leetcode
//https://leetcode.com/problems/max-consecutive-ones/description/
public class MaxConsecutiveOneLeetcode {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1};
        System.out.println(maxConsecutiveOnes(arr));
    }
    static int maxConsecutiveOnes(int[] nums){
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                if(count >= maxCount){
                    maxCount++;
                }
                count++;
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
}
