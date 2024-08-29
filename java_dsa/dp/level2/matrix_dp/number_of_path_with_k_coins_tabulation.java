package dp.level2.matrix_dp;
// https://www.geeksforgeeks.org/problems/number-of-paths-in-a-matrix-with-k-coins2728/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

// NO NEED FOR THIS ........
public class number_of_path_with_k_coins_tabulation {
    
    public static void main(String[] args) {
        int k = 12;
        int n = 3;
        int arr[][] = {{1, 2, 3}, {4, 6, 5}, {3, 2, 1}};
        System.out.println(numberOfPath(n, k, arr));
    }

    static long dp[][][];
    static long numberOfPath(int n, int k, int [][]arr) {
        int r = n-1;
        int c = n-1;
        dp = new long[r+1][c+1][k+1];
        for(int i=0; i<=r; i++){
            for(int j=0; j<=c; j++){
                for(int l=0 ;l<=k; l++){
                    dp[i][j][l] = -1;
                }
            }
        }
        return ways(r, c, k, arr);
    }

    static long ways(int r, int c, int k , int arr[][]){
        int i,j,l;
        
        // r==0, c==0 ,k==anything, return 0;
        for(l=1; l<=k; l++){
            dp[0][0][l] = 0;        // invalid sol
        }

        // r==0, c==0, l==0 , return 1;
        dp[0][0][0] = 1;        // valid sol

        k=k-arr[0][0];


        for(i=1; i<=r; i++){
            for(j=1; j<=c; j++){
                for(l=1; l<=k; l++){
                    long up = 0;
                    long left = 0;
        
                    if(l-arr[i][j] >=0 && i-1 >=0){ 
                        // up movement 
                        up = dp[i-1][j][l-arr[i][j]];
                    }
        
                    if(l-arr[i][j] >=0 &&  j-1 >=0){
                        // left movement
                        left = dp[i][j-1][l-arr[i][j]];
                    }
        
                    dp[i][j][l] =  up+left;
                }
            }
        }
        
        return dp[r][c][k];

        
    }
}
