package dp.level2.matrix_dp;

import java.util.Arrays;

// leetocde 62
public class unique_path_tabulation {
        public static void main(String[] args) {
        int m =3;
        int n =2;
        System.out.println(uniquePaths(m, n));
    }

    static int dp[][];
    static int uniquePaths(int m, int n) {
        int r = m-1;
        int c = n-1;

        dp = new int[r+1][c+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        return ways(r, c);
    }

    static int ways(int r, int c){
        int i,j;

        //r=0, c=anything, return 1
        for(j=1; j<=c; j++){
            dp[0][j] =1;
        }

        // r= anything, c= 0, return 1
        for(i=1;i<=r; i++){
            dp[i][0] =1;
        }

        // r=0, c=0, return 1
        dp[0][0] = 1;

        for(i=1;i<=r; i++){
            for(j=1; j<=c; j++){
                int up = i-1;
                int left = j-1;
    
                if(i-1>=0){
                    up = dp[i-1][j];
                }
    
                if(j-1 >=0){
                    left = dp[i][ j-1];
                }
    
                dp[i][j] = up+left;
            }
        }
        return dp[r][c];

    }
}
