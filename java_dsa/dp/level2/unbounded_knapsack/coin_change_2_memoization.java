package dp.level2.unbounded_knapsack;

import java.util.Arrays;

// leetcode 518
public class coin_change_2_memoization {
    public static void main(String[] args) {
        int amount = 5; 
        int coins[] = {1,2,5};
        System.out.println(change(amount, coins));
    }

    
    static int dp[][];
    static int change(int amount, int[] coins) {
        int n  = coins.length;

        dp = new int[amount+1][n+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        return ways(amount, n, coins);
    }

    static int ways(int amount ,int n,  int[] coins){
        if(amount == 0){        // we have reached to the amount needed
            return dp[0][n] = 1;
        }
        else if(n == 0){        // numbers finished but amount is not reached
            return dp[amount][0] = 0;
        }
        else{
            if(dp[amount][n] !=-1){
                return dp[amount][n];
            }
            else{
                int index = n-1;
                int ans1 =0, ans2 =0;
    
                if(amount - coins[index]>=0){
                    ans1 = ways(amount- coins[index], n, coins);
                }
                ans2 = ways(amount, n-1, coins);
    
                return dp[amount][n] = ans1+ans2;
            }
        }
    }
}
