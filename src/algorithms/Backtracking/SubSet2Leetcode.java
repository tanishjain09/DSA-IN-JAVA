package algorithms.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet2Leetcode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        for(List<Integer> list : subset(arr)){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] n){
        Arrays.sort(n);
        List<List<Integer>> ans = new ArrayList<>();
        subsetCombination(0,n,ans, new ArrayList<>());
        return ans;
    }

    static void subsetCombination(int index, int[] arr, List<List<Integer>> ans, List<Integer> subset){
        ans.add(new ArrayList<>(subset));

        for(int i = index ; i < arr.length; i++){
            if(i!=index && arr[i] == arr[i-1]) continue;

            subset.add(arr[i]);
            subsetCombination(i + 1, arr, ans, subset);
            subset.remove(subset.size()-1);
        }
    }
}
