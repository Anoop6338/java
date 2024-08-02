package dp.level1.tabulation;

import java.util.Arrays;

public class min_steps_toReach1 {
    public static void main(String[] args) {
        int num =9000;
        long speed1 = System.currentTimeMillis();
        System.out.println(min_steps(num));
        System.out.println(System.currentTimeMillis()- speed1 );
    }

    static int min_steps(int n){
        int dp[] = new int[n+1];;
        Arrays.fill(dp, -1);

        dp[1] = 0;   
        
        for(int i=2; i<=n;i++){
            int ans1 = Integer.MAX_VALUE, ans2 =Integer.MAX_VALUE, ans3 =Integer.MAX_VALUE;

            if(i-1 >=1){
                ans1 = 1+ dp[i-1];
            }

            if(i%2 ==0){
                ans2 = 1+ dp[i/2];
            }

            if(i%3 ==0){
                ans3 = 1+ dp[i/3];
            }

            dp[i] = Math.min(ans1, Math.min(ans2, ans3));
        }
        return dp[n];
    }
}
