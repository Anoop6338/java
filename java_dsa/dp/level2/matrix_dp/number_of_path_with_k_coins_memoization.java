package dp.level2.matrix_dp;
// https://www.geeksforgeeks.org/problems/number-of-paths-in-a-matrix-with-k-coins2728/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

public class number_of_path_with_k_coins_memoization {
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
        if(r==0 && c==0){       // if we have already reached to arr[0][0]
            if(k-arr[r][c]==0){         // subtract the last element
                return dp[0][0][0] = 1;     // valid solution
            }
            else{       // invalid solution
                return dp[0][0][k] = 0;
            }
        }
        else{
            if(dp[r][c][k] !=-1){
                return dp[r][c][k];
            }
            else{
                long up = 0;
                long left = 0;
    
                if(k-arr[r][c] >=0 && r-1 >=0){ 
                    // up movement 
                    up = ways(r-1, c, k-arr[r][c], arr);
                }
    
                if(k-arr[r][c] >=0 &&  c-1 >=0){
                    // left movement
                    left = ways(r, c-1, k-arr[r][c], arr);
                }
    
                return dp[r][c][k] =  up+left;
            }
        }
    }
}
