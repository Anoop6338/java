package dp.level2.unbounded_knapsack;
// leetcode 322
public class coin_change {
    public static void main(String[] args) {
        int amount =11;
        int coins[] ={1,2,5};
        System.out.println(coinChange(coins, amount));
    }

    static int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int result = ways(amount, n, coins, "");
        if(result > (Integer.MAX_VALUE/2) -1){       // if result is greater than integer.max_value/2 -1, then that means amount can't be made
            return -1;          // thus we need to return -1
        }
        return result;
    }

    static int ways(int amount, int n, int coins[], String ans){
        if(amount==0){
            System.out.println(ans);
            return 0;
        }
        else if(n==0){
            return Integer.MAX_VALUE/2;     // amount can't be made
        }
        else{
            int index = n-1;
            int ans1 = Integer.MAX_VALUE/2, ans2 = Integer.MAX_VALUE/2;     // integer.max_value/2 so as not to overflow

            if(amount-coins[index] >= 0){
                ans1 = 1 + ways(amount-coins[index], n, coins, ans+coins[index]+" ");
            }
            ans2 = ways(amount, n-1, coins, ans);

            return Math.min(ans1, ans2);
        }
    }
}
