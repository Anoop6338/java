package dp.level1.memoization;

import java.util.Arrays;

public class fibonacci_dp {

    static long dp[];
    public static void main(String[] args) {
        int n =80;
        dp = new long[n+1];
        Arrays.fill(dp, -1);

        System.out.println(fib(n));
    }

    static long fib(int n){
        if(n==1){
            return dp[1] = 0;
        }
        else if (n==2){
            return dp[2] = 1;
        }
        else{
            if(dp[n]!=-1){      // already in dp[]
                return dp[n];
            }
            else{       // make branches
                return dp[n] = fib(n-1)+ fib(n-2);

            }
        }
    }
}
