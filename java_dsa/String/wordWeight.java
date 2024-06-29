package String;

import java.util.StringTokenizer;

public class wordWeight {
    public static void main(String[] args) {
        String s = "aaa bbb xyz";
        printWordWeight(s);
    }

    static void printWordWeight(String s){              // breaks string into token
        StringTokenizer st = new StringTokenizer(s);
        int num = st.countTokens();

        for(int i=0 ; i<num ; i++){
            System.out.println(weight(st.nextToken()));
        }
    }

    static int weight(String word){     // prints weight of each word
        int sum =0;
        for(int i=0; i<word.length(); i++){
            sum += word.charAt(i) - 96;
        }
        return sum;
    }
}
