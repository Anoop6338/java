/*
        Print elements in a spiral matrix

        1  2  3  4
        5  6  7  8
        9  10 11 12
        13 14 15 16

        output = 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */


public class spiral_matrix {
    public static void SpiralMatrix(int num[][]){
        int start_row = 0;
        int end_row = num.length-1;

        int start_col = 0;
        int end_col = num[0].length-1;

        while(start_row<=end_row && start_col<=end_col){        //  i= row        j= coloumn
            //top boundary
            for(int j= start_col; j<=end_col; j++){
                System.out.print(num[start_row][j]+" ");
            }

            // right boundary
            for(int i=start_row+1; i<=end_row; i++){
                System.out.print(num[i][end_col]+" ");
            }

            //bottom boundary
            for(int j=end_col-1; j>=start_col; j--){
                if(start_col==end_col){
                    break;
                }
                System.out.print(num[end_row][j]+" ");
            }

            //left boundary
            for(int i=end_row-1; i>=start_row+1; i--){
                if(start_row==end_row){
                    break;
                }
                System.out.print(num[i][start_col]+" ");
            }

            start_row ++;
            end_row --;

            start_col ++;
            end_col --;

        }
        System.out.println();
    }
     public static void main(String[] args) {
        int matrix[][] =   {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        SpiralMatrix(matrix);
     }
}
