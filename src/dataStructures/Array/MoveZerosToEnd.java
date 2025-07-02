package dataStructures.Array;

import java.util.Arrays;

//Question - 283Leetcode
// https://leetcode.com/problems/move-zeroes/description/
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZerosToEnd(int[] arr){
        int n = arr.length;

        //find the first occurence of 0 and store it in j
        int j = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        //using two pointer check if element at i is 0 or not if not than swap the 0 with ith element and if ith element is zero than just increment i and check for next index
        if(j > -1){
            for(int i = j+1; i<n; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }
    }
    static void moveZeroToEnd2(int[] arr){
        int nonZero = 0;
        for(int i = 0; i <arr.length; i++){
            while (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[nonZero];
                arr[nonZero] = temp;
                nonZero++;
            }
        }
    }

}
