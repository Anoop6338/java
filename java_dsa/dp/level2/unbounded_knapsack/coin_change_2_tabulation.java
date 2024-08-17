package dp.level2.unbounded_knapsack;
import java.util.Arrays;

// leetcode 518
public class coin_change_2_tabulation {
    public static void main(String[] args) {
        int amount = 5; 
        int coins[] = {1,2,5};
        System.out.println(change(amount, coins));

        for(int i= 0; i<dp.length; i++){
            System.out.println(Arrays.toString(dp[i]));
        }
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
        int i,j;

        // amount=0, n = anything, result is 1;
        for(j=1;j<=n; j++){                                     // we have reached to the amount needed
            dp[0][j]=1;
        }

        // amount= anything, n = 0, result is 1;
        for(i=1;i<=amount; i++){                                // numbers finished but amount is not reached
            dp[i][0]=0;
        }

        // amount =0, n=0, result is 1
        dp[0][0] = 1;
                

        for(i=1; i<=amount; i++){
            for(j=1; j<=n; j++){
                int index = j-1;
                int ans1 =0, ans2 =0;
    
                if(i - coins[index]>=0){
                    ans1 = dp[i- coins[index]][j];
                }
                ans2 = dp[i][j-1];
    
                dp[i][j] = ans1+ans2;
            
            }
        }
        return dp[amount][n];
    }
}
