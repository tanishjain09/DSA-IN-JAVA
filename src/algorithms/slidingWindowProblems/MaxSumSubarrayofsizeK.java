package algorithms.slidingWindowProblems;

public class MaxSumSubarrayofsizeK {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 8, 2, 9, 1};
        System.out.println(maximumSumSubarray(arr,3));

    }
    public static int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i = 0, j = 0;

        while(j < arr.length){
            sum += arr[j];
            if((j-i+1) < k){
                j++;
            }
            else if(( j-i+1 ) == k){
                max = Math.max(max,sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
