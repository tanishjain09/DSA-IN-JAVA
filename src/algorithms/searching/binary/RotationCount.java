package algorithms.searching.binary;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr  ={1, 2, 4};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
            int pivot = findPivot(arr);
            return pivot+1;
    }
    //use this for non duplicates
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            //four cases discuss in notes

            //first case
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1 ;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    //use this if array contain duplicates
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            //four cases discuss in notes

            //first case
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid - 1;
            }
            // if element at middle, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                //NOTE: what is these elements at start and end were the pivot
                //check is start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                //check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            }else {
                end = mid - 1 ;
            }
            //left site is sorted ,so pivot should be in right

        }
        return -1;
    }

}
