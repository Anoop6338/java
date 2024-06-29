package recursion;

public class IntegerToBinary {
    public static void main(String[] args) {
        int num = 19;
        System.out.println("loops "+intToString(num));
        
        intToString_tail(num,"");

        System.out.println("Head recursion "+intToString_head(num));
    }


    static String intToString(int num){         // loops
        String s ="";
        while(num!=0){
            int rem = num%2;
            s=rem+s;
            num = num/2;
        }
        return s;
    }


    static void intToString_tail(int num, String s){        // tails
        if(num== 0){
            System.out.println("Tail recursion "+s);
        }
        else{
            int rem = num % 2;
            s = rem+s;
            intToString_tail(num/2, s);
        }
    }

    static String intToString_head(int num){        // head
        if(num==0){
            return "";
        }
        else{
            int rem = num%2;
            return  intToString_head(num/2) + rem ;       
        }
    }
}
