package playing_with_numbers;

import java.util.HashSet;

public class happy_numbers {
    public static void main(String[] args) {
        int n =19;
        System.out.println(isHappy(n));
    }

    static boolean isHappy(int n) {
        
        HashSet<Integer> hs = new HashSet<>();
        int ans =0;
        while(ans !=1){
            int new_n = 0;
            while(n>=1){
                int d = n%10;
                n=n/10;
                new_n += d*d;
            }
            n = new_n;
            System.out.println("new num = "+new_n);

            if(hs.contains(new_n)){
                return false;
            }
            hs.add(new_n);
            ans = new_n;
        }
        return true;
    }
}
