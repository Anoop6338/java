package String;
// print next primenumber from given number
public class nextPrime {
    public static void main(String[] args) {
        int n=158;
        next_prime(n);
    }

    static void next_prime(int num){
        int i=num+1;
        while(i>num){
            if(isPrime(i)){
                System.out.println(i);
                break;
            }
            i++;
        }

    //another method to do this, here we have not given the ending constraint

        // for(int i=num+1;  ; i++){
        //     if(isPrime(i)){
        //         System.out.println(i);
        //         break;
        //     }
        // }
    }
    
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
