package extras;

import java.math.BigInteger;

public class big_integer_fibo {
    public static void main(String[] args) {
        int n =100;
        // System.out.println(fib(n));
        System.out.println(fib_BigInteger(n));
    }

    static int fib(int n){
        int fact =1;

        for(int i=n; i>0; i--){
            fact = fact * i;
        }
        return fact;
    }

    static BigInteger fib_BigInteger(int n){
        BigInteger fact = BigInteger.ONE;

        for(BigInteger i= new BigInteger(n+""); i.compareTo(BigInteger.ONE)>0; i = i.subtract(BigInteger.ONE)){
            fact = fact.multiply(i);
        }
        return fact;
    }
}
