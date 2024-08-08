package arrays;

import java.util.HashSet;

// leetcode 136
public class single_number {
    public static void main(String[] args) {
        int num[] ={4,1,2,1,2};
        System.out.println(singleNumber(num));
    }

    static int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i= 0; i<nums.length; i++){
            if(hs.contains(nums[i])){
                hs.remove(nums[i]);
            }
            else{
                hs.add(nums[i]);
            }
        }
        for(int p : hs){
            return p;
        }
        return 0;
    }
}
