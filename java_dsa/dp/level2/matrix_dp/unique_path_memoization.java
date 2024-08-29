package dp.level2.matrix_dp;
//leetocde 62
import java.util.Arrays;

public class unique_path_memoization {
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
        if(r==0 || c==0){      
            return dp[0][0] = 1;
        }
        else{
            if(dp[r][c]!= -1){
                return dp[r][c];
            }
            else{
                int up = r-1;
                int left = c-1;
    
                if(r-1>=0){
                    up = ways(r-1, c);
                }
    
                if(c-1 >=0){
                    left = ways(r, c-1);
                }
    
                return dp[r][c] = up+left;
            }

        }
    }
}
