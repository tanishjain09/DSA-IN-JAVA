package mathsForDSA.bitManupulation;

public class findUniqueInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 2, 4, 3, 5};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }

        return unique;
    }
}
