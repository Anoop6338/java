package dp.level1;

import java.util.Arrays;

// minimum sq required to represent a number
//  10 -> 3^2 + 1^2
public class min_sq_to_represent_num {

    static int dp[];
    public static void main(String[] args) {
        int num = 10;
        dp = new int[num+1];
        Arrays.fill(dp, -1);
        System.out.println(min_steps_withDp(num));

        System.out.println(min_steps_withoutDp(num, ""));
    }

    static int min_steps_withDp(int num){
        if(num==0){
            return dp[0] = 0;
        }
        else{
            if(dp[num]!=-1){    // answer already available in the dp[]
                return dp[num];
            }
            else{
                int ans_prev = Integer.MAX_VALUE;
                for(int i=1; i<=Math.sqrt(num); i++){
                    int ans = 1 + min_steps_withDp(num - (int)(Math.pow(i, 2)));
    
                    ans_prev = Math.min(ans_prev, ans);
                }
                return dp[num] = ans_prev;
            }
        }
    }


    static int min_steps_withoutDp(int num, String s){
        if(num==0){
            System.out.println(s);
            return 0;
        }
        else{
            int ans_prev =Integer.MAX_VALUE;
            for(int i=1; i<=Math.sqrt(num); i++){
                int ans = 1+ min_steps_withoutDp(num - (int)(Math.pow(i, 2)) , s+" + "+i+"^2"+"  ");

                ans_prev = Math.min(ans_prev, ans);
            }
            return ans_prev;
        }
    }
}
