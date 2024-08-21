package dp.level2.unbounded_knapsack;

import java.util.Arrays;

public class Rod_cutting_memoization {
    public static void main(String[] args) {
        int n = 8;
        int prices[] = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cutRod(prices, n));
    }   

    static int dp[][];
    static int cutRod(int price[], int n) {
        int rod_len[] = new int[n];
        for(int i=0; i< rod_len.length; i++){
            rod_len[i] = i+1;
        }

        int L = n;

        dp = new int[L+1][n+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        return ways(L, n, price, rod_len);
        
    }

    static int ways(int L, int n, int prices[], int[] rod_len){
        if(L==0){       // length finished, successful base case
            return dp[0][n] = 0;
        }
        else if(n==0){         // all the numbers finished, unsuccessful base case
            return dp[L][0] = 0;
        }
        else{
            if(dp[L][n] != -1){
                return dp[L][n];
            }
            else{
                int index = n-1;
                int ans1 =0, ans2 =0;
    
                if(L-rod_len[index]>=0){
                    // include
                    ans1 = prices[index] + ways(L-rod_len[index], n, prices, rod_len);
                }
    
                //don't include
                ans2 = ways(L, n-1, prices, rod_len);
    
                return dp[L][n] =Integer.max(ans1, ans2);
            }

        }
    }
}
