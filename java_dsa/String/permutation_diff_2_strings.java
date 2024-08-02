package String;
// leetcode 3146
public class permutation_diff_2_strings {
    public static void main(String[] args) {
        String s = "abcde";
        String p = "edbac";
        System.out.println(findPermutationDifference(s, p));
    }

    static int findPermutationDifference(String s, String t) {
        if(s.equals(t)){
            return 0;
        }
        int sum =0;
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);

            for(int j=0;j<t.length();j++){
                char ch2 = t.charAt(j);
                if(ch1==ch2){
                    if(i>j){
                        sum = sum + i-j;
                    }else{
                        sum = sum + j-i;
                    }
                }
            }
        }
        return sum;
    }
}
