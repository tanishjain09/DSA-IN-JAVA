package algorithms.searching.linear;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

//        reverse1(arr);
          reverse2(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    static void reverse1(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }
    }
    static void reverse2(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
}
