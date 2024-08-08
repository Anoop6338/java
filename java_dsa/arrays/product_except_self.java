package arrays;

import java.util.Arrays;

// leetcode 238
public class product_except_self {
    public static void main(String[] args) {
        int num[] ={1,2,3,4,5};
        System.out.println(Arrays.toString(productExceptSelf(num)));
    }

    static int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        Arrays.fill(ans, 1);

        int product = 1;
        for(int i=1; i<nums.length; i++){       // finding left product
            product = product * nums[i-1];      
            ans[i] = product;
        }

        System.out.println(Arrays.toString(ans));
        product = 1;
        for(int i=nums.length-2; i>=0; i--){        // finding right produuct 
            product = product * nums[i+1];
            ans[i] = product * ans[i];
        }
        return ans;
    }
}
