package matrix;

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix_Q54 {

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(spiralOrder(matrix));
    }
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> main = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int x1 =0;
        int x2 =col-1;
        int y1 =0;
        int y2 =row-1;
        int count = 1;
        int max =row*col;
    
        int i=x1;
        int j=y1;

        while(count <= max){

            for(j=x1;j<=x2;j++){
                main.add(matrix[i][j]);
                count++;
            }
            if (count>max) {
                break;
            }
            j--;
            y1++;


            for(i=y1; i<=y2; i++){
                main.add(matrix[i][j]);
                count++;
            }
            if (count>max) {
                break;
            }
            i--;
            x2--;


            for(j=x2; j>=x1; j--){
                main.add(matrix[i][j]);
                count++;
            }
            if (count>max) {
                break;
            }
            y2--;
            j++;


            for(i=y2; i>=y1; i--){
                main.add(matrix[i][j]);
                count++;
            }
            if (count>max) {
                break;
            }
            i++;
            x1++;
        }
        return main;
    }
}