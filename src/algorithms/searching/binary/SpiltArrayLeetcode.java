package algorithms.searching.binary;
//Questions -> 410 leetcode
//https://leetcode.com/problems/split-array-largest-sum/description/

public class SpiltArrayLeetcode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(splitArray(arr,2));
    }
    static int splitArray(int[] arr, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,arr[i]); //in the end the loop this will contain the max item from the array
            end += arr[i];
        }

        //binary search
        while(start < end){
            //try for the middle as potential ans
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;

            for(int num : arr){
                if(sum + num > mid){
                    //you cannot add this in this subarray, make new one
                    //say you add this num in new subarray, than sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end; //here start == end
    }
}
