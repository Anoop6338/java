package dp.level2.string_style;

import java.util.Arrays;

// leetcode 72
public class edit_distance_memoization {
    public static void main(String[] args) {
        String word1 = "horse", word2 = "ros";
        System.out.println(minDistance(word1, word2));
    }

    static int dp[][];
    static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        dp = new int[m+1][n+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        return edit(word1, word2, m, n);
    }

    static int edit(String s1, String s2, int m, int n){
        if(m==0){   // string s1 finished
            return dp[0][n] = n;
        }
        else if(n==0){  // string s2 finsihed
            return dp[m][0] = m;
        }
        else{
            if(dp[m][n] != -1){
                return dp[m][n];
            }
            else{
                int index1 = m-1;
                int index2 = n-1;

                // if char matches reduce both strings
                if(s1.charAt(index1) == s2.charAt(index2)){
                    return dp[m][n] = edit(s1, s2, m-1, n-1);
                }

                // perform operation and get min
                else{
                    // delete operation
                    int del = 1+ edit(s1, s2, m-1, n);
    
                    // update operation
                    int upd = 1+ edit(s1, s2, m-1, n-1);
    
                    // insert operation
                    int ins = 1+ edit(s1, s2, m, n-1);
    
                    return dp[m][n] = Integer.min(del, Integer.min(upd, ins));
                }
            }
        }
    }
}
