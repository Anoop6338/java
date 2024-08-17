package dp.level2.unbounded_knapsack;
//  https://www.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

import java.util.Arrays;

public class knapsack_with_duplicate_items_memoization {
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

        return ways(W,N,val,wt,"");
    }

    static int ways(int W, int n, int val[], int wt[], String ans) {
        if(W==0){
            System.out.println(ans);
            return dp[0][n] = 0;
        }
        else if(n==0){
            return dp[W][0] = 0;
            // do nothingd
        }
        else{
            if(dp[W][n] != -1){
                return dp[W][n];
            }
            else{
                int index = n-1;
                int ans1 =0 ,ans2 =0;
                if(W-wt[index] >=0){
                    //include and keep the cursor at same position to include again
                    ans1 = val[index] + ways(W-wt[index], n, val, wt, ans+val[index] +"("+ wt[index]+")"+" ");   
                }
    
                // don't include
                ans2 = ways(W, n-1, val, wt, ans);
    
                return dp[W][n] = Math.max(ans1,ans2);
            }

        }
    }
}
