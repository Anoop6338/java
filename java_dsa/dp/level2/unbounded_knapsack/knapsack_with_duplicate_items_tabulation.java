package dp.level2.unbounded_knapsack;
//  https://www.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

import java.util.Arrays;

public class knapsack_with_duplicate_items_tabulation {
        public static void main(String[] args) {
        int W =10; 
        int N =5;
        int wt[] = {3,1,2,5,4};
        int val[] = {10,90,30,70,40};

        System.out.println(knapSack(W, N, val, wt));
    }


    static int dp[][];
    static int knapSack(int W, int N, int val[], int wt[]){
        dp = new int[W+1][N+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        return ways(W,N,val,wt);
    }

    static int ways(int W, int n, int val[], int wt[]) {
        int i, j;

        // W =0, n = anything, result is 0
        for(j=1; j<=n; j++){
            dp[0][j] = 0;
        }

        // W = anything, n = 0, result is 0
        for(i=1; i<=W; i++){
            dp[i][0] = 0;
        }

        // W = 0, n = 0, result is 0
        dp[0][0] = 0;


        for(i=1; i<=W; i++){
            for(j=1; j<=n; j++){
                int index = j-1;
                int ans1 =0 ,ans2 =0;
                if(i-wt[index] >=0){
                    //include and keep the cursor at same position to include again
                    ans1 = val[index] + dp[i-wt[index]][j];   
                }
    
                // don't include
                ans2 = dp[i][j-1];
    
                dp[i][j] = Math.max(ans1,ans2);
            }
        }
        return dp[W][n];
        
    }
}
