package recursion;

public class NumberReverse {
    public static void main(String[] args) {
        int num =1234;
        reverse_tail(num, 0);

        // System.out.println(reverse_head(num));
        
    }
    static void reverse_tail(int num, int rev){
        if(num== 0){
            System.out.println(rev);
        }
        else{
            rev = rev*10 + num % 10;
            num = num/10;
            reverse_tail(num, rev);
        }
    }

    // static int reverse_head(int num){
    //     if(num == 0){
    //         return 0;
    //     }
    //     else{
    //         return num%10 + reverse_head(num/10)*10 ;
    //     }
    // }
}
