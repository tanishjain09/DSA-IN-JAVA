package algorithms.DynamicProgramming;

import java.util.Collections;

public class LongestCommonPalindromeDP28 {
    public static void main(String[] args) {
        String s = "bbbab";
        String s1 = s;
        String s2 = new StringBuilder(s).reverse().toString();
        System.out.println(lcsOptimised(s1, s2));

    }
    public static int lcsOptimised(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int[] prev = new int[m+1];
        int[] curr = new int[m+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) curr[j] = 1 + prev[j-1];
                else curr[j] = Math.max(prev[j], curr[j-1]);
            }
            prev = curr.clone();
        }
        return prev[m];
    }
}
