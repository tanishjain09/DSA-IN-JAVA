package algorithms.greedyAlogoProblem;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l = 0, r = 0;
        while(l < n && r < m){
            if(g[l] <= s[r]){
                l++;
            }
            r++;
        }
        return l;
    }
}
