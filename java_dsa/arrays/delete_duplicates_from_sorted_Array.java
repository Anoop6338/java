package arrays;


// leetcode 26
public class delete_duplicates_from_sorted_Array {
    public static void main(String[] args) {
        int nums[] = {1,1};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
