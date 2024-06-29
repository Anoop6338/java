package matrix;

public class negativeCount {
    public static void main(String[] args) {
        int grid[][] = {{5,1,0},{-5,-5,-5}};
        System.out.println(countNegatives(grid));    
    }
   
    static int countNegatives(int[][] grid) {
        int count =0;
        int row_len = grid.length;
        int col_len = grid[0].length;

        for(int i=0; i<row_len; i++){
            for(int j = col_len-1; j>=0; j--){
                if(grid[i][j]<0){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}
