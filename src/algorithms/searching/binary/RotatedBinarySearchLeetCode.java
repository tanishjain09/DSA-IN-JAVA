package algorithms.searching.binary;
//Question -> leetcode 33

public class RotatedBinarySearchLeetCode {
     public static void main(String[] args) {
          int[] arr = {5, 6, 7, 1, 2};
          System.out.println(rotatedBS(arr,4));

     }
     static int rotatedBS(int[] arr, int target){
          int pivot = findPivot(arr);
          if(pivot == -1){
               return binarySearch(arr,target,0,arr.length-1);
          }
          if(arr[pivot] == target){
               return pivot;
          }
          if(target <= arr[pivot]){
               return binarySearch(arr,target,0,pivot);
          }else{
               return binarySearch(arr,target,pivot+1,arr.length-1);
          }
     }
     //this will not work in duplicate values
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

     static int binarySearch(int[] arr, int targe,int start, int end){

          while (start <= end){
               //find middle element
               int mid = start + (end - start)/2;
               if(targe > arr[mid]){
                    start = mid + 1;
               } else if (targe < arr[mid]) {
                    end = mid - 1;
               }else{
                    return mid;
               }
          }
          return -1;
     }

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
               if(arr[mid] == arr[start] && arr[mid] == arr[start]) {
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
