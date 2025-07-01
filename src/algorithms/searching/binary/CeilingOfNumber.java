package algorithms.searching.binary;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16 ,18};
        System.out.println(ceilingOfNumber(arr,6));
    }

    static int ceilingOfNumber(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        if(arr.length == 0){
            return -1;
        }
        if(target > arr[end]){
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}
