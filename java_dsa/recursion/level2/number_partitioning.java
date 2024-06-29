package recursion.level2;

public class number_partitioning {
    public static void main(String[] args) {
        int n = 3;
        print(n);
    }

    static void print(int n){
        results(n, "");
    }
    static void results(int n, String ans){
        if(n==0){
            System.out.println(ans);
        }
        else{
            for(int i=n; i>=1;i--){
                results(n-i , ans+i+" ");
            }
        }
    }
}
