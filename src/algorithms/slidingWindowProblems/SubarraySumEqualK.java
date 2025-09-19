package algorithms.slidingWindowProblems;

import java.util.HashMap;

public class SubarraySumEqualK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

    }

    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(0, 1);
        for(int i = 0; i < n; i++){
            int preSum = nums[i];
            int removed = preSum - k;
            count += map.getOrDefault(removed, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
