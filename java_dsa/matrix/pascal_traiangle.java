/* Leet code 118
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainal = new ArrayList<>();
        int a[][] = new int[numRows+1][numRows+1];

        for(int i=0; i<numRows; i++){
            List<Integer> al = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0||i==j){
                    a[i][j] = 1;
                    al.add(a[i][j]);
                }
                else{
                    a[i][j]= a[i-1][j-1]+a[i-1][j];
                    al.add(a[i][j]);
                }
            }
            mainal.add(al);
        }
        return mainal;
    }
} 
*/


/* Leetcode problem 119
 class Solution {
    public List<Integer> getRow(int rowIndex) {
        int a[][] = new int[rowIndex+1][rowIndex+1];
        List<Integer> al = new ArrayList<>();


        for(int i=0; i<=rowIndex; i++){
            for(int j=0; j<=i; j++){
                if(j==0||i==j){
                    a[i][j] = 1;
                    if(i==rowIndex){
                        al.add(a[i][j]);
                    }
                }
                else{
                    a[i][j]= a[i-1][j-1]+a[i-1][j];
                    if(i==rowIndex){
                        al.add(a[i][j]);
                    }
                }
            }
        }
        return al;
    }
}
 */


package matrix;

import java.util.Arrays;

public class pascal_traiangle {
    public static void main(String[] args) {
        int num = 4;
        int a[][]=new int[num+1][num+1];
        pascal(num,a);
        
        printing(a);
    }

    static int[][] pascal(int num, int a[][]) {
        for(int i=0; i<=num ;i++){
            for(int j=0; j<=i; j++){
                if(j==0 || i==j){
                    a[i][j]=1;
                }
                else{
                    a[i][j]= a[i-1][j-1]+a[i-1][j];
                }
            }
           
        }
        return a;
    }
    static void printing(int[][] a){
        for(int i=0; i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }

    }
}
