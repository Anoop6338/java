package dp.level2.matrix_dp;

import java.util.Arrays;
// NOT COMPLETED

// leetcode 494
// target_sum using "+", "-"
public class target_sum_using_tabulation {
        public static void main(String[] args) {
        int nums[] = {1,1,1,1,1};
        int target =3;
        System.out.println(findTargetSumWays(nums, target));

        
    }

    static int dp[][];
    static int offset =2000;
    static int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        dp = new int[n+1][2*offset+1];

        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return ways(nums,n, target);
    }

    static int ways(int nums[] , int n, int target){
        int i,j;

        // n =0 , target = anything, fill 0;
        // for(j=1; j<=n; j++){
        //     dp[0][offset+j] = 0;
        // }

        // target =0, n=0, fill 1
        dp[0][offset] = 1;

        // conversion
        for(i=1; i<=n; i++){
            for(j=1; j<=target; j++){
                int index = i-1;

                int plus = 0;
                int minus = 0;
                // include '+'
                plus = dp[i-1][ j-nums[index]];
                
                // include '-'
                minus = dp[i-1][ j+nums[index]];
    
                dp[i][offset + j] = plus + minus;

            }
        }

        return dp[n][offset+target];

    }
}
