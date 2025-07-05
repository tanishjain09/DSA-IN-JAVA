package algorithms.cyclicSortPattern;
import java.util.ArrayList;
import java.util.List;

//Questions ->448LeetCode
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class FindAllMissingNumbersLeetcode {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = findAllMissingNumber(nums);
        System.out.println(list);

    }
    static List<Integer> findAllMissingNumber(int[] nums){
        int i = 0;
        List<Integer> result = new ArrayList<>();
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
        //just find missing number
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                result.add(index+1);
            }
        }
        return result;
    }
}
