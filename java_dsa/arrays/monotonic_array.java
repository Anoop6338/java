package arrays;
// leetcode 896
public class monotonic_array {
    public static void main(String[] args) {
        int num[] ={6,5,4,4};
        System.out.println(isMonotonic(num));
    }

    static boolean isMonotonic(int[] nums) {
        if(isAscending(nums) || isDescending(nums)){
            return true;
        }
        return false;
        
    }

    static boolean isAscending(int nums[]){
        for(int i=0;i<nums.length-1; i++){
            if(nums[i+1] - nums[i] <0){
                return false;
            }
        }
        return true;
    }

    static boolean isDescending(int nums[]){
        for(int i=0;i<nums.length-1; i++){
            if(nums[i] - nums[i+1] <0){
                return false;
            }
        }
        return true;
    }
}
