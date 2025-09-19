package algorithms.slidingWindowProblems;

public class NoOfSubstringWithAll3Char {
    public static void main(String[] args) {

    }
    public int numberOfSubstrings(String s) {
        int l =0, r = 0, count = 0;
        int[] hash = new int[3];
        int n = s.length();
        while(r < n){
            hash[s.charAt(r)-'a']++;
            while(hash[0] > 0 && hash[1] > 0 && hash[2] > 0){
                count += n - r;
                hash[s.charAt(l)-'a']--;
                l = l+1;
            }
            r++;
        }
        return count;
    }
}
