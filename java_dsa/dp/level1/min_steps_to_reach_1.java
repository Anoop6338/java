package dp.level1;

import java.util.Arrays;

// find minimum steps to reach 1 using (-1, /2, /3) only
public class min_steps_to_reach_1 {

    static int dp[];
    public static void main(String[] args) {
        int num =9000;
        long speed1 = System.currentTimeMillis();

        dp = new int[num+1];
        Arrays.fill(dp, -1);

        System.out.println(min_steps(num));
        // System.out.println(Arrays.toString(dp));
        System.out.println(System.currentTimeMillis()- speed1 );

    }

    static int min_steps(int num){
        if(num == 1){
            // System.out.println(s);
            return dp[1] = 0;       // store in dp
        }
        else {  
            // if already answer is avaiable in dp[]
            if(dp[num]!=-1){
                return dp[num];
            }
            else{   
                // if not available make tree
                int ans1 = Integer.MAX_VALUE, ans2 =Integer.MAX_VALUE, ans3 =Integer.MAX_VALUE;
                if(num-1 >=1){
                    ans1 = 1+ min_steps(num-1);
                }

                if(num%2 ==0){
                    ans2 = 1+ min_steps(num/2);
                }

                if(num%3 ==0){
                    ans3 = 1+ min_steps(num/3);
                }

                return dp[num] = Math.min(ans1, Math.min(ans2, ans3));
            }
        }
    }
}
