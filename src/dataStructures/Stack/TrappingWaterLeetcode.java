package dataStructures.Stack;

public class TrappingWaterLeetcode {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
    public static int trap(int[] arr) {
        int n = arr.length;
        int lmax = 0, rmax = 0, total = 0;
        int l = 0, r = n-1;

            while (l < r) {
                if (arr[l] <= arr[r]) {
                    if (lmax > arr[l]){
                        total += lmax - arr[l];
                    }else{
                        lmax = arr[l];
                    }
                    l = l + 1;
                }else{
                    if(rmax > arr[r]){
                        total += rmax - arr[r];
                    }else{
                        rmax = arr[r];
                    }
                    r = r - 1;
                }
            }
        return total;
    }
}
