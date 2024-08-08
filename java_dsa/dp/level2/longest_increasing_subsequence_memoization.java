package dp.level2;

import java.util.Arrays;

//leetcode 300
public class longest_increasing_subsequence_memoization {

    public static void main(String[] args) {
        int nums[] = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }

    static int dp[];
    static int lengthOfLIS(int[] nums) {
        dp = new int[nums.length+1];
        Arrays.fill(dp, -1);


        return ways(nums, nums.length, Integer.MAX_VALUE);
    }

    static int ways(int nums[], int n, int prev){
        if(n == 0 ){
            return dp[0] = 0;
        }
        else{
            if(dp[n]!=-1){
                return dp[n];
            }
            else{
                int index = n-1; 
                int ans1 = 0 , ans2 = 0;
                if(nums[index] < prev){
                    ans1 = 1 + ways(nums, n-1, nums[index]);
                }
                ans2 = ways(nums, n-1,prev);
    
                return dp[n] = Integer.max(ans1, ans2);
            }

        }
    }
}
