package algorithms.greedyAlogoProblem;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {

    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int m = intervals[0].length;
        List<int[]> res = new ArrayList<>();
        int i = 0;
        while (i < n && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        while(i < n && intervals[i][0] < newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        res.add(newInterval);
        while (i < n){
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);
    }
}
