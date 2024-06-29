package recursion;

public class Smallest_Digit {
    public static void main(String[] args) {
 
        int num = 726835;
        int min = Integer.MAX_VALUE;
        digit_tail(num, min);
        System.out.println(digit_head(num));




//using while loop
        // while(num>0){
        //     int rem = num%10; 
        //     num = num/10;
        //     if(min>rem){
        //         min = rem;
        //     }
        // }
        // System.out.println(min);
        
    }
    static void digit_tail(int num, int min){
        if(num ==0){
            System.out.println(min); 
        }
        else{
            int rem = num%10;
            if(min>rem){
                min = rem;
            }
            digit_tail(num/10, min);
        }
    }

    static int digit_head(int num){
        if(num ==0){
            return 10;      
        }
        else{
            int rem = num%10;
            int ans = digit_head(num/10);
            
            if(rem< ans){
                return rem;
            }
            else{
                return ans;
            }

        }
    }
}
