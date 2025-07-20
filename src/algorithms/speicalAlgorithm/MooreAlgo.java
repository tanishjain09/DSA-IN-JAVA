package algorithms.speicalAlgorithm;


//leet code 169. Majority Element
public class MooreAlgo {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(mooresAlgo(nums));
    }
    //brute force is using nested forloop -> O(n^2)
    //better is using hashset ->  O(N*logN) + O(N), where N = size of the given array.
    //SC - O(n) size of hashset

    //optimal moore's algo using
    static int mooresAlgo(int[] nums){
        int count = 0;
        int element = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }else if (nums[i] == element){
                count++;
            }else{
                count--;
            }
        }
        int count2 = 0;
        for(int i = 0; i<nums.length; i++){
            if(element == nums[i]){
                count2++;
            }
        }

        if(count2 > nums.length/  2) return element;
        return -1;
    }
}
