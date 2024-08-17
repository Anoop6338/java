package arrays;

import java.util.Arrays;
// leetcode 66                  // not completed............. do it
public class Plus_one {
    public static void main(String[] args) {
        int digit[] ={9};
        // int digit[] = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digit)));
    }

    static int[] plusOne(int[] digits) {
        int carry=1;

        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] + carry > 9){
                digits[i] = 0;
                carry = 1;
            }
            else{
                digits[i]++;
                carry = 0;
                return digits;
            }
        }

        int output[] = new int[digits.length+1];
        if(carry == 1){
            output[0] = 1;
        }
        return output;

    }
}
