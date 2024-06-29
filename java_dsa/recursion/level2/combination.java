package recursion.level2;

public class combination {
    public static void main(String[] args) {
        int n = 4;
        int r = 2;
        System.out.println(comb(n, r));
    }

    static int comb(int N, int R){
        if(R==0 || R ==N){
            return 1;
        }
        else{
            return comb(N-1, R-1) + comb(N-1, R);
        }
    }
}
