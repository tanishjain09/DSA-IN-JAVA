package algorithms.recursion.array;

import java.util.ArrayList;
import java.util.List;

//by iteration
public class SubSetLeetcode {
    public static void main(String[] args) {
        int[] arr = {1,2, 3};
        List<List<Integer>> ans = subsets(arr);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }

//      static List<List<Integer>> subset(int[] arr){
//        List<List<Integer>> outer = new ArrayList<>();
//
//        outer.add(new ArrayList<>());
//
//        for(int num : arr){  //for every number in array
//            int n = outer.size();
//            for (int i = 0; i < n; i++) {
//                List<Integer> internal = new ArrayList<>(outer.get(i));
//                internal.add(num);
//                outer.add(internal);
//            }
//        }
//
//        return outer;
//    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        createSubset(nums, 0, res, subset);
        return res;
    }

    private static void createSubset(int[] nums, int index, List<List<Integer>> res, List<Integer> subset) {
        if (index == nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        createSubset(nums, index + 1, res, subset);

        subset.remove(subset.size() - 1);
        createSubset(nums, index + 1, res, subset);
    }

}
