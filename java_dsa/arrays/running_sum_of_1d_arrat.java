package arrays;

import java.util.Arrays;
// leetcode 1480
public class running_sum_of_1d_arrat {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];

        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum = sum+ nums[i];
            ans[i]= sum;
        }
        return ans;
    }
}
