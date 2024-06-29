package matrix;

import java.util.*;

public class mirror{
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        mirroring(a);
        // printing(a);
    }

    // public static void printing(int[][] a) {
    //     for(int i=0 ; i<a.length;i++){
    //         System.out.println(Arrays.toString(a));
    //     }
    // }

    public static void mirroring(int[][] a) {
        int col = a[0].length;
        int row = a.length;
        int b[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int temp = a[i][j];
                a[i][j]= b[i][col-1-j];
                b[i][col-1-j]= temp;
            }
        }
        for(int i=0 ; i<a.length;i++){
            System.out.println(Arrays.toString(b[i]));
        }
    }
}
