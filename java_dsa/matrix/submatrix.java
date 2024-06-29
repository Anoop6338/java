/*
 *      [9,9,9,9,9,9]           [9,9,9,9,9,9]  
 *      [8,8,8,8,8,8]           [8,6,6,6,6,8]
 *      [7,7,7,7,7,7]   --->    [7,7,7,7,7,7]         
 *      [6,6,6,6,6,6]           [6,8,8,8,8,6]
 *      [5,5,5,5,5,5]           [5,5,5,5,5,5]
 * 
 * 
 *          [6,6,6,6]
 *          [7,7,7,7]
 *          [8,8,8,8]
 */


package matrix;

import java.util.Arrays;

public class submatrix {
    public static void main(String[] args) {
    //    int a[][] = {{9,9,9,9,9,9},{8,8,8,8,8,8},{7,7,7,7,7,7},{6,6,6,6,6,6},{5,5,5,5,5,5}};
        int a[][] ={{12,11,9,3},{4,5,7,2},{1,8,6,10},{14,15,16,13}};
       extract(a);
       printing(a);
    }

    static void printing(int[][] a) {
        for(int i =0; i<a.length; i++){
            System.out.println(Arrays.toString(a[i]));
           }
    }

    static void extract(int[][] a) {
       int row = a.length;
       int col = a[0].length;

       int b[][] = new int[row-2][col-2];

       for(int i=1; i<row-1; i++){          //formation of new array b
        for(int j=1; j<col-1 ;j++){
            b[i-1][j-1] = a[i][j];
        }
       }

       sorting(b);

       for(int i=1; i<row-1; i++){          // copying back to a
        for(int j=1; j<col-1 ;j++){
            a[i][j] = b[i-1][j-1];
        }
       }
    }

    static void sorting(int[][] b) {
        int col_new = b[0].length;
        int row_new = b.length;

        int temp[] = new int[col_new*row_new];

        int n=0;                                    //coping to 1d array
        for(int i=0; i<row_new; i++){
            for(int j=0; j<col_new; j++){
                temp[n]=b[i][j];
                n++;
            }
        }
        Arrays.sort(temp);                      //sorting 1d array

        n=0;
        for(int i=0; i<row_new; i++){               //coping back to 2d
            for(int j=0; j<col_new; j++){
                b[i][j] = temp[n];
                n++;
            }
        }
    }
}
