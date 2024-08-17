package dp.level2;

import java.util.Arrays;

//leetcode 300
public class longest_increasing_subsequence_memoization {

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
        return LIS_2(nums, n, n, "");

    }

    // In this we remember prev_index instead of prev for comparision
    static int LIS_2(int nums[], int n, int prev_index, String ans){
        if(n == 0 ){
            System.out.println(ans);
            return dp[0][prev_index] = 0;
        }
        else{
            if(dp[n][prev_index]!=-1){
                return dp[n][prev_index];
            }
            else{
                int index = n-1; 
                int ans1 =0 , ans2 =0;
                // include only if decreasing
                if(prev_index==nums.length || nums[index] < nums[prev_index]){
                    ans1 = 1 + LIS_2(nums, n-1, index, ans+nums[index]+" ");
                }
    
                // don't include
                ans2 = LIS_2(nums, n-1, prev_index , ans);
    
                return dp[n][prev_index] = Integer.max(ans1, ans2);
            }
        }
    }
}
