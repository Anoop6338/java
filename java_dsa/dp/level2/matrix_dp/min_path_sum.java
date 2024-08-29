package dp.level2.matrix_dp;
//leetcode 64
public class min_path_sum {
    public static void main(String[] args) {
        int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }

    static int minPathSum(int[][] grid) {
        int r = grid.length;
        int c= grid[0].length;
        return ways(r-1, c-1, grid);
    }

    static int ways(int r, int c, int grid[][]){
        if(r==0 && c==0){           // top left corner value is returned
            return grid[0][0];
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

            return Integer.min(up, left);
        }
    }
}
