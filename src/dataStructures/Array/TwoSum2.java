package dataStructures.Array;

public class TwoSum2 {
    public static void main(String[] args) {

    }
    //using two pointer approach
    public int[] twoSum(int[] arr, int target){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                return new int []{i+1,j+1};
            }else if(sum < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }

    //using binary search
    public int[] twoSumBS(int[] arr, int target){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int complement = target - arr[i];
            int index = binarySearch(arr,i + 1, n - 1, complement);
            if(index != -1){
                return new int[]{i+1, index+1};
            }
        }
        return new int[]{-1,-1};
    }

    private int binarySearch(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end-start) / 2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
