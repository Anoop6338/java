package arrays;
// leetcode 121
public class best_time_to_buy_sell_stocks {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println("output "+maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        int diff =0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                diff = Math.max(prices[j]-prices[i],diff );
            }
        }
        return diff;
    }
}
