package matrix;

import java.util.Arrays;

public class sort_diagonal {
    public static void main(String[] args) {
        int a[][] = {{9,8,7},{6,5,4},{3,2,1}};

        sortArray(a);

        printArray(a);
    }

    static void printArray(int[][] a) {
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
        
    }
    static void sortArray(int[][] a) {
        int temp[] = new int[a.length];
        for(int i=0; i<a.length;  i++){
            temp[i]=a[i][i];
        }
        Arrays.sort(temp);
        for(int i=0; i<a.length;  i++){
            a[i][i]=temp[i];
        }
     
    }
}
