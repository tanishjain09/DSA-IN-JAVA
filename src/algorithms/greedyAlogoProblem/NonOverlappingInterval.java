package algorithms.greedyAlogoProblem;

import java.util.Arrays;

public class NonOverlappingInterval {
    public static void main(String[] args) {
//        1,2],[2,3],[3,4],[1,3]
        int[][] intervals = {
                {1,2},
                {2,3},
                {3,4},
                {1,3}
        };
        System.out.println(eraseOverlapIntervals(intervals));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        int n = intervals.length;
        int lastEndTime = intervals[0][1];
        int count = 1;
        for(int i =0 ; i < n; i++){
            if(intervals[i][0] >= lastEndTime){
                count++;
                lastEndTime = intervals[i][1];
            }
        }
        return n - count;
    }
}
