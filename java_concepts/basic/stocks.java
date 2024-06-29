//Time complexity is O(n)
//Code to calculate max profit by buying and selling stock.

public class stocks {
    public static void MaxProfit(int sell_price[]) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < sell_price.length; i++) {
            if (buy_price < sell_price[i]) {
                int profit = sell_price[i] - buy_price;// todays price;
                max_profit= Math.max(profit, max_profit);
            } 
            else {
                buy_price = sell_price[i];
            }
        }
        System.out.println("your max profit is : "+max_profit);
    }

    public static void main(String[] args) {
        int stock_price[]= {7, 1, 5,3,6,4};
        MaxProfit(stock_price);
    }
}
