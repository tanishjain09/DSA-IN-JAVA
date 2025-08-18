package algorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum2Leetcode {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        for(List<Integer> list : combinationSum2(candidates,target)){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        finalCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    static void finalCombination(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> list){
        if(target == 0){
            ans.add(new ArrayList<>(list));
        }

        for(int i = index; i < arr.length; i++){
            if(i > index && arr[i] == arr[i-1]) continue;
            if(target < arr[i]) break;
            list.add(arr[i]);
            finalCombination(i+1, arr, target - arr[i], ans,list);
            list.remove(list.size() - 1);
        }
    }
}
