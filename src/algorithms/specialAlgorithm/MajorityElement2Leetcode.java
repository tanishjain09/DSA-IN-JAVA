package algorithms.specialAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElement2Leetcode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(majorityElement(arr));

    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(count1 == 0 && nums[i] != el2){
                count1 = 1;
                el1 = nums[i];
            }
            else if(count2 == 0 && nums[i] != el1){
                count2 = 1;
                el2 = nums[i];
            }
            else if(nums[i] == el1){
                count1++;
            }
            else if(nums[i] == el2){
                count2 ++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0; count2 = 0;

        for (int i = 0; i < nums.length; i++){
            if(el1 == nums[i]) count1++;
            if(el2 == nums[i]) count2++;
        }

        int mini = (int)(nums.length / 3);
        if(count1 > mini) res.add(el1);
        if(count2 > mini) res.add(el2);
        Collections.sort(res);
        return res;
    }
}
