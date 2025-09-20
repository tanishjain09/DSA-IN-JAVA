package algorithms.slidingWindowProblems;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWIithKDiffInt {
    public static void main(String[] args) {

    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return fn(nums, k) - fn(nums, k-1);
    }
    private int fn(int[] nums, int k){
        int l = 0, r = 0, count = 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        while (r < nums.length){
            frequency.put(nums[r], frequency.getOrDefault(nums[r], 0 ) + 1);
            while (frequency.size() > k){
                frequency.put(nums[l], frequency.getOrDefault(nums[l], 0 ) - 1);
                if(frequency.get(nums[l]) == 0) frequency.remove(nums[l]);
                l++;
            }
            count += r - l +1;
            r++;
        }
        return count;
    }
}
