package recursion;

public class power {
    public static void main(String[] args) {
        pow(2, 5, 1);
        System.out.println(pow(2, 5));
        
    }
    static void pow(int x, int y, int ans){       // Tail recursion
        if(y==0){
            System.out.println(ans);
        }
        else{
            ans = ans*x;
            pow(x,y-1,ans);
        }
    }

    static int pow(int x, int y){         // Head recursion
        if(y==0){
            return 1;
        }
        else{
            return x*pow(x, y-1);
        }
    }
}
