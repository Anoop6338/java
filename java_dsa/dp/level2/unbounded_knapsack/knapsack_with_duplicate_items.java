package dp.level2.unbounded_knapsack;
//  https://www.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class knapsack_with_duplicate_items {
    public static void main(String[] args) {
        int W =10; 
        int N =5;
        int wt[] = {3,1,2,5,4};
        int val[] = {10,90,30,70,40};

        // knapSack(W, N, val, wt, "");
        System.out.println(knapSack_head(W, N, val, wt, ""));
    }

    static void knapSack(int W, int n, int val[], int wt[], String ans) {
        if(W==0){
            System.out.println(ans);
        }
        else if(n==0){
            // do nothing
        }
        else{
            int index = n-1;

            if(W-wt[index] >=0){
                //include and keep the cursor at same position to include again
                knapSack(W-wt[index], n, val, wt, ans+val[index] +"("+ wt[index]+")"+" ");   
            }

            // don't include
            knapSack(W, n-1, val, wt, ans);
        }
    }


    static int knapSack_head(int W, int n, int val[], int wt[], String ans) {
        if(W==0){
            System.out.println(ans);
            return 0;
        }
        else if(n==0){
            return 0;
            // do nothing
        }
        else{
            int index = n-1;
            int ans1 =0 ,ans2 =0;
            if(W-wt[index] >=0){
                //include and keep the cursor at same position to include again
                ans1 = val[index] + knapSack_head(W-wt[index], n, val, wt, ans+val[index] +"("+ wt[index]+")"+" ");   
            }

            // don't include
            ans2 = knapSack_head(W, n-1, val, wt, ans);

            return Math.max(ans1,ans2);
        }
    }
}
