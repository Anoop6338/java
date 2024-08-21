package dp.level2.unbounded_knapsack;

import java.util.Arrays;

public class Rod_cutting_tabulation {
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
        int i,j;
        
        // L=0, n=anything , fill 0;
        for(j=1; j<=n; j++){
            dp[0][j] = 0;
        }

        // L=anything, n=0 , fill 0;
        for(i=1; i<=L; i++){
            dp[i][0] = 0;
        }

        // L=0, n=0, fill 0;
        dp[0][0]= 0;

        for(i=1; i<=L; i++){
            for(j=1; j<=n; j++){
                int index = j-1;
                int ans1 =0, ans2 =0;
    
                if(i-rod_len[index]>=0){
                    // include
                    ans1 = prices[index] + dp[i-rod_len[index]][j];
                }

                //don't include
                ans2 = dp[i][j-1];
    
                dp[i][j] = Integer.max(ans1, ans2);
            }
        }
        return dp[L][n];
    }
}
