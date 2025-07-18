package algorithms.recursion.array;

import java.util.ArrayList;
import java.util.List;

public class CountInversionInArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

    }
    static int numberOfConversion(List<Integer> arr, int n){
        return mergeSort(arr,0,n-1);
    }

    static int merge(List<Integer> arr, int low, int mid, int high) {
        int count = 0;
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr.get(left) <= arr.get(right)) {
                temp.add(arr.get(left));
                left++;
            }
            //right is smaller
            else {
                temp.add(arr.get(right));
                count += (mid - left +1);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr.get(left));
            left++;
        }

        while (right <= high) {
            temp.add(arr.get(right));
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr.set(i, temp.get(i - low));
        }
        return count;
    }

    static int mergeSort(List<Integer> arr, int low, int high) {
        int count = 0;
        if(low >= high) return count;
        int mid = (low + high) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count = merge(arr, low, mid, high);
        return count;
    }
}