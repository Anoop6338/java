package String;
// an even number can be represented as a sum of 2 prime numbers
// eg 30 - (7+23),(11+19),(13,17)
public class gold_bach_number {
    public static void main(String[] args) {
        int n =100;
        gold_bach_num(n);
    }

    static void gold_bach_num(int num){
        for(int i=2;i<=num/2;i++){
            int prime2 = num-i;
            if(isPrime(prime2)){
                System.out.println(i+" , "+prime2);
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
