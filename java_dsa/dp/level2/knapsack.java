package dp.level2;

public class knapsack {
    public static void main(String[] args) {
        int weight[] = {3,1,2,5,4};
        int values[] = {10,90,30,70,40};
        int W = 10;
        int n = weight.length-1;

        knapSack_tail(W, weight, values, n, "");

        System.out.println(knapSack_head(W, weight, values, n));
    }


    static void knapSack_tail(int W, int wt[], int val[], int n , String ans) { 
        if(n==0 || W==0){
            System.out.println(ans);
            // return 0;
        }
        else{
            int index = n-1;
            if(W-wt[index]>=0){
                knapSack_tail(W-wt[index], wt, val, n-1, ans+val[index] +"("+ wt[index]+")"+" "  );
            }

            knapSack_tail(W, wt, val, n-1, ans);
        }
    } 


    static int knapSack_head(int W, int wt[], int val[], int n ) { 
        if(n==0 || W==0){   // if no item is avaiable or bag is full
            return 0;
        }
        else{
            int index = n-1;
            int ans1 = 0, ans2 =0;
            if(W-wt[index]>=0){     // if bag is available for storage
                // include
                ans1 = val[index] + knapSack_head(W-wt[index], wt, val, n-1 );
            }

            // don't include 
            ans2 = knapSack_head(W, wt, val, n-1);

            return Math.max(ans1, ans2);
        }
    } 
}
