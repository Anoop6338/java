package dp.level1.tabulation;
import java.util.Arrays;

// leetcode 45
public class jumpGame2 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }

    static int jump(int[] nums) {
        return minJumps(nums,0);
    }

    static int minJumps(int[] nums, int index){
        int n = nums.length;
        int dp[] = new int[n];    // why n ??? because jumps would be between 0 to n-1;
        Arrays.fill(dp, -1);


        dp[n-1] = 0;        // At last element so no jump

        // In this program , memoization was bottom up, hence tabulation will be top down
        // hence i =n-2 to 0
        // change index to i
        //change func() to dp[]
        for(int i=n-2; i>=0; i--){
            int limit = nums[i];

            int overall_ans = Integer.MAX_VALUE/2;
            for(int j=1;j<=limit;j++){
                if(i+j <=n-1){
                    int temp_ans = 1 + dp[i+j];

                    if(overall_ans> temp_ans){
                        overall_ans = temp_ans;
                    }
                }
            }
            dp[i] = overall_ans;
        }
        return dp[0];
        
    }
}
