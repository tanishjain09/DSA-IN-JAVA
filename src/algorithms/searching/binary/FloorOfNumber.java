package algorithms.searching.binary;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {5,7,9,10,90};
        System.out.println(floorOfNumber(arr,3));
    }

    static int floorOfNumber(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        if(arr.length == 0){
            return -1;
        }
        if(target < arr[start]){
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
        return arr[end];
    }
}

