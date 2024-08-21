package dp.level2.unbounded_knapsack;

import java.util.Arrays;

// leetcode 343
public class Integer_break_memoization {
    public static void main(String[] args) {
        int n =10;
        System.out.println(integerBreak(n));
    }

    static int dp[][];
    static int integerBreak(int n) {
        if(n==2){
            return 1;
        }
        int length = n-1;

        int range[] = new int[length];

        int num =2;
        for(int i=0; i<range.length; i++){
            range[i] = num;
            num++;
        }

        int total_num[] = new int[length];
        for(int i=0; i<total_num.length; i++){
            total_num[i] = i+1;
        }
        
        int p = range.length;
        int R = p+2;


        dp = new int[length+1][length+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return ways(R, p-1, range, total_num, "");
    }
    
    static int ways(int R, int n, int[] range, int[] total_num, String ans){
        if(R==0){
            // System.out.println("from r"+ans);
            return dp[0][n]= 0;
        }
        else if(n==0){
            System.out.println(ans);

            return dp[R][0] = 0;
        }
        else{
            if(dp[R][n] != -1){
                return dp[R][n];
            }
            else{
                int index = n-1;
                int ans1 = 1, ans2 =1;
                if(R-range[index]>=1){
                    ans1 = range[index] * ways(R-range[index], n, range, total_num, ans+range[index]+" ");
                }
                ans2  = ways(R, n-1, range, total_num, ans);
    
                return dp[R][n] = Math.max(ans1, ans2);
            }

        }
    }
}
