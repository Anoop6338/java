/*
 n
  C  = (n!) / r!(n-r)!
   r   
 */

import java.util.*;

public class binomial {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomil(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n - r);

        int ans = n_fact / (r_fact * (n_r_fact));
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter n : ");
        int a= sc.nextInt();
        
        System.out.print("Enter r : ");
        int b= sc.nextInt();

        int f_ans= binomil(a,b);
        System.out.println("Your binoamial expression answer is : "+f_ans);
        
        sc.close();
    }
}
