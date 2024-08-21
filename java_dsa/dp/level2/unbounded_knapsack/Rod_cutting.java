package dp.level2.unbounded_knapsack;

// https://www.geeksforgeeks.org/problems/rod-cutting0840/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_car
public class Rod_cutting {
    public static void main(String[] args) {
        int n = 8;
        int prices[] = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cutRod(prices, n));
    }   

    static int cutRod(int price[], int n) {
        int rod_len[] = new int[n];
        for(int i=0; i< rod_len.length; i++){
            rod_len[i] = i+1;
        }

        int L =n;
        return ways(L, n, price, rod_len, "");
        
    }

    static int ways(int L, int n, int prices[], int[] rod_len, String ans){
        if(L==0){       // length finished, successful base case
            System.out.println(ans);
            return 0;
        }
        else if(n==0){         // all the numbers finished, unsuccessful base case
            return 0;
        }
        else{
            int index = n-1;
            int ans1 =0, ans2 =0;

            if(L-rod_len[index]>=0){
                // include
                ans1 = prices[index] + ways(L-rod_len[index], n, prices, rod_len, ans+prices[index]+" ");
            }

            //don't include
            ans2 = ways(L, n-1, prices, rod_len, ans);

            return Integer.max(ans1, ans2);
        }
    }
}
