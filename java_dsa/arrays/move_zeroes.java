package arrays;

import java.util.Arrays;

// leetcode 283
public class move_zeroes {
    public static void main(String[] args) {
        // int num[] ={0,1,0,3,12};
        int num[] ={0,0,1};
        moveZeroes(num);
        System.out.println(Arrays.toString(num));
    }
    static void moveZeroes(int[] nums) {
        int nonZero = 0;
        for(int i= 0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[nonZero] = nums[i];
                nonZero++;
            }
        }
        for(int i= nonZero; i<nums.length; i++){
            nums[i] = 0;
        }
    }

}
