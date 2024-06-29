package recursion.level2;

import java.util.StringTokenizer;
// not good for long strings due to time out
//eg        String s ="seeslaveidemonstrateyetartsnomedievalsees";
// leetcode 132
public class palindrome_partitioning2 {
  public static void main(String[] args) {
        String s = "aab";
        System.out.println(partition(s));
    }

    static int partition(String s){
        int max = Integer.MAX_VALUE;
        int arr[] ={max};
        return results(s, 0, "", arr);
        

    }

    static int results(String s, int i, String ans, int arr[]){
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
                StringTokenizer st2 = new StringTokenizer(ans,".");
                int n2 = st2.countTokens()-1;
                System.out.println(n2);
                
                if(arr[0]>n2){
                    arr[0]=n2;
                }
                System.out.println(arr[0]);
                System.out.println(ans);
            }

        }

        else if(i==s.length()-1){
            char ch = s.charAt(i);
            results(s, i+1, ans+ch, arr);
        }
        else{
            char ch = s.charAt(i);
            //pick
            results(s, i+1, ans+ch+".", arr);

            // don't pick
            results(s, i+1, ans+ch, arr);
        }
        return arr[0];
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
