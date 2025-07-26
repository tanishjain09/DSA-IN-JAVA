package dataStructures.Array;

import java.util.HashSet;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();

        for(int num:  nums){
            numsSet.add(num);
        }
        int maxStreak = 0;
        for(int num : numsSet){
            if(!numsSet.contains(num-1)){
                int streak = 1;
                int currNum = num;
                while (numsSet.contains(currNum+1)){
                    streak++;
                    currNum++;
                }

                maxStreak = Math.max(maxStreak,streak);
            }
        }
        return maxStreak;
    }
}
