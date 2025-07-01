package algorithms.searching.binary;
//Question -> Leetcode 1095
//searching in mountain array
public class SearchInMountainArrayLeetcode {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 5, 3, 1};
        System.out.println(searchInMountainArray(arr,3));
    }


    static int searchInMountainArray(int[] arr, int target){
        int peak = peakIndexMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0, peak);
        if(firstTry != -1) return firstTry;

        return orderAgnosticBS(arr,target,peak+1, arr.length-1);
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
    static int orderAgnosticBS(int[] arr, int target,int start, int end){


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
