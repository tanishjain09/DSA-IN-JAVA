package algorithms.cyclicSortPattern;
//question -> 287 leetcode
//https://leetcode.com/problems/find-the-duplicate-number/description/
public class ReapeatedElementInArrayLeetcode {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3};
        System.out.println(repeatedElement(arr));
    }
    static int repeatedElement(int[] arr){
        int i =0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }
        return arr[arr.length-1];
    }
}
