package dp.level1.memoization;

import java.util.Arrays;

// leetcode 45
public class jumpGame2 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }

    static int dp[];

    static int jump(int[] nums) {
        int n = nums.length;
        dp = new int[n];    // why n ??? because jumps would be between 0 to n-1;
        Arrays.fill(dp, -1);

        return minJumps(nums,0,"");
    }

    static int minJumps(int[] nums, int i, String ans){
        int n = nums.length;

        if(i==n-1){                         // At last element so no jump
            System.out.println(ans);
            return dp[n-1] = 0;
        }
        else{
            if(dp[i]!= -1){
                return dp[i];
            }
            else{
                int limit = nums[i];

                int overall_ans = Integer.MAX_VALUE/2;
                for(int j=1;j<=limit;j++){
                    if(i+j <=n-1){
                        int temp_ans = 1+ minJumps(nums, i+j, ans+j+" ");
    
                        if(overall_ans> temp_ans){
                            overall_ans = temp_ans;
                        }
                    }
                }
                return dp[i] = overall_ans;
            }
        }
    }
}
