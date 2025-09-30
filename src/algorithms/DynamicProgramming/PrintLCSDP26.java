package algorithms.DynamicProgramming;

public class PrintLCSDP26 {
    public static void main(String[] args) {
        String s1 = "abcdea";
        String s2 = "aceina";
        System.out.println(printLCS(s1, s2));
    }
    public static String printLCS(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i <= n; i++) dp[i][0] = 0;
        for(int j = 0; j <= m; j++) dp[0][j] = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        StringBuilder ans = new StringBuilder();
        int i = n, j = m;
        while (i > 0 && j > 0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                ans.append(s1.charAt(i-1));
                i--;
                j--;
            }else if(dp[i-1][j] > dp[i][j-1]){
                i--;
            }else{
                j--;
            }
        }
        return ans.reverse().toString();
    }
}
