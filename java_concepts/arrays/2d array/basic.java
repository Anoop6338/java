import java.util.*;

public class basic {
    public static boolean search(int num[][], int key){ //searching into the matrix
        int n=num.length;
        int m= num[0].length;
        for(int i =0; i<n; i++){
            for(int j =  0; j<m; j++){
                if(num[i][j]==key){
                    System.out.println("found at cell no. ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void MinMax(int num[][]){ // To find Minimum and Maximum element of the array
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int n=num.length;
        int m= num[0].length;
        for(int i=0; i<n; i++){
            for(int j= 0; j<m; j++){
                if(num[i][j]>max){
                    max=num[i][j];
                }
                if(num[i][j]<min){
                    min=num[i][j];
                }
            }
        }
        System.out.println("Minimum values is : "+min);
        System.out.println("Maximum value is : "+max);
    }

    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        //int matrix[][] = {{2,4,5},{5,4,5},{5,4,8}};   //defining a 2d array

        int n=matrix.length;
        int m= matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i =0; i<n; i++){    // Inserting into the matrix
            for(int j =  0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        for(int i =0; i<n; i++){    //printing the matrix
            for(int j =  0; j<m; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

        //search(matrix, 6);

        MinMax(matrix);


        sc.close();
    }
}
