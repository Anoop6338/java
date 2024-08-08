package arrays;

import java.util.Arrays;
import java.util.HashSet;

// leetcode 349
public class intersection {
    public static void main(String[] args) {
        int nums1[] = {4,9,5}, nums2[] = {9,4,9,8,4};
        System.out.println(Arrays.toString(Intersection(nums1, nums2)));
    }

    static int[] Intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int i=0;i<nums1.length; i++){
            hs1.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(hs1.contains(nums2[i])){
                hs2.add(nums2[i]);
                // System.out.println(nums2[i]);
            }
        }

        // System.out.println(hs2);
        int output[] = new int[hs2.size()];

        int i=0;
        for(int p : hs2){
            output[i] = p;
            i++;
        }

        return output;
    }
}
