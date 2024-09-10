package kadane;
// leetcode 53
public class max_subarray {
    public static void main(String[] args) {
        int nums[] ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;

        int sum =0;
        for(int i=0; i<nums.length;i++){

            // add numbers, +ve no. has +ve impact, -ve no. has -ve impact
            sum += nums[i];

            // if sum increases after addition we got new max
            if(sum>max){
                max = sum;
            }

            // if -ve no. has big impact , reset to 0
            if(sum<0){
                sum =0;
            }
        }
        return max;
    }
}
