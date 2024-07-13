package String;
// a super prime is represented as sum of consective prime numbers
// 41 = 2+3+5+7+11+13
public class super_prime {
    public static void main(String[] args) {
        int num =17;
        System.out.println(isSuperPrime(num));
    }

    static boolean isSuperPrime(int num){
        int sum =0;
        String s ="";
        for(int i=2;i<num;i++){
            if(isPrime(i)){
                s=s+" + "+i;
                sum=sum+i;
                if(sum>num){
                    System.out.println(s+" > "+num);
                    return false;
                }
                else if (sum==num){
                    System.out.println(s+" = "+num);
                    return true;
                }
            }
        }
        return false;
    }

    static int next_prime(int num){
        int i=num+1;
        while(i>num){
            if(isPrime(i)){
                return i;
            }
            i++;
        }
        return 0;    }

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
