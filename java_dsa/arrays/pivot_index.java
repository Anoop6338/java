package arrays;
// leetcode 724
public class pivot_index {
    public static void main(String[] args) {
        int num[] ={1,7,3,6,5,6};
        System.out.println(pivotIndex(num));
    }

    static int pivotIndex(int[] nums) {
        int right_sum[] = new int[nums.length];

        int sum =0;
        for(int i=nums.length-1; i>=0; i--){
            sum = sum + nums[i];
            right_sum[i] = sum;
        }

        sum =0;
        for(int i=0; i<nums.length; i++){
            sum = sum +nums[i];

            if(sum == right_sum[i]){
                return i;    
            }
        }
        return -1;
    }
}
