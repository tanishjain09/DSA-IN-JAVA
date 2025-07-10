package algorithms.recursion.array;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4,5};
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr,4,0));
        System.out.println(findIndexLast(arr, 4, arr.length-1));
        System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 4, 0));

    }


    static boolean find(int[] arr, int target, int index){
        if(index == arr.length - 1){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length - 1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findIndex(arr, target, index  + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index - 1);
        }

    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length - 1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index  + 1,list);
    }

    //now here not using arraylist in the argument
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length - 1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow = findAllIndex2(arr, target, index  + 1);
        list.addAll(ansFromBelow);
        return list;
    }
}
