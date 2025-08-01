package algorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationLeetcode {
    public static void main(String[] args) {

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, ans);
        return ans;
    }

    private static void backtrack(int index, int[] nums,List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i<nums.length; i++){
                ds.add(nums[i]);
            }
            ans.add(ds);
            return;
        }

        for(int i = index; i<nums.length; i++){
            swap(nums, i, index);
            backtrack(index + 1, nums, ans);
            swap(nums, i , index);
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
