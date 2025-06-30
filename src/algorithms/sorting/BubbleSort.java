package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 13, 41, 34, -13};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        int n = arr.length;
        //run the steps n-1 times
        for(int i=0; i < n; i++){
            swapped = false;
            for(int j=1; j < n-i; j++){
                // for each step, max item will come at the last respective index
                if(arr[j] < arr[j-1]){
                    //swap
                    swap(arr,j,j-1);
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i, it means the array is sorted hence stop the progam
            if(!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
