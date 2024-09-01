package dp.level2.matrix_dp;

import java.util.Arrays;

// leetcode 494
// target_sum using "+", "-"
public class target_sum_using_memoization {
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
        if(target==0 && n==0){      // target reached and also nums finished
            return dp[0][offset] = 1;
        }
        else if(n==0){      // nums finished but target not reached
            return dp[0][offset + target] =  0;
        }
        else{
            if(dp[n][offset + target] != -1){
                return dp[n][offset + target];
            }
            else{
                int index = n-1;

                int plus = 0;
                int minus = 0;
                // include '+'
                plus = ways(nums, n-1, target-nums[index]);
                
                // include '-'
                minus = ways(nums, n-1, target+nums[index]);
    
                return dp[n][offset + target] = plus + minus;
            }

        }
    }
}
