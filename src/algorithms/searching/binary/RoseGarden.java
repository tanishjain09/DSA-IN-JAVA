package algorithms.searching.binary;

public class RoseGarden {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        System.out.println(roseGarden(arr,2,3));
    }

    static int roseGarden(int[] arr, int m, int k){
        long val = (long) m * k;
        if(arr.length < val) return -1;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }
        int low = mini;
        int high=  maxi;
        while(low <= high){
            int mid = (low + high)/2;
            if(possible(arr,mid,m,k)){
                high = mid-1;
            }
            else low = mid + 1;
        }
        return low;
    }
    private static boolean possible(int[] arr, int day, int m, int k){
        int count = 0;
        int noOfB = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= day){
                count++;
            }else{
                noOfB += (count / k);
                count = 0;
            }
        }
        noOfB += (count / k);
        return noOfB >= m;
    }
}
