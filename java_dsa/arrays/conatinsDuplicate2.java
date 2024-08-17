package arrays;

import java.util.HashMap;

//leetcode 219
public class conatinsDuplicate2 {
    public static void main(String[] args) {
        int nums[] = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                if((i - hm.get(nums[i]) <=k)){
                    return true;
                }
            }
            hm.put(nums[i], i);
        }
        return false;
    }
}
