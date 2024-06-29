package recursion.level2;

import java.util.StringTokenizer;

public class prime_partitioning {
    public static void main(String[] args) {
        String s ="3175";
        print(s);
    }

    static void print(String s){
        results(s, "", 0);
    }

    static void results(String s, String ans, int i){
        if(i==s.length()){
            // ans.trim();
            StringTokenizer st = new StringTokenizer(ans,".");
            int n = st.countTokens();

            boolean final_result = true;
            for(int j =0; j<n; j++){
                String p = st.nextToken();
                final_result = final_result & isPrime(p);
            }

            if(final_result == true){
                System.out.println(ans);
            }
        }
        else if(i==s.length()-1){
            char ch = s.charAt(i);
            results(s, ans+ch, i+1);
        }
        else{
            char ch = s.charAt(i);
            results(s, ans+ch+".", i+1);

            results(s, ans+ch, i+1);
        }
    }

    static boolean isPrime(String p){
        int num = Integer.parseInt(p);
        // System.out.println("p is "+ p);
        for(int i = 2;i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
