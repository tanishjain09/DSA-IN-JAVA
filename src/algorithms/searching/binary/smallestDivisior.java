package algorithms.searching.binary;

public class smallestDivisior {
    public static void main(String[] args) {

    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int high = Integer.MIN_VALUE;
        for(int num: nums){
            high = Math.max(high,num);
        }

        int low = 1,ans = -1;

        while (low <= high){
            int mid = (low + high)/2;

            if(sumByDiv(nums,mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    private static int sumByDiv(int[] arr, int div){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += Math.ceil((double) arr[i] / (double)div);
        }

        return sum;
    }
}
