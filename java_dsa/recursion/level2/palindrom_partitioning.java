package recursion.level2;

import java.util.StringTokenizer;

public class palindrom_partitioning {
    public static void main(String[] args) {
        String s = "aabcc";
        partition(s);
    }

    static void partition(String s){
        results(s, 0, "");
    }

    static void results(String s, int i, String ans){
        if(i==s.length()){

            StringTokenizer st = new StringTokenizer(ans,".");  // here ans is string to be broken and "." is the point where to break
            int n = st.countTokens();

            boolean final_ans=true;

            for(int j = 0; j<n; j++){
                String p = st.nextToken();
                final_ans = final_ans & isPalindrom(p);
                // System.out.println(final_ans);
            }

            if(final_ans == true){
                System.out.println(ans);
            }

        }

        else if(i==s.length()-1){
            char ch = s.charAt(i);
            results(s, i+1, ans+ch);
        }
        else{
            char ch = s.charAt(i);
            //pick
            results(s, i+1, ans+ch+".");

            // don't pick
            results(s, i+1, ans+ch);
        }
    }

    static boolean isPalindrom(String a){
        StringBuffer sb = new StringBuffer(a);
        sb.reverse();

        if(a.equals(sb.toString())){
            return true;
        }
        else{
            return false;
        }

    }
}
