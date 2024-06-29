package String;

import java.util.Scanner;
import java.util.StringTokenizer;

// First In First Out ----> FIFO
public class shortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your full name");
        String s = sc.nextLine();

        String output ="";
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        for(int i=0; i<n;i++){
            String p = st.nextToken();
            char ch = p.charAt(0);
            
            output = output+ ch+".";
        }
        output = output.toUpperCase();
        System.out.println(output);





        String output2 ="";
        StringTokenizer st2 = new StringTokenizer(s);
        int n2 = st2.countTokens();
        for(int i=1; i<=n2;i++){
            String p = st2.nextToken();

            if(i<n2){
                char ch = p.charAt(0);
                
                output2 = output2+ ch+".";
            }
            else{
                output2 = output2 + p;
            }
            
        }
        output2 = output2.toUpperCase();
        System.out.println(output2);



        sc.close();
    }
}
