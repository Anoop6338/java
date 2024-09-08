package dp.level2.LCS;

// print longest common subsequence
public class print_lcs_memoization {
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
        if(m==0 || n==0){       // Either of the string finsihed
            return dp[m][n] = "";
        }
        else{   // already in dp[][]
            if(dp[m][n] != null){
                return dp[m][n];
            }
            else{
                int i = m-1;
                int j = n-1;
    
                // char matches thus reduce both m and n
                if(s1.charAt(i) == s2.charAt(j)){
                    return dp[m][n] = lcs(s1, s2, m-1, n-1) + s1.charAt(i);
                }
    
                // try to reduce each string one by one
                else{
                    String ans1 = lcs(s1, s2, m-1, n);  // reducing m
    
                    String ans2  = lcs(s1, s2, m, n-1);     //reducing n
                    
                    // return the largest string
                    if(ans1.length() > ans2.length()){
                        return dp[m][n] = ans1;
                    }
                    return dp[m][n] = ans2;
                }
            }
 
        }
    }
}
