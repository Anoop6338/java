package dp.level1.tabulation;

import java.util.Arrays;

public class min_sq_to_represent_num {
    
    public static void main(String[] args) {
        int num = 14;
        System.out.println(min_steps_withDp(num));
    }

    static int min_steps_withDp(int num){
        int dp[] = new int[num+1];
        Arrays.fill(dp, -1);

        dp[0] = 0;

        for(int i=1; i<=num; i++){
            
            int ans_prev = Integer.MAX_VALUE;
            for(int j=1; j<=Math.sqrt(i); j++){
                int ans = 1 + dp[i - (int)(Math.pow(j, 2))];
    
                ans_prev = Math.min(ans_prev, ans);
            }
            dp[i] = ans_prev;
        }
        return dp[num];
    }
}
