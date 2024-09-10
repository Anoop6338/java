package dp.level2.string_style.LCS;
// leetcode 1143
public class Longest_subsequence_string {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace" ;
        System.out.println(longestCommonSubsequence(text1, text2));
    }

    static int longestCommonSubsequence(String text1, String text2) {
        int m =text1.length();
        int n = text2.length();
        return lcs(text1, text2, m, n);
    }

    static int lcs(String s1, String s2, int m, int n){
        if(m==0 || n==0){       // any one string finsihed
            return 0;   
        }
        else{
            int i = m-1;
            int j = n-1;

            // char matches thus reduce both m & n
            if(s1.charAt(i) == s2.charAt(j)){     
                return 1+ lcs(s1, s2, m-1, n-1);
            }

            // Try to reduce String one by one
            else{
                int ans1 =0 , ans2 =0;
                
                ans1 = lcs(s1, s2, m-1, n);    // reducing m

                ans2 = lcs(s1, s2, m, n-1);    // reducing n

                return Integer.max(ans1, ans2);
            }
        }
    }
}
