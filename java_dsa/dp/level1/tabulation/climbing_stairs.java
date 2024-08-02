package dp.level1.tabulation;

import java.util.Arrays;

// leetcode 70
public class climbing_stairs {

    public static void main(String[] args) {
        int n =44;
        System.out.println(climbStairs(n));
        // System.out.println(Arrays.toString(dp));

    }


    static int climbStairs(int n){

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;

        for(int i=1; i<=n; i++){
            int ans1 = 0, ans2 =0;

            if(i-1>=0){
                ans1 = dp[i-1];
            }
            if(i-2>=0){
                ans2 = dp[i-2];
            }
            dp[i]= ans1 + ans2;
        }
        return dp[n];
    }
}
