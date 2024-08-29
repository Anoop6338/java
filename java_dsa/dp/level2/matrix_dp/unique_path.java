package dp.level2.matrix_dp;
// leetcode 62
public class unique_path {
    public static void main(String[] args) {
        int m =3;
        int n =2;
        System.out.println(uniquePaths(m, n));
    }

    static int uniquePaths(int m, int n) {
        int r = m-1;
        int c = n-1;
        return ways(r, c, m, n);
    }

    // you can remove m and n as of no use
    static int ways(int r, int c, int m, int n){
        
        // u alternatively use any of the base cases... both work as same
        if(r==0 && c==0){
            return 1;
        }
        else if(r==0 || c==0){      
            return 1;
        }
        else{
            int up = r-1;
            int left = c-1;

            if(r-1>=0){
                up = ways(r-1, c, m, n);
            }

            if(c-1 >=0){
                left = ways(r, c-1, m, n);
            }

            return up+left;
        }
    }
}
