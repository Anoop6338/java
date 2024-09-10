package dp.level2.string_style;

import java.util.Arrays;
// leetcode 72
public class edit_distance_tabulation {
        public static void main(String[] args) {
        String word1 = "horse", word2 = "ros";
        System.out.println(minDistance(word1, word2));

        for(int i=0; i<dp.length; i++){
            System.out.println(Arrays.toString(dp[i])); 
        }
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
        int i,j;

        // s1 = "", s2 =j, fill j
        for(j=0; j<=n; j++){
            dp[0][j] = j;
        }
        
        // s1 = i, s2 ="", fill i
        for(i=0; i<=m; i++){
            dp[i][0] = i;
        }
        
        // if both strings = ""
        dp[0][0] = 0;

        for( i=1; i<=m;i++){
            for( j=1; j<=n; j++){

                int index1 = i-1;
                int index2 = j-1;
                
                // if char matches reduce both strings
                if(s1.charAt(index1) == s2.charAt(index2)){
                    dp[i][j] = dp[i-1][j-1];
                }

                // perform operation and get min
                else{
                    // delete operation
                    int del = 1+ dp[i-1][j];
    
                    // update operation
                    int upd = 1+ dp[i-1][j-1];
    
                    // insert operation
                    int ins = 1+ dp[i][j-1];
    
                    dp[i][j] = Integer.min(del, Integer.min(upd, ins));
                }
            
            }
        }
        return dp[m][n];
    }
}
