package dp.level2;

import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1
public class subset_sum_exist_gfg {
    public static void main(String[] args) {
        // int N = 6; 
        // int arr[] = {3, 34, 4, 12, 5, 2};
        // int sum = 9; 

        int N = 100;
        int arr[] = {83, 52, 24, 15, 27, 57, 92, 63, 71, 21, 78, 43, 9, 41, 69, 68, 30, 67, 9, 17, 46, 54, 15, 41, 88, 7, 42, 30, 53, 55, 85, 88, 7, 8, 2, 85, 17, 93, 47, 39, 66, 25, 81, 26, 17, 49, 45, 98, 67, 53, 14, 65, 58, 29, 5, 46, 87, 46, 27, 39, 53, 12, 26, 11, 71, 80, 95, 87, 24, 42, 25, 41, 18, 6, 66, 86, 6, 10, 83, 25, 14, 48, 89, 72, 76, 45, 69, 62, 42, 47, 53, 94, 10, 30, 56, 81, 61, 51, 19, 37};
        int sum = 939;

        System.out.println(isSubsetSum(N, arr, sum));
        
    }
    static Boolean dp[][];
    static Boolean isSubsetSum(int N, int arr[], int sum){
        dp = new Boolean[sum+1][N+1];

        for(int i=0;i<dp.length; i++){
            Arrays.fill(dp[i], null);
        }

        return ways(arr, sum, N);
    }

    static boolean ways(int a[], int target, int n){
        int i,j;

        // when target =0 and n is anything
        for(j=1;j<=n; j++){                      // if we have reached the target
            dp[0][j] = true;
        }

        // when target = anything and n = 0 
        for(i=1;i<=target; i++){                      // if all the elements of a[] are finished
            dp[i][0] = false;
        }

        //when target = 0 and n = 0
        dp[0][0] = true; 
        
        
        //change logic to loop
        //change target -> i , n->j, fun()->dp[][]
        for(i=1; i<=target; i++){
            for(j=1; j<=n; j++){ 
                int index = j-1;
                boolean ans1 = false, ans2=false;
                if(i - a[index] >= 0){
                    //Include
                    ans1 = dp[i-a[index]][j-1];
                    
                }
                //don't include
                ans2 =  dp[i][j-1]; 
    
                dp[i][j] = ans1 || ans2;
            }
        }

        return dp[target][n];
        
    }
}
