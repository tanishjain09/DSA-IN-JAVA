package algorithms.slidingWindowProblems;

public class LeetCode395SlidingWindowSol {
    public static void main(String[] args) {
        String s = "aaabb";
        int k = 3;
        System.out.println(longestSubstring(s, k));
    }
    public static int longestSubstring(String s, int k) {
        int maxLen = 0;
        int n = s.length();

        for(int targetUnique = 1; targetUnique <= 26; targetUnique++){
            int l = 0, r = 0;
            int[] hash = new int[26];
            int unique = 0;
            int countAtLeastK = 0;

            while (r < n){
                if(hash[s.charAt(r) - 'a'] == 0) unique++;
                hash[s.charAt(r)-'a']++;
                if(hash[s.charAt(r)-'a'] == k) countAtLeastK++;
                r++;

                while (unique > targetUnique){
                    if(hash[s.charAt(l)-'a'] == k) countAtLeastK--;
                    hash[s.charAt(l)-'a']--;
                    if(hash[s.charAt(l)-'a'] == 0) unique--;
                    l++;
                }
                if(unique == targetUnique && unique == countAtLeastK){
                    maxLen = Math.max(maxLen, r-l);
                }
            }
        }
        return maxLen;
    }
}
