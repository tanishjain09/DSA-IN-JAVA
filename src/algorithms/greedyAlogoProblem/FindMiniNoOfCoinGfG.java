package algorithms.greedyAlogoProblem;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
public class FindMiniNoOfCoinGfG {
    public static void main(String[] args) {
        int N = 43;
        System.out.println(minCount(N));
        System.out.println(minPartition(N));
    }

    static int minCount(int N){
        int[] denomination = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        int n = denomination.length;
        int count = 0;
        for(int i = n-1; i>=0; i--){
            while (N >= denomination[i]){
                N -= denomination[i];
                count++;
            }
        }
        return count;
    }
    static List<Integer> minPartition(int N) {
        List<Integer> res = new ArrayList<>();
        int[] denomination = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        int n = denomination.length;
        int count = 0;
        for(int i = n-1; i>=0; i--){
            while (N >= denomination[i]){
                N -= denomination[i];
                res.add(denomination[i]);
            }
        }

        return res;
    }
}
