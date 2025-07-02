package dataStructures.Array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    static int removeDuplicates (int[] arr){
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
