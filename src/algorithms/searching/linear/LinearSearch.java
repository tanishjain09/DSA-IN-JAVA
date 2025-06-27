package algorithms.searching.linear;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,32,424,4,14,141,411};
        int target = 9;
        System.out.println(linearSearch(arr,target));
        System.out.println(linearSearch1(arr,target));
        System.out.println(linearSearch2(arr,target));

    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) return -1;

        for(int index = 0; index < arr.length ; index++){
            int  element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    static int linearSearch1(int[] arr, int target){
        if (arr.length == 0) return Integer.MIN_VALUE;

        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return Integer.MIN_VALUE;
    }

    static boolean linearSearch2(int[] arr, int target){
        if (arr.length == 0) return false ;

        for(int element : arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
