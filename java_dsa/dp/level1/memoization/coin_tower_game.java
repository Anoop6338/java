package dp.level1.memoization;

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
        if(n==0 ){

            return dp[0] = 0;
        }

        else if (n == 1 || n == x || n ==y){

            // return dp[n] = 1;        // can also use this... but only in memoization

            dp[1] = 1;
            dp[x] = 1;
            dp[y] = 1;
            return 1;
        }

        else{
            if(dp[n]!=-1){
                return dp[n];
            }
            else{
                int ans1=Integer.MAX_VALUE, ans2 =Integer.MAX_VALUE, ans3 =Integer.MAX_VALUE;
                if(n-1 >= 0){
                    ans1 = 1 + steps(n-1, x, y);
                }
                
                if(n-x >=0){
                    ans2 = 1 + steps(n-x, x, y);
                }
    
                if(n-y >=0){
                    ans3= 1 + steps(n-y, x, y);
                }
                
                return dp[n] = Math.min(ans1, Math.min(ans2, ans3));
            }

        }
    }
    
}