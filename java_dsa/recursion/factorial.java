package recursion;

public class factorial {
    public static void main(String[] args) {
        fact(5, 1);
        System.out.println(fact(5));
    }

    static void fact (int n, int sum){      // Tail recursion
        if(n==0 ){
            System.out.println(sum);
        }
        else{
            sum = sum*n;
            fact(n-1, sum);
        }
    }

    static int fact(int n){         // Head recursion
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
