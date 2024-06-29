package recursion;

public class sumof1toN {
    public static void main(String[] args) {
        sumOfNum(10, 0);
        System.out.println("Sum is "+ calc(10));
       
    }
    static void sumOfNum(int n, int sum){       // Head recursion
        if(n==0){
            System.out.println("Sum is "+sum);
        }
        else{
            sum = sum + n;
            sumOfNum(n-1, sum);
        }
    }

    
    static int calc(int n){             // Tail recursion
        if(n==0){
            return 0;
        }
        else{
            int sum = calc(n-1);
            return n + sum;
        }
    }
}
