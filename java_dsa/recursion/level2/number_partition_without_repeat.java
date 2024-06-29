package recursion.level2;

public class number_partition_without_repeat {
    public static void main(String[] args) {
        int n=4;
        partitioning(n, n, "");
    }

    static void partitioning(int n , int max, String ans){
        if(n==0){
            System.out.println(ans);
        }
        else{
            for(int i=n;i>=1;i--){
                if(i<=max){
                    partitioning(n-i, i, ans+i+" ");
                }
            }
        }
    }
}
