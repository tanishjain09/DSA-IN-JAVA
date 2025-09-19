package algorithms.slidingWindowProblems;

public class NoOfNiceSubarray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        System.out.println(noOfSubarray(nums, 3));

    }
    private static int noOfSubarray(int[] nums, int k){
        return fn(nums, k) - fn(nums, k-1);
    }
    private static int fn(int[] nums, int k){
        if(k<0) return 0;
        int l = 0, r = 0, sum = 0, count = 0;
        while(r < nums.length){
            sum += nums[r] % 2;
            while(sum > k){
                sum -= nums[l] % 2;
                l = l +1;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }
}
