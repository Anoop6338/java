package dp.level2.unbounded_knapsack;
// leetcode 322
import java.util.Arrays;

public class coin_change_tabulation {
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
        int i,j;

        // amount =0, n= anyhting,  result = 0;
        for(j=1; j<=n; j++){
            dp[0][j] = 0;
        }

        // amount =anything, n= 0,  result = Integer.Max_Value/2;
        for(i=1; i<=amount; i++){
            dp[i][0] = Integer.MAX_VALUE/2;
        }

        // amount =0, n=0, result is 0
        dp[0][0] = 0;

        for(i=1;i<=amount; i++){
            for(j=1; j<=n ;j++){
                int index = j-1;
                int ans1 = Integer.MAX_VALUE/2, ans2 = Integer.MAX_VALUE/2;         // integer.max_value/2 so as not to overflow
    
                if(i-coins[index] >= 0){
                    ans1 = 1 + dp[i-coins[index]][j];
                }
                ans2 = dp[i][j-1]; 
    
                dp[i][j] = Math.min(ans1, ans2);
            }
        }
        return dp[amount][n];
    }
}
