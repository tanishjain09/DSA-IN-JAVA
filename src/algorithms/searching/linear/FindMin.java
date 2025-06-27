package algorithms.searching.linear;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,-1,0,-1121};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr){
        int minNumber = arr[0];

        for(int e : arr){
            if(e < minNumber){
                minNumber = e;
            }
        }
        return minNumber;
    }
}
