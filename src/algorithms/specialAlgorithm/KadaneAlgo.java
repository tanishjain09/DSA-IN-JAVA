package algorithms.specialAlgorithm;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr= {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }

    private static int maxSubarraySum(int[] arr){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for(int i = 0; i < arr.length; i++){

            if(sum < 0){
                sum = 0;
                start = i;
            }

            sum += arr[i];
            if(sum > maxi){
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

        }

        for(int i = ansStart; i <= ansEnd; i++){
            System.out.print(arr[i] + " ") ;
        }
        System.out.println();

        return maxi;
    }
}
