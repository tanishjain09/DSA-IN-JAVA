package algorithms.searching.binary;

public class ShipWithInDays {
    public static void main(String[] args) {

    }

    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int ans = -1;
        for(int i = 0; i < weights.length; i++){
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }
        int low = max;
        int high = sum;

        while (low <= high){
            int mid = (low + high) / 2;
            int noOfDays = days(weights, mid);
            if(noOfDays <= days){
                ans = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    static int days(int[] weights, int cap){
        int noOfday = 1;
        int load = 0;

        for(int i = 0; i < weights.length; i++){
            if((load + weights[i]) > cap){
                noOfday += 1;
                load = weights[i];
            }else{
                load += weights[i];
            }
        }
        return noOfday;
    }
}
