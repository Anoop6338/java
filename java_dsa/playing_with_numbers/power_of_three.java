package playing_with_numbers;
//leetcode 326
public class power_of_three {
    public static void main(String[] args) {
        int num =45;
        System.out.println(isPowerOfThree(num));
    }

    static boolean isPowerOfThree(int n) {
        if(n==0){
            return false;

        }
        if(n==1){
            return true;
        }
        if(n%3!=0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
}
