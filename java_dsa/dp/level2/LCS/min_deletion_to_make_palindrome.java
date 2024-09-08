package dp.level2.LCS;

import java.util.Arrays;
// https://www.geeksforgeeks.org/problems/minimum-number-of-deletions4610/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

public class min_deletion_to_make_palindrome {
    public static void main(String[] args) {
        int n = 7;
        String str = "aebcbda";
        System.out.println(minDeletions(str, n));
    }

    static int minDeletions(String str, int n){
        return n - lps(str);
    }
    
    
    // LPS
    static int lps(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();

        String s2 = sb.toString();

        return longestCommonSubsequence(s, s2); // calling lcs
    }
    

    // LCS
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
        if(m==0 ){       // s1 string finsihed
            return dp[0][n] = 0;   
        }
        else if(n==0){      // s2 string finished
            return dp[m][0] = 0;
        }
        else{
            if(dp[m][n] !=-1){
                return dp[m][n];
            }
            else{
                int i = m-1;
                int j = n-1;
    
                // char matches thus reduce both m & n
                if(s1.charAt(i) == s2.charAt(j)){     
                    return dp[m][n] = 1+ lcs(s1, s2, m-1, n-1);
                }
    
                // Try to reduce String one by one
                else{
                    int ans1 =0 , ans2 =0;
                    
                    ans1 = lcs(s1, s2, m-1, n);    // reducing m
    
                    ans2 = lcs(s1, s2, m, n-1);    // reducing n
    
                    return dp[m][n] = Integer.max(ans1, ans2);
                }
            }

        }
    }
}
