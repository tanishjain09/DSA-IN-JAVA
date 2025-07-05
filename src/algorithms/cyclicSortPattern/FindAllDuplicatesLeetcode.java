package algorithms.cyclicSortPattern;

import java.util.ArrayList;
import java.util.List;
//Question -> 442 Leetcode
//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class FindAllDuplicatesLeetcode {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = findAllDuplicates(arr);
        System.out.println(result);
    }
    static List<Integer> findAllDuplicates(int[] nums){
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else {
                i++;
            }
        }

        //find the duplicates in the array
        for(int index = 0; index < nums.length; index++){
            if( nums[index] != index + 1){
                result.add(nums[index]);
            }
        }

        return result;
    }
}
