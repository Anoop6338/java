package String;
// print all prime numbers between  100 -200
public class prime_num {
    public static void main(String[] args) {
        int Min = 100;
        int Max =200;
        primeNumber(Min,Max);
    }

    static void primeNumber( int Min_num, int Max_num){
        for(int i=Min_num;i<=Max_num;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
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
