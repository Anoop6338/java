package dp.level2;

import java.util.Arrays;

public class longest_increasing_subsequence_tabulation {
    
    public static void main(String[] args) {
        // int nums[] = {10,9,2,5,3,7,101,18};
        int nums[] ={1,3,6,7,9,4,10,5,6};
        System.out.println(lengthOfLIS(nums));
    }

    static int dp[][];
    static int lengthOfLIS(int[] nums) {
        int n = nums.length;

        dp = new int[n+1][n+1];   

        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return LIS_2(nums, n, n);

    }

    // In this we remember prev_index instead of prev for comparision
    static int LIS_2(int nums[], int n, int prev_index){
        int i,j;

        // if n is zero, prev_index is anything, result will be 0
        for(j=1; j<=prev_index; j++){
            dp[0][j] = 0;
        }

        // if prev_index = 0, then n is surely 0
        // since index = n-1, and index moves ahead of prev_index
        dp[0][0] = 0;

        for( i=1; i<=n; i++){
            for( j=1; j<=prev_index; j++){
                int index = i-1; 
                int ans1 =0 , ans2 =0;
                // include only if decreasing
                if(j==nums.length || nums[index] < nums[j]){
                    ans1 = 1 + dp[i-1][index];
                }
    
                // don't include
                ans2 = dp[i-1][j];
    
                dp[i][j] = Integer.max(ans1, ans2);
            }
        }

        return dp[n][prev_index];
    }
}
