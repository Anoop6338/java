package dp.level2.matrix_dp;
// leetocde 494
// target sum using +,-
public class target_sum_using {
    public static void main(String[] args) {
        int nums[] = {1,1,1,1,1};
        int target =3;
        System.out.println(findTargetSumWays(nums, target));
    }

    // this get submitted on leetcode --- just remove String ans from solution

    
    static int findTargetSumWays(int[] nums, int target) {
        return ways(nums, target, nums.length,"");
    }

    static int ways(int nums[] , int target, int n, String ans){
        if(target==0 && n==0){      // target reached and also nums finished
            System.out.println(ans);
            return 1;
        }
        else if(n==0){      // nums finished but target not reached
            return 0;
        }
        else{
            int index = n-1;

            int plus = 0;
            int minus = 0;
            // include '+'
            plus = ways(nums, target-nums[index], n-1, ans+"+"+nums[index]+" ");
            
            // include '-'
            minus = ways(nums, target+nums[index], n-1, ans+"-"+nums[index]+" ");

            return plus + minus;
        }
    }
}
