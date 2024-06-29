package recursion.level2;
// variation of number partitioning
public class max_product {
    public static void main(String[] args) {
        int n = 8;
        int max[] ={0};
        String ans[] ={""};
        Max_product(n,max,1,ans,"");
        System.out.println(max[0]);
        System.out.println(ans[0]);
    }

    static void Max_product(int n, int max[] ,int temp, String ans[], String temp2){
        if(n==0){
            if(max[0]<temp){
                max[0]=temp;
                ans[0] = temp2;
            }
        }
        else{
            for(int i=n;i>=1;i--){
                Max_product(n-i, max,temp*i,ans,temp2+i+" ");
            }
        }
    }
}
