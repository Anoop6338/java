package recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int l = a.length;
        sum_tail(a, l-1, 0);

        System.out.println(sum_head(a, l-1));
    }
    static void sum_tail(int a[], int i, int sum){
        if(i==-1){
            System.out.println(sum);
        }
        else{
            sum = sum+ a[i];
            sum_tail(a, i-1, sum);
        }
    }

    static int sum_head(int a[], int i){
        if(i==-1){
            return 0;
        }
        else{
            return a[i]+ sum_head(a, i-1);
        }
    }
}
