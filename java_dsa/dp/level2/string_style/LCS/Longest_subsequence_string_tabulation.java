package dp.level2.string_style.LCS;
// leetcode 1143

import java.util.Arrays;

public class Longest_subsequence_string_tabulation {
        public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace" ;
        System.out.println(longestCommonSubsequence(text1, text2));

        for(int i=0; i<dp.length; i++){
            System.out.println(Arrays.toString(dp[i]));
        }
    }

    static int dp[][];
    static int longestCommonSubsequence(String text1, String text2) {
        int m =text1.length();
        int n = text2.length();
        dp = new int[m+1][n+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return lcs(text1, text2, m, n);
    }

    static int lcs(String s1, String s2, int m, int n){
        int i, j;

        // string s2 is finished
        for(j=1; j<=n; j++){
            dp[0][j] =0;
        }

        // string s1 is finished
        for(i=1; i<=m; i++){
            dp[i][0] =0;
        }

        // both string finished
        dp[0][0] = 0;

        for(i=1; i<=m; i++){
            for(j=1; j<=n; j++){
                int p = i-1;
                int q = j-1;
    
                // char matches thus reduce both m & n
                if(s1.charAt(p) == s2.charAt(q)){     
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
    
                // Try to reduce String one by one
                else{
                    int ans1 = 0 , ans2 =0;
                    
                    ans1 = dp[i-1][j];    // reducing m
    
                    ans2 = dp[i][j-1];    // reducing n
    
                    dp[i][j] = Integer.max(ans1, ans2);
                }
            }
        }

        return dp[m][n];
    }
}
