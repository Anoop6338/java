package arrays;

import java.util.Arrays;
// leetcode 66                  // not completed............. do it
public class Plus_one {
    public static void main(String[] args) {
        int digit[] ={1,2,3};
        System.out.println(Arrays.toString(plusOne(digit)));
    }

    static int[] plusOne(int[] digits) {
        String s ="";
        for(int i=0; i<digits.length; i++){
            s=s+digits[i];
        }
        int num = Integer.parseInt(s);
        num += 1;

        for(int i= digits.length-1; i>=0; i--){
            int d = num%10;
            digits[i] = d;
            num = num/10;

        }
        return digits;
    }
}
