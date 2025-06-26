package dataStructures.Array;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1,241,141,41,414,-131,0};
        System.out.println(max(arr));
    }

    static int max(int[] arr){

        int maxElement = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
}
