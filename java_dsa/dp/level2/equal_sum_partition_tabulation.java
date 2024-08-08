package dp.level2;

import java.util.Arrays;

public class equal_sum_partition_tabulation {
        public static void main(String[] args) {
        int nums[] = {1,5,11,5};
        System.out.println(canPartition(nums));
    }

    static boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();

        if(sum % 2 !=0){
            return false;
        }
        else{
            int target = sum/2;
            return ways(nums, target, nums.length);
        }
    }

    static Boolean ways(int a[], int target, int n){

        Boolean dp[][] = new Boolean[target+1][n+1];

        for(int i=0;i<dp.length; i++){
            Arrays.fill(dp[i], null);
        }

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
