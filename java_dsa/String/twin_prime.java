package String;

public class twin_prime {
    public static void main(String[] args) {
        int min=100;
        int max =200;
        twinPrime(min, max);
    }

    static void twinPrime(int min, int max){
        for(int i=min;i<=max;i++){
            if(isPrime(i)&&isPrime(i+2)){
                System.out.println(i+" , "+(i+2));
            }
        }

    
    //my code
        // int prev =-1;
        // for(int i=min; i<=max;i++){
        //     if(isPrime(i)){
        //         if(i-prev==2){
        //             System.out.println(prev+" , "+i);
        //         }

        //         prev=i;
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
