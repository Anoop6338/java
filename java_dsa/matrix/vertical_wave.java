package matrix;

public class vertical_wave {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        vertical(a);
    }
    static void vertical(int [][] a){
        int row = a.length;
        int col = a[0].length;
        for(int j=0; j<col; j++){
            for(int i =0; i<row; i++){
                if(j%2==0){
                    System.out.println(a[i][j]);
                }
                else{
                    System.out.println(a[row-i-1][j]);
                }
            }
        }
    }
}
