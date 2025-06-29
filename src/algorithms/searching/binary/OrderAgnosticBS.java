package algorithms.searching.binary;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14 ,16 ,90, 1313, 421331};
        int[] arr2 = {4121371, 1313, 41, 13, 11, 8, 4, 1, -11};
        int target1 = 421331;
        int target2 = 13;
        System.out.println(orderAgnosticBS(arr,target1));
        System.out.println(orderAgnosticBS(arr2,target2));
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            } else {
                if(target < arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
