package algorithms.speicalAlgorithm;

import java.util.Arrays;

public class DNF {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        dnf(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void dnf(int[] arr){
        int low = 0, mid = 0, high = arr.length-1;

        while (mid <= high){
            if(arr[mid] == 0){
                swap(arr, mid, low);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr,mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

