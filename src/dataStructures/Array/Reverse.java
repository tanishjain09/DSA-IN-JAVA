package dataStructures.Array;
import java.lang.reflect.Array;
import java.util.Arrays;

import static dataStructures.Array.swap.swap;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while(s < e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }

}
