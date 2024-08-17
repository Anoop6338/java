package dp.level2;
// leetcode 300
public class longest_increasing_subsequence {
    public static void main(String[] args) {
        // int nums[] = {10,9,2,5,3,7,101,18};
        int nums[] ={1,3,6,7,9,4,10,5,6};
        System.out.println(lengthOfLIS(nums));
    }

    static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        // return LIS(nums, n, Integer.MAX_VALUE, "");
        return LIS_2(nums, n, n, "");

    }

    // see LIS_2 for improved code
    static int LIS(int nums[], int n, int prev, String ans){
        if(n == 0 ){
            System.out.println(ans);
            return 0;
        }
        else{
            int index = n-1; 
            int ans1 =0 , ans2 =0;
            if(nums[index] < prev){
                ans1 = 1 + LIS(nums, n-1, nums[index], ans+nums[index]+" ");
            }
            ans2 = LIS(nums, n-1,prev , ans);

            return Integer.max(ans1, ans2);
        }
    }

    // this is improved version of LIS
    // In this we remember prev_index instead of prev for comparision
    static int LIS_2(int nums[], int n, int prev_index, String ans){
        if(n == 0 ){
            System.out.println(ans);
            return 0;
        }
        else{
            int index = n-1; 
            int ans1 =0 , ans2 =0;
            if(prev_index==nums.length || nums[index] < nums[prev_index]){
                ans1 = 1 + LIS_2(nums, n-1, index, ans+nums[index]+" ");
            }
            ans2 = LIS_2(nums, n-1, prev_index , ans);

            return Integer.max(ans1, ans2);
        }
    }
    

}
