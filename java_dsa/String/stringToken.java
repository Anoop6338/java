package String;

import java.util.StringTokenizer;

public class stringToken {
    public static void main(String[] args) {
        String s = "hello world from anoop";
        String names = "anoop;,kumar,maurya;jatin,bedi";

        StringTokenizer st = new StringTokenizer(names,",;");
        int n = st.countTokens();
        for(int i =1; i<=n;i++){
            System.out.println(st.nextToken());
        }
        
    }
}
