package dp.level2.unbounded_knapsack;

import java.util.Arrays;

// leetcode 322
public class coin_change_memoization {
    public static void main(String[] args) {
        int amount =11;
        int coins[] ={1,2,5};
        System.out.println(coinChange(coins, amount));
    }

    static int dp[][];
    static int coinChange(int[] coins, int amount) {
        int n = coins.length;

        dp = new int[amount+1][n+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        int result = ways(amount, n, coins);
        if(result > (Integer.MAX_VALUE/2) -1){       // if result is greater than integer.max_value/2 -1, then that means amount can't be made
            return -1;          // thus we need to return -1
        }
        return result;
    }

    static int ways(int amount, int n, int coins[]){
        if(amount==0){
            return dp[0][n] = 0;
        }
        else if(n==0){
            return dp[amount][0] = Integer.MAX_VALUE/2;         // amount can't be made
        }
        else{
            if(dp[amount][n]!=-1){
                return dp[amount][n];
            }
            else{
                int index = n-1;
                int ans1 = Integer.MAX_VALUE/2, ans2 = Integer.MAX_VALUE/2;         // integer.max_value/2 so as not to overflow
    
                if(amount-coins[index] >= 0){
                    ans1 = 1 + ways(amount-coins[index], n, coins);
                }
                ans2 = ways(amount, n-1, coins);
    
                return dp[amount][n] = Math.min(ans1, ans2);
            }
        }
    }
}
