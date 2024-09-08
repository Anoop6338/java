package dp.level2.LCS;
// print longest common subsequence

public class print_lcs__tabulation {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace" ;
        System.out.println(longestCommonSubsequence(text1, text2));

        System.out.println();
        System.out.println("--- DP printing -----");

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static String dp[][];
    static String longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        dp = new String[m+1][n+1];
        // by deafult value of string is null so no initial filling 


        return lcs(text1, text2, m, n);
    }

    static String lcs(String s1, String s2, int m, int n){
        int i,j;

        // m=0, n=anything, fill "" ;
        for(j=1; j<=n;j++){     
            dp[0][j] = "";
        }

        // m=anything, n=0, fill "" ;
        for(i=1; i<=m; i++){
            dp[i][0] = "";
        }

        // m=0, n=0, fill "" ;
        dp[0][0] = "";
        

        for(i=1; i<=m; i++){
            for(j=1; j<=n; j++){
                int p = i-1;
                int q = j-1;
                
                // char matches thus reduce both m and n
                if(s1.charAt(p) == s2.charAt(q)){
                    dp[i][j] = dp[i-1][j-1] + s1.charAt(p);
                }
    
                // try to reduce each string one by one
                else{
                    String ans1 = dp[i-1][j];   // reducing m
    
                    String ans2  = dp[i][j-1];  // reducing n
                    
                    // return the largest string
                    if(ans1.length() > ans2.length()){
                        dp[i][j] = ans1;
                    }
                    else{
                        dp[i][j] = ans2;
                    }
                }
            }
        }
        return dp[m][n];
    }
}
