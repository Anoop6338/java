public class diagonal_sum {
    public static void DiagonalSum(int num[][]){
        int primary_diagonal = 0;
        int secondary_diagonal = 0;

        //Method 1 ---> Brute force
        // time complexity --> O(n^2)
        
        int n = num.length-1;
        //int m = num[0].length-1;

        // for(int i=0; i<=n; i++){
        //     for(int j=0; j<=m; j++){
        //         if(i==j){
        //             primary_diagonal += num[i][j];
        //         }
        //         else if(i+j==n){
        //             secondary_diagonal += num[i][j];
        //         }
        //     }
        // }

        //Method 2 ---> Linear
        // time complexity --> O(n)

        for(int i=0; i<=n; i++){
            //primary diagonal
            primary_diagonal += num[i][i];

            //secondary diagonal
            if(i!= n-i)
                secondary_diagonal +=num[i][n-i];       // i+j=n
        }

        int Sum = primary_diagonal+secondary_diagonal;
        System.out.println("Sum of diagonals of given matrix is : "+Sum);
    }
    public static void main(String[] args) {
        int matrix[][] =   {{0,1,2},
                            {3,4,5},
                            {6,7,8}};
        DiagonalSum(matrix);


    }
}
