package algorithms.cyclicSortPattern;

//Question 41 leetcode
//https://leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositiveLeetCode {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length  && arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }

        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length + 1;
    }
}
