package algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 13, 41, 34, -13};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int low, int high){
        if(low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low +1, n2 = high - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = arr[i + low];
        }
        for(int i = 0; i < n2; i++){
            R[i] = arr[mid + 1 + i];
        }

        int i =0,j=0,k = low;
        while (i < n1 && j < n2){
            arr[k++] = (L[i] < R[j])? L[i++] : R[j++];
        }
        while (i < n1){
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
