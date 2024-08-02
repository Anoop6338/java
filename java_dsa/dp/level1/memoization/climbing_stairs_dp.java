package dp.level1.memoization;

import java.util.Arrays;

// leetcode 70

public class climbing_stairs_dp {
    static int dp[];
    public static void main(String[] args) {
        int n =44;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(ways(n));
        System.out.println(Arrays.toString(dp ));
    }

    static int ways(int n){
        if(n==0){
            return dp[1]=1;
        }
        else{
            if(dp[n]!=-1){  // already answer is in dp[]
                return dp[n];
            }
            else{       // make branches
                
                int ans1 =0, ans2 =0;
                if(n-1>=0){
                    ans1 = ways(n-1);
                }
                if(n-2>=0){
                    ans2 = ways(n-2);
                }
                return dp[n] = ans1+ans2;
            }
           
        }
    }
}
