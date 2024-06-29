package recursion.level2;

public class climb_stairs_leetcode70 {
    public static void main(String args[]){
        int n=4;
        System.out.println(climbStairs(n));
    }
    static int climbStairs(int n) {
        if(n==0){
            return 1;
        }
        else if(n<0){
            return 0;
        }
        else{
            int ans1 = climbStairs(n-1);
            int ans2 = climbStairs(n-2);
            return ans1+ans2;

        }
    }
}
