//leet code ques 59


package matrix;

public class spiral_matrix {
    public static void main(String[] args) {
        int n=5;
        int a[][] = new int[n][n];

        fill(a);
        printing(a);
        
    }
    static int[][] fill(int[][] a){
        int n = a.length;

        int x1, x2, y1, y2;
        x1 = 0;
        x2 = n-1;
        y1 =0;
        y2 = n-1;

        int count=1;
        int j= x1;


        int i=y1;
        
        while(count<=n*n){

            // go right
            for(j=x1; j<=x2; j++){
                a[i][j]= count;
                count++;
            }
            y1++;
            if(count >n*n){
                return a;
            }
            j--;


            //go down
            for(i=y1; i<=y2; i++){
                a[i][j]= count;
                count++;
            }
            x2--;
            if(count >n*n){
                return a;
            }
            i--;
        
            
            //go left
            for(j=x2;j>=x1; j-- ){
                a[i][j]= count;
                count++;
            }
            y2--;
            if(count >n*n){
                return a;
            }
            j++;


            // go up
            for(i=y2; i>=y1;i--){
                a[i][j]= count;
                count++;
            }
            x1++;
            if(count >n*n){
                return a;
            }
            i++;
        }

        return a;
    }
    static void printing(int[][] a){
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
