package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// leetcode 442
public class all_duplicated_in_array {
    public static void main(String[] args) {
        int a[] ={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(a));
    }

    static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                int val = hm.get(nums[i]);
                val++;
                hm.put(nums[i], val);
                al.add(nums[i]);
            }
            else{
                hm.put(nums[i], 1);
            }
        }

        return al;
    }
}
