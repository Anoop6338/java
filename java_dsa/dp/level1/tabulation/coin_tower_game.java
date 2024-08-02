package dp.level1.tabulation;

import java.util.Arrays;

public class coin_tower_game {
     public static void main(String[] args) {
        int n = 100; 
        int x = 3;
        int y = 4;
        System.out.println(findWinner(n, x, y));
    }

    static int dp[];
    static String findWinner(int n, int x, int y) {
 
        dp = new int[n+1];
        Arrays.fill(dp, -1);

        int num =  steps(n, x, y);
        System.out.println(Arrays.toString(dp));
        System.out.println("no of steps = "+num);
        if(num%2==0){
            return "B wins";
        }
        else{
            return "A wins";
        }
    }
 
    static int steps(int n, int x, int y){
        // convert base case
        dp[0] = 0;
        dp[1] = 1;
        dp[x] = 1;
        dp[y] = 1;

        // change n to i
        // change func() to dp
        // remove return keyword and add outside
        for(int i = 1 ; i <=n; i++ ){
            int ans1=Integer.MAX_VALUE, ans2 =Integer.MAX_VALUE, ans3 =Integer.MAX_VALUE;

            if(i==1 || i==x || i==y){       // skip these numbers as already filled
                continue;
            }

            else{
                if(i-1 >= 0){
                    ans1 = 1 + dp[i-1];
                }
                
                if(i-x >=0){
                    ans2 = 1 + dp[i-x];
                }
    
                if(i-y >=0){
                    ans3= 1 + dp[i-y];
                }
                
                dp[i] = Math.min(ans1, Math.min(ans2, ans3));
            }
        }
        return dp[n];
    }
}
