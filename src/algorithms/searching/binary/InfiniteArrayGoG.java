package algorithms.searching.binary;

public class InfiniteArrayGoG {
    public static void main(String[] args) {
        //infinite array mean we cant use .length in sorted array to find
        int[] arr = {3, 5, 7, 9 ,90, 100, 130, 140, 160, 170};
        int target = 9;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        //first find the range
        //start with the box of size 2 in the array
        int start = 0;
        int end = 2;

        //condition for the target to lie in the range
        if( target > arr[end]){
            int newStart = end + 1;
            //double the box value
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start,end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while (start <= end){
            //find middle element
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
