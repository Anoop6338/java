package dp.level2;

import java.util.Arrays;

public class knapsack_memoization {
    
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
        if(n==0 || W==0){   // if no item is avaiable or bag is full
            return dp[W][n] = 0;
        }
        else{
            if(dp[W][n]!=-1){       // if value is already avaiable in dp[][]
                return dp[W][n];
            }
            else{
                int index = n-1;
                int ans1 = 0, ans2 =0;
                if(W-wt[index]>=0){     // if bag is available for storage
                    // include
                    ans1 = val[index] + maxProfit(W-wt[index], wt, val, n-1 );
                }
    
                // don't include 
                ans2 = maxProfit(W, wt, val, n-1);
    
                return dp[W][n] = Math.max(ans1, ans2);
            }

        }
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
