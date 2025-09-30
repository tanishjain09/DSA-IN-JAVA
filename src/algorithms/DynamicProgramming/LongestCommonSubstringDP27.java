package algorithms.DynamicProgramming;

public class LongestCommonSubstringDP27 {
    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "ACDGHR";
        System.out.println(longestCommonSubstr(s1, s2));
        System.out.println(optimised(s1, s2));
    }

    public static int longestCommonSubstr(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) dp[i][0] = 0;
        for (int j = 0; j <= m; j++) dp[0][j] = 0;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    ans = Math.max(dp[i][j], ans);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }

    public static int optimised(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        int[] prev = new int[m+1];
        int[] curr = new int[m+1];


        int ans = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    curr[j] = 1 + prev[j-1];
                    ans = Math.max(curr[j], ans );
                }else{
                    curr[j] = 0;
                }
            }
            prev = curr.clone();
        }
        return ans;
    }
}
