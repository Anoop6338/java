import java.util.*;

public class prime_no {
    public static boolean isprime(int num){
        if(num==1 || num==0){
            System.out.println("Neither prime nor composite");
            return true;
        }

        //   unoptimized method

        // for (int i=2;i<num;i++){
        //     if(num%i==0){
        //         return false;
        //     }
        // }
        // return true;


        /*  optimised method

        If you make factors of the number then after a certain pt if will repeat itself
        6 = [(1*6), (2*3)], [(3*2), (6*1)]
        As num = sqrt(num)* sqrt(num)
        Thus we just need to check i only from 2 to sqrt(num).

        */
        for (int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }


    // this function prints the range of prime numbers to num.

        public static void range_prime(int num) {
            for(int i=2; i<=num;i++){
                if(isprime(i)){
                    System.out.print(i+ " ");
                }
            }
            System.out.println();
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        range_prime(a);

        sc.close();

    }
}
