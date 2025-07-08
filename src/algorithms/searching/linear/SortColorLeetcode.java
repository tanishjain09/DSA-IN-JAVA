package algorithms.searching.linear;
//Question -> 75Leetcode
//https://leetcode.com/problems/sort-colors/description/
public class SortColorLeetcode {
    public static void main(String[] args) {

    }

    //brute force will be sorting the whole array O(nlog(n))
    static void sortColors1(int[] nums){  //better solution

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) count0++;
            if(nums[i] == 1) count1++;
            if(nums[i] == 2) count2++;
        }

        for(int i = 0; i < count0; i++) nums[i] =1;
        for(int i = count0; i< (count0 + count1); i++) nums[i] =2;
        for(int i = (count0 + count1); i< nums.length; i++) nums[i] =3;
    }
}
