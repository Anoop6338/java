package dp.level2.memoization;

import java.util.*;
// leetcode 40 
// also called target sum / combination 2
public class subset {
    public static void main(String[] args) {
        // int a[] ={1,2,7,8,10};
        // int target = 10;
        int a[] ={10,1,2,7,6,1,5};
        int target = 8;
        System.out.println("no of ways = "+subSet(a, target));
    }

    static int dp[][];  
    static int subSet(int a[], int target){
        int n = a.length;
        dp = new int[target+1][n+1];

        for(int i=0;i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        return ways(a, target, n);

    }

    static int ways(int a[], int target, int n){
        if(target == 0 ){           // if we have reached the target
            return dp[0][n] = 1;
        }
        else if(n==0){              // if all the elements of a[] are finished
            return dp[target][0] = 0;
        }
        else{
            if(dp[target][n]!=-1){      // if already in dp[][]
                return dp[target][n];
            }
            else{
                int index = n-1;
                int ans1 =0, ans2=0;
                if(target - a[index] >= 0){
                    ans1 =  ways(a, target- a[index], n-1);
                    
                }
                ans2 = ways(a, target, n-1);
    
                return dp[target][n] = ans1+ans2;
            }
            
        }
    }
}