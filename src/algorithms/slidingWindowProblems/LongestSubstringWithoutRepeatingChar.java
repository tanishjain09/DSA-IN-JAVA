package algorithms.slidingWindowProblems;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        int l = 0, r = 0, len = 0, maxLen = 0;
        int n = s.length();
        while(r < n){
            if(hash[s.charAt(r)] != -1){ //already seen
                if(hash[s.charAt(r)] >= l){ //already present in the window
                    l = hash[s.charAt(r)] + 1; //update the l
                }
            }
            len = r - l + 1;
            maxLen = Math.max(maxLen, len);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }
}
