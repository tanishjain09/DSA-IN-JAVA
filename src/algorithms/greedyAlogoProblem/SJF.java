package algorithms.greedyAlogoProblem;

import java.util.Arrays;

public class SJF {
    public static void main(String[] args) {

    }

    private static int sjf(int[] pt){
        Arrays.sort(pt);
        int wt = 0, t = 0;
        for(int process: pt){
            wt += t;
            t += process;
        }
        return wt / pt.length;
    }
}
