package String;
// longest gap between given range
// 1-100--- output is 8 ( 89-97 has 8 gap)
public class longest_gap {
    public static void main(String[] args) {
        int min =0;
        int max =100;
        System.out.println(longestGap(min, max));
    }

    

    static int longestGap(int min, int max){
        int gap =0;
        int n1 =min;
        int n2, diff;

        while(n1<=max){
            n2 =next_prime(n1);
            diff = n2-n1;
            if(diff>gap){
                gap=diff;
            }
            n1=n2;
        }
        return gap;
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
