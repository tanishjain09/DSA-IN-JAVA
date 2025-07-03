package algorithms.searching.linear;
//Given an array arr[], the task is to find the top three largest distinct integers present in the array.

import java.util.ArrayList;
import java.util.List;

public class LargestThreeElementGoG {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,14,9101,1,131,133};
        List<Integer> res = getLargestThree(arr);
        System.out.println(res);
    }
    static List<Integer> getLargestThree(int[] arr) {

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int x : arr){
            if(x > first){
                third = second;
                second = first;
                first = x;
            } else if (x > second && x!= first) {
                third = second;
                second = x;
            } else if (x > third && x!= second && x!= first) {
                third = x;
            }
        }
        List<Integer> res = new ArrayList<>();

        if(first == Integer.MIN_VALUE) return res;
        res.add(first);
        if(second == Integer.MIN_VALUE) return res;
        res.add(second);
        if(third == Integer.MIN_VALUE) return res;
        res.add(third);

        return res;
    }
}
