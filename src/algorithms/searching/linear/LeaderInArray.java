package algorithms.searching.linear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = { 17,16 , 4, 3, 5, 2 };
        ArrayList<Integer> result = LeaderInArrayBrute(arr);
//        ArrayList<Integer> result = LeaderInArrayOptimal(arr);
        System.out.println(result);

    }

    static ArrayList<Integer> LeaderInArrayBrute(int[] arr ){  //this is not optimise as the time complexity is O(n^2)
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int j;
            for(j = i+1; j < n; j++){
                if (arr[i] < arr[j]) break;
            }

            if(j == n) result.add(arr[i]);
        }
        return result;
    }

//    The idea is to scan all the elements from right to left in an array and keep track of the maximum till now.
//    When the maximum changes its value, add it to the result. Finally reverse the result
    static ArrayList<Integer> LeaderInArrayOptimal(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();

        int n = arr.length;
        int maxRight = arr[n-1];

        result.add(maxRight);

        for(int i = n-2; i > 0; i--){
            if(arr[i] > maxRight){
                maxRight = arr[i];
                result.add(maxRight);
            }
        }

        Collections.reverse(result);
        return result;
    }
}


//illustration
//arr[] = {16, 17, 4, 3, 5, 2}
//
//Initially : maxRight = 2, res[] = { 2 }
//
//i = 4, maxRight = 5, res[] = { 2, 5 }
//i= 3, maxRight = 5, res[] = { 2, 5 }
//i = 2, maxRight = 5, res[] = { 2, 5 }
//i = 1, maxRight = 17, res[] = { 2, 5, 17 }
//i = 0, maxRight = 17, res[] = { 2, 5, 17 }