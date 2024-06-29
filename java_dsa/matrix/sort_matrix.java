package matrix;

import java.util.Arrays;

public class sort_matrix {

    public static void main(String[] args) {
        // sort each column

        int a[][] = {{9,8,7},{6,5,4},{3,2,1}};

        sortArray(a);

        print_Array(a);

    }

    static void sortArray(int a[][]){
        for(int j=0; j<a.length; j++){
            int temp[] = new int[a.length];
            for(int i=0; i< a.length; i++){
                temp[i]=a[i][j];
            }
            Arrays.sort(temp);

            for(int i=0; i< a.length; i++){
                a[i][j]=temp[i];
            }
        }
    }
    static void print_Array(int a[][]){
        for(int i =0; i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
    
}
