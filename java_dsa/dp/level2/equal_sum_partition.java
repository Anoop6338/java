package dp.level2;

import java.util.Arrays;

// leetcode 416
public class equal_sum_partition {
    public static void main(String[] args) {
        int nums[] = {1,5,11,5};
        System.out.println(canPartition(nums));
    }

    static boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();

        if(sum % 2 !=0){
            return false;
        }
        else{
            int target = sum/2;
            return ways(nums, target, nums.length, "");
        }
    }

    static boolean ways(int a[], int target, int n, String ans){
        if(target == 0 ){       // we have reached the target
            System.out.println(ans);
            return true;
        }
        else if(n==0){      // numbers in a[] is finished
            // System.out.println("X");
            return false;
        }
        else{
            int index = n-1;
            boolean ans1=false, ans2=false;
            if(target - a[index] >= 0){
                ans1 =  ways(a, target- a[index], n-1, ans+a[index]+" ");
           
            }
            ans2 = ways(a, target, n-1, ans);

            return ans1 || ans2;
        }
    }
}
