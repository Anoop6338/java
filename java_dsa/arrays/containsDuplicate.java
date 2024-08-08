package arrays;

import java.util.HashSet;

// leetcode 217
public class containsDuplicate {
    public static void main(String[] args) {
        int a[] = {7,3,1,2,8,9,2,3,10,6};
        System.out.println(contains_Duplicate(a));
    }

    static boolean contains_Duplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }

        if(hs.size() == nums.length){
            return false;
        }
        return true;
    }


    static boolean contains_Duplicate2(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        boolean flag = true;
        for(int i=0; i<nums.length; i++){
            flag = hs.add(nums[i]);

            if(flag == false){
                return true;
            }
        }
        return false;
    }
}
