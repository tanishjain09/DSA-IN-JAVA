package algorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1Leetcode {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        for(List<Integer> num : combinationSum(arr, target)){
            System.out.println(num + " ");
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        finalCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void finalCombination(int index, int[] arr, int target, List<List<Integer>> ans, ArrayList<Integer> list) {
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        if( index == arr.length || target < 0 ){
            return;
        }

        if(arr[index] <= target){
            list.add(arr[index]);
            finalCombination(index, arr, target - arr[index], ans, list);
            list.remove(list.size() - 1);
        }
        finalCombination(index +1, arr, target, ans, list);
    }
}
