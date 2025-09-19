package algorithms.slidingWindowProblems;

public class MaxPointFromCards {
    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        System.out.println(maxScore(cardPoints, 3));
    }
    private static int maxScore(int[] cardPoints, int k){
        int n = cardPoints.length;
        int sum = 0, l = k-1, r = n-1;


        for(int i = 0; i<= l; i++){
            sum += cardPoints[i];
        }
        int maxSum = sum;
        while(l >= 0){
            sum -= cardPoints[l--];
            sum += cardPoints[r--];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
