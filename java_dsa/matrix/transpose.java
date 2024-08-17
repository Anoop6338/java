package matrix;

import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Transpose(a);
    }

    static void Transpose(int[][] a) {
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                if(i>j){
                    int temp = a[j][i];
                    a[j][i] = a[i][j];
                    a[i][j] = temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
