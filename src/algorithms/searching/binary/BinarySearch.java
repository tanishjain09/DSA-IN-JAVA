package algorithms.searching.binary;

public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14 ,16 ,90, 1313, 421331};
        int[] arr2 = {4121371, 1313, 41, 13, 11, 8, 4, 1, -11};
        int target1 = 421331;
        int target2 = 1313;
        System.out.println(binarySearchAscending(arr,target1));
        System.out.println(binarySearchDescending(arr2,target2));
    }
    // return the index,return -1 if it doest not exits
    static int binarySearchAscending(int[] arr, int targe){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            //find middle element
            int mid = start + (end - start)/2;
            if(targe < arr[mid]){
                end = mid - 1;
            } else if (targe > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int binarySearchDescending(int[] arr, int targe){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            //find middle element
            int mid = start + (end - start)/2;
            if(targe < arr[mid]){
                start = mid + 1;
            } else if (targe > arr[mid]) {
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
