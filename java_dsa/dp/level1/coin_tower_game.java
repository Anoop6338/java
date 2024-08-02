package dp.level1;

public class coin_tower_game {
    public static void main(String[] args) {
        int n = 100; 
        int x = 3;
        int y = 4;
        System.out.println(findWinner(n, x, y));
    }

    static String findWinner(int n, int x, int y) {
        int num =  steps(n, x, y, "");
        System.out.println("no of steps "+num);
        if(num%2==0){
            return "B wins";
        }
        else{
            return "A wins";
        }
    }
 
    static int steps(int n, int x, int y, String ans){
        if(n==0 ){
            System.out.println(ans);

            return 0;
        }

        else if (n == 1 || n == x || n ==y){
            ans = ans + n;
            System.out.println(ans);
            return 1;
        }

        else{
            int ans1=Integer.MAX_VALUE, ans2 =Integer.MAX_VALUE, ans3 =Integer.MAX_VALUE;
            if(n-1 >= 0){
                ans1 = 1 + steps(n-1, x, y, ans+"1"+" ");
            }
            
            if(n-x >=0){
                ans2 = 1 + steps(n-x, x, y, ans+x+" ");
            }

            if(n-y >=0){
                ans3= 1 + steps(n-y, x, y, ans+y+" ");
            }
            
            return Math.min(ans1, Math.min(ans2, ans3));
        }
    }
}
