package dp.level2;

import java.util.Arrays;

public class knapsack_tabulation {
        public static void main(String[] args) {
        int weight[] = {3,1,2,5,4};
        int values[] = {10,90,30,70,40};
        int W = 10;
        int n = weight.length-1;
        
        System.out.println(knapSack(W, weight, values, n));
        printing(dp);

    }

    static int dp[][];
    static int knapSack(int W, int wt[], int val[], int n ) { 
        dp = new int[W+1][n+1];
        for(int i = 0; i<dp.length;i++){
            Arrays.fill(dp[i], -1);
            // System.out.println(Arrays.toString(dp[i]));
        }
        return maxProfit(W, wt, val, n);
        
    }

    static int maxProfit(int W, int wt[], int val[], int n ) { 
        int i, j;
        // convert base cases
        // W=0 , n=anything  ->  maxprofit = 0
        for(j=1;j<=n;j++){
            dp[0][j] = 0;
        }

        // W=anything , n=0  ->  maxprofit = 0
        for(i=1;i<=W;i++){
            dp[i][0] = 0;
        }

        // W=0 , n=0  ->  maxprofit = 0
        dp[0][0] = 0;
       

        // change logic to loop
        // convert W -> i , n -> j , fun() -> dp[][]
        for(i = 1 ;i<=W; i++){
            for(j=1; j<=n; j++){

                int index = j-1;
                int ans1 = 0, ans2 =0;
                if(i-wt[index]>=0){     // if bag is available for storage
                    // include
                    ans1 = val[index] + dp[i-wt[index]][j-1];
                }
    
                // don't include 
                ans2 = dp[i][j-1];
    
                dp[i][j] = Math.max(ans1, ans2);
            }

        }
        return dp[W][n];
    } 


    static void printing(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length; j++){
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
