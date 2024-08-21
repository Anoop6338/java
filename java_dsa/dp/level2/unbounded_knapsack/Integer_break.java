package dp.level2.unbounded_knapsack;
// leetcode 343
public class Integer_break {
    public static void main(String[] args) {
        int n =2;
        System.out.println(integerBreak(n));
    }

    static int integerBreak(int n) {
        int length = n-1;

        int range[] = new int[length];

        int num =2;
        for(int i=0; i<range.length; i++){
            range[i] = num;
            num++;
        }

        int total_num[] = new int[length];
        for(int i=0; i<total_num.length; i++){
            total_num[i] = i+1;
        }
        
        int p = range.length;
        int R = p+2;

        return ways(R, p-1, range, total_num, "");
    }
    
    static int ways(int R, int n, int[] range, int[] total_num, String ans){
        if(R==0){
            // System.out.println("from r"+ans);
            return 0;
        }
        else if(n==0){
            System.out.println(ans);

            return 0;
        }
        else{
            int index = n-1;
            int ans1 = 1, ans2 =1;
            if(R-range[index]>=1){
                ans1 = range[index] * ways(R-range[index], n, range, total_num, ans+range[index]+" ");
            }
            ans2  = ways(R, n-1, range, total_num, ans);

            return Math.max(ans1, ans2);
        }
    }
}
