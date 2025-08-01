package dataStructures.Array;
//Question ->189Leetcode
//https://leetcode.com/problems/rotate-array/
import java.util.Arrays;

public class RightRotationByKTimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rightRotate1(arr,8);
        System.out.println(Arrays.toString(arr));
    }
    static void rightRotate1(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k, n-1);

    }
    static void reverse(int[] arr, int start, int end) {

        while (start <= end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
    }
    }
}
