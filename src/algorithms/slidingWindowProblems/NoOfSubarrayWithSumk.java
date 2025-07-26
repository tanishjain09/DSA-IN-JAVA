package algorithms.slidingWindowProblems;

import java.util.HashMap;
import java.util.Map;

public class NoOfSubarrayWithSumk {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        System.out.println(better(arr,3));
    }

    public static int brute(int[] arr, int k1){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if(sum == k1){
                    count++;
                }
            }
        }
        return count;
    }

    public static int better(int[] arr, int k1){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == k1){
                    count++;
                }
            }
        }
        return count;
    }
    public static int optimal(int[] arr, int k){
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap();
        int preSum = 0, cnt = 0;

        mpp.put(0,1);
        for(int i = 0; i < n; i++){
            preSum = arr[i];

            int remove = preSum - k;

            cnt += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum,0) +1);
        }
        return cnt;
    }
}
