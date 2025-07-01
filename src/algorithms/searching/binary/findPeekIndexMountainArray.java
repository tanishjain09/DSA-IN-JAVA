package algorithms.searching.binary;
//Question -> Leetcode 852
//find peek in mountain array
public class findPeekIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {-13, -11, 0, 12, 1414, 11313, 1990, 12, 0, -12012};
        int index = peakIndexMountainArray(arr);
        System.out.println(arr[index]);
    }

    static int peakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                //you are in decreasing part of array
                //it may be ans so make end till mid
                end = mid;
            }else{
                //you are in ascending part of array
                start = mid + 1; //because we know that mid+1 element > mid element
            }
        }
        // in the end, start && end both pointing to the largest number
        //start and end are always trying to find max element in the above 2 check
        return start;
    }
}
