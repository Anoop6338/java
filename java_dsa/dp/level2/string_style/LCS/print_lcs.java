package dp.level2.string_style.LCS;
// print the lobgest common subsequence

public class print_lcs {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace" ;
        System.out.println(longestCommonSubsequence(text1, text2));
    }

    static String longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        return lcs(text1, text2, m, n);
    }

    static String lcs(String s1, String s2, int m, int n){
        if(m==0 || n==0){
            return "";
        }
        else{
            int i = m-1;
            int j = n-1;

            if(s1.charAt(i) == s2.charAt(j)){
                return lcs(s1, s2, m-1, n-1) + s1.charAt(i);
            }

            else{
                String ans1 = lcs(s1, s2, m-1, n);

                String ans2  = lcs(s1, s2, m, n-1);

                if(ans1.length() > ans2.length()){
                    return ans1;
                }
                return ans2;
            }
        }
    }
}
