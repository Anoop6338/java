package linkedList;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {
        int numRows =5;
        printing(generate(numRows));
    }

    static List<List<Integer>> generate(int numRows) {
        int matrix[][] = new int[numRows][numRows];

        pascalMatrix(numRows, matrix);

        List<List<Integer>> mainList = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            List<Integer> al = new ArrayList<>();
            for(int j=0; j< matrix[0].length;j++){
                if(matrix[i][j]!=0){
                    al.add(matrix[i][j]);
                }
            }
            mainList.add(al);
        }
        return mainList;

    }

    static void pascalMatrix(int num, int matrix[][]){

        for (int i=0; i<num;i++){
            for(int j=0;j<num;j++){

                if(i<=j){
                    if(i==j || j==0 ){
                        matrix[i][j]=0;
                    }
                    else{
                        matrix[i][j]= matrix[i-1][j-1] + matrix[i-1][j];
                    }
                   
                }
                
            }
        }
    }



    static void printing(List<List<Integer>> listOfLists) {
        for (List<Integer> innerList : listOfLists) {
            for (Integer val : innerList) {
                System.out.print(val + " --> ");
            }
            System.out.println("X");
        }
        
    }
}
