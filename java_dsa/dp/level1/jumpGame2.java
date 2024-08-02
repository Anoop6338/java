package dp.level1;
// leetcode 45
public class jumpGame2 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }

    static int jump(int[] nums) {
        return minJumps(nums,0,"");
    }

    static int minJumps(int[] nums, int i, String ans){
        int n = nums.length;

        if(i==n-1){
            System.out.println(ans);
            return 0;
        }
        else{
            int limit = nums[i];

            int overall_ans = Integer.MAX_VALUE/2;
            for(int j=1;j<=limit;j++){
                if(i+j <=n-1){
                    int temp_ans = 1+ minJumps(nums, i+j, ans+j+" ");

                    if(overall_ans> temp_ans){
                        overall_ans = temp_ans;
                    }
                }
            }
            return overall_ans;
        }
    }
}
