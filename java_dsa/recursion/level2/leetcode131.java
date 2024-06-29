package recursion.level2;
import java.util.*;
// palindrome partitioning 
public class leetcode131 {

    public static void main(String[] args) {
        String s = "aab";
        System.out.println(partition(s));
        
    }


    static List<List<String>> partition(String s) {
        List<List<String>> main_list = new ArrayList<>();
        results(s, 0, "", main_list);
        return main_list;
    }


    static List<List<String>> results(String s, int i, String ans, List<List<String>> main_list){
        if(i==s.length()){
            // System.out.println("ans is : "+ans);

            StringTokenizer st = new StringTokenizer(ans,"."); 
            int n = st.countTokens();

            boolean final_ans=true;
            List<String> sl = new ArrayList<>();


            for(int j = 0; j<n; j++){
                String p = st.nextToken();
                sl.add(p);
                final_ans = final_ans & isPalindrom(p);
            }
            
            
            if(final_ans == true){
                main_list.add(sl);

            }

        }

        else if(i==s.length()-1){
            char ch = s.charAt(i);
            return results(s, i+1, ans+ch, main_list);
        }
        else{
            char ch = s.charAt(i);
            //pick
             results(s, i+1, ans+ch+".", main_list);

            // don't pick
             results(s, i+1, ans+ch, main_list);
        }
        return main_list;
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
