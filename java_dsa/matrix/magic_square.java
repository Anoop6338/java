package matrix;

import java.util.Arrays;

public class magic_square {
    public static void main(String[] args) {
        int n =5;
        if(n%2==0){
            System.out.println("number is odd");
        }else{
            square(n);
        }
    }
    static void square(int n){
        int a[][] = new int[n][n];

        int count =1;
        int i=0;
        int j =n/2;
        int orig_j,orig_i;

        a[i][j] = count;
        count++;

        while(count<=n*n){

            orig_i =i;
            orig_j =j;

            // diagonal
            i=i-1;  
            j=j+1;

            if(i==-1){      //rotate column as out of bound
                i=n-1;
            }
            if(j==n){       // rotate row as out of bound
                j=0;
            }

            if(a[i][j]==0){     //if 0 fill the number
                a[i][j]=count;
                count++;
            }
            else{               // backtrack 
                i=orig_i;
                j= orig_j;

                i=i+1;          // fill 1 row down
                a[i][j]=count;          
                count++;
            }

        }
 
        printing(a);
    }

    static void printing(int[][] a){
        for(int i=0; i<a.length; i++){
            System.out.println(Arrays.toString(a[i]));

        }

    }
}
