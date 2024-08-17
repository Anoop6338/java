package dp.level2.unbounded_knapsack;
// leetcode 518
public class coin_change_2 {
    public static void main(String[] args) {
        int amount = 5; 
        int coins[] = {1,2,5};
        System.out.println(change(amount, coins));
    }

    static int change(int amount, int[] coins) {
        int n  = coins.length;
        return ways(amount, n, coins, "");

    }

    static int ways(int amount ,int n,  int[] coins, String ans){
        if(amount == 0){        // we have reached to the amount needed
            System.out.println(ans);
            return 1;
        }
        else if(n == 0){        // numbers finished but amount is not reached
            return 0;
        }
        else{
            int index = n-1;
            int ans1 =0, ans2 =0;

            if(amount - coins[index]>=0){
                ans1 = ways(amount- coins[index], n, coins, ans+coins[index]+" ");
            }
            ans2 = ways(amount, n-1, coins,ans);

            return ans1+ans2;
        }
    }
}
