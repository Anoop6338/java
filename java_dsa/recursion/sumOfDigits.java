package recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        sum_tail(num, 0);

        System.out.println(sum_head(num));

    }

    static void sum_tail(int num, int sum){
        if(num%10==0){
            System.out.println(sum);
        }
        else{
            int rem = num%10;
            sum = sum + rem;
            sum_tail(num/10, sum);
        }
    }

    static int sum_head(int num){
        if(num%10==0){
            return 0;
        }
        else{
            int rem = num%10;
            return rem + sum_head(num/10);
        }
    }

}
