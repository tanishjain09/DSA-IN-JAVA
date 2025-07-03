package algorithms.searching.linear;
//Question -> 268LeetCode
//https://leetcode.com/problems/missing-number/description/
public class MissingElementLeetcode {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(findMissingElement1(arr));
    }

    static int findMissingElement1(int[] arr) {  //this is not optimised
        int n = arr.length;
        int i = 0;
        while (i < n){
            if (isIndexPresent(arr,i)) {
                i++;
            }else{
                return i;
            }
        }
        return i;
    }
    static boolean isIndexPresent(int[] arr,int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    //now we know sum of n number is n(n+1)/2 so we firnd sum of n number and divide it by sum of array element the difference is the ans
    static int findMissingElement2(int[] arr){//optimised
        int n = arr.length;
        int sumOfNNumber = (n * (n+1) ) /2;
        int sumOfArray = 0;
        for(int i = 0; i< arr.length; i++){
            sumOfArray += arr[i];
        }
        return sumOfNNumber - sumOfArray;
    }
}

