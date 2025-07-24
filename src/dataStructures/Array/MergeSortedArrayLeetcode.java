package dataStructures.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArrayLeetcode {
    public static void main(String[] args) {

    }
    void merge(int[] arr1, int n, int[] arr2, int m){
        int i = n-1;
        int j = 0;

        while(i >= 0 && j < m){
            if(arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            }else{
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
