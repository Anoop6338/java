package String;

import java.util.StringTokenizer;

public class prime_no_from_string {
    public static void main(String[] args) {
        String s = "1 10 30 0 7 3 5 18 17 23 12 ";
        primeNumber(s);
    }

    static void primeNumber(String s){
        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();

        for(int i=1; i<=count;i++){
            int num = Integer.parseInt(st.nextToken());

            if(isPrime(num)){
                System.out.println(num);
            }
        }
    }

    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
