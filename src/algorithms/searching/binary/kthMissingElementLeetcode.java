package algorithms.searching.binary;

public class kthMissingElementLeetcode {
    public static void main(String[] args) {

    }
    private static int findKthPositive(int[] arr, int k){
        int low = 0;
        int high = arr.length;
        while (low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] - (mid+1) < k){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
        return low + k;
    }
}
