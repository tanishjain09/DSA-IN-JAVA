package algorithms.recursion.array;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2,  4, 5};
        System.out.println(sortedOrNot(arr,0));

    }

    static boolean sortedOrNot(int[] arr, int index){
        //base condition
        if(index == arr.length - 1){
            return true;
        }

        return arr[index] < arr[index + 1] && sortedOrNot(arr, index +1);
    }
}
