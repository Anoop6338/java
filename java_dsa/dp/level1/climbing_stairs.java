package dp.level1;

public class climbing_stairs {
    
    public static void main(String[] args) {
        int n =4;
        System.out.println(ways(n,""));
    }

    static int ways(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return 1;
        }
        else{
            int ans1 =0, ans2 =0,  ans3 = 0;
            if(n-1>=0){
                ans1 = ways(n-1, ans+1+" ");
            }
            if(n-2>=0){
                ans2 = ways(n-2, ans +2+" ");
            }
            if(n-3>=0){
                ans3 = ways(n-3, ans+3+" ");
            }
            return ans1+ans2+ans3;
        }
    }
}
