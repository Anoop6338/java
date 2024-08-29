package dp.level2.matrix_dp;

import java.util.Arrays;

// leetcode 64
public class min_path_sum_memoization {
    public static void main(String[] args) {
        int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
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
        if(r==0 && c==0){           // top left corner value is returned
            return dp[r][c] = grid[0][0];
        }
        else{
            if(dp[r][c] !=-1){
                return dp[r][c];
            }
            else{
                int up = Integer.MAX_VALUE/2;
                int left = Integer.MAX_VALUE/2;
    
                if(r-1>=0){
                    up = grid[r][c] + ways(r-1, c, grid);
                }
    
                if(c-1>=0){
                    left = grid[r][c] + ways(r, c-1, grid);
                }
    
                return dp[r][c] = Integer.min(up, left);
            }

        }
    }
}
