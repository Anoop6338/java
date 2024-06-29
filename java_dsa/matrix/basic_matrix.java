package matrix;

public class basic_matrix{

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i=0; i<=2 ; i++){
            for(int j=0; j<=2; j++){
                if(i<=j){
                    System.out.print(" "+a[i][j]+" ");
                }
                else{
                    System.out.print(" _ ");
                }
            }
            System.out.println();
        }
    }
}