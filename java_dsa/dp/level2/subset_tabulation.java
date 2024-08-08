package dp.level2;

import java.util.Arrays;
// leetcode 40 
// also called target sum / combination 2

public class subset_tabulation {
    public static void main(String[] args) {
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
        int i,j;

        // when target =0 and n is anything
        for(j=1;j<=n; j++){                      // if we have reached the target
            dp[0][j] = 1;
        }

        // when target = anything and n = 0 
        for(i=1;i<=target; i++){                      // if all the elements of a[] are finished
            dp[i][0] = 0;
        }

        //when target = 0 and n = 0
        dp[0][0] = 1; 
        
        
        //change logic to loop
        //change target -> i , n->j, fun()->dp[][]
        for(i=1; i<=target; i++){
            for(j=1; j<=n; j++){ 
                int index = j-1;
                int ans1 =0, ans2=0;
                if(i - a[index] >= 0){
                    //Include
                    ans1 = dp[i-a[index]][j-1];
                    
                }
                //don't include
                ans2 =  dp[i][j-1]; 
    
                dp[i][j] = ans1+ans2;
            }
        }

        return dp[target][n];
        
    }
}
