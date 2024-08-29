package dp.level2.matrix_dp;

import java.util.Arrays;
// leetcode 64
public class min_path_sum_tabulation {
        public static void main(String[] args) {
        int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};
        // int grid[][] = {{1,2,3},{4,5,6}};
        System.out.println(minPathSum(grid));

        for(int i=0; i<dp.length;i++){
            System.out.println(Arrays.toString(dp[i]));
        }
    }

    static int dp[][];
    static int minPathSum(int[][] grid) {
        int r = grid.length-1;
        int c= grid[0].length-1;

        dp = new int[r+1][c+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return ways(r, c, grid);
    }

    static int ways(int r, int c, int grid[][]){

        for(int i=0; i<=r; i++){
            for(int j=0; j<=c; j++){

                if(i==0 && j==0){
                    dp[0][0] = grid[0][0];
                }
                else{
                    int up = Integer.MAX_VALUE/2;
                    int left = Integer.MAX_VALUE/2;
        
                    if(i-1>=0){
                        up = grid[i][j] + dp[i-1][ j];
                    }
        
                    if(j-1>=0){
                        left = grid[i][j] + dp[i][j-1];
                    }
        
                    dp[i][j] = Integer.min(up, left);
                }
            }
        }
        return dp[r][c];
    }
}
