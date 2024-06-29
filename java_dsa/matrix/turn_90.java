package matrix;

import java.util.Arrays;

public class turn_90 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}}; 
        turn(a);
        // printing(a);
    }
    
    static void turn(int a[][]){
        int row = a.length;
        int col = a[0].length;
        int b[][] = new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j =0; j<col; j++){
                b[j][col-1-i]=a[i][j];
            }
        }
        for(int i=0; i< a.length ;i++){
            System.out.println(Arrays.toString(b[i]));
        }
    }
    // static void printing(int a[][]){
    //     for(int i=0; i< a.length ;i++){
    //         System.out.println(Arrays.toString(a[][]));
    //     }
    // }
}
