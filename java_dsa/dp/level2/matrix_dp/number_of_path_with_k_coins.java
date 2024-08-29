package dp.level2.matrix_dp;
// https://www.geeksforgeeks.org/problems/number-of-paths-in-a-matrix-with-k-coins2728/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class number_of_path_with_k_coins {
    public static void main(String[] args) {
        int k = 12;
        int n = 3;
        int arr[][] = {{1, 2, 3}, {4, 6, 5}, {3, 2, 1}};
        System.out.println(numberOfPath(n, k, arr));
    }

    static long numberOfPath(int n, int k, int [][]arr) {
        int r = n-1;
        int c = n-1;
        return ways(r, c, k, arr, "");
    }

    static int ways(int r, int c, int k , int arr[][], String ans){
        if(r==0 && c==0){       // if we have already reached to arr[0][0]
            k=k-arr[r][c];  // subtract the last element
            if(k==0){   // valid solution
                System.out.println(ans);
                return 1;
            }
            else{       // invalid solution
                return 0;
            }
        }
        
        else{
            int up = 0;
            int left = 0;

            if(k-arr[r][c] >=0 && r-1 >=0){ 
                // up movement 
                up = ways(r-1, c, k-arr[r][c], arr, ans+arr[r][c]+" ");
            }

            if(k-arr[r][c] >=0 &&  c-1 >=0){
                // left movement
                left = ways(r, c-1, k-arr[r][c], arr, ans+arr[r][c]+" ");
            }

            return up+left;
        }
    }
}
