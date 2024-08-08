package dp.level2;
// leetcode 300
public class longest_increasing_subsequence {
    public static void main(String[] args) {
        int nums[] = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }

    static int lengthOfLIS(int[] nums) {
        return ways(nums, nums.length, Integer.MAX_VALUE, "");
    }

    static int ways(int nums[], int n, int prev, String ans){
        if(n == 0 ){
            System.out.println(ans);
            return 0;
        }
        else{
            int index = n-1; 
            int ans1 =0 , ans2 =0;
            if(nums[index] < prev){
                ans1 = 1 + ways(nums, n-1, nums[index], ans+nums[index]+" ");
            }
            ans2 = ways(nums, n-1,prev , ans);

            return Integer.max(ans1, ans2);
        }
    }

}
