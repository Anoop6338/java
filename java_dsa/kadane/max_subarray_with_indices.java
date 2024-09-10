package kadane;

import java.util.Arrays;

// return the subarray of max sum
public class max_subarray_with_indices {
    public static void main(String[] args) {
        // int nums[] ={-2,1,-3,4,-1,2,1,-5,4};
        int nums[] = {5,4,-1,7,8}; 
        System.out.println(Arrays.toString(maxSubArray(nums)));
    }

    static int[] maxSubArray(int[] nums) {
        int start_index = 0;
        int temp_start = 0;
        int end_index = 0;

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            if(sum>max){
                max = sum;
                start_index = temp_start;
                end_index=i;
            }

            if(sum<0){
                sum =0;
                temp_start = i+1;
            }
        }
        int a[] = Arrays.copyOfRange(nums, start_index, end_index+1);
        System.out.println(max);
        return a;
        
    }
}
