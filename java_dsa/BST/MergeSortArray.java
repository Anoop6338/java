package BST;

import java.util.Arrays;

//leetcode 88
public class MergeSortArray {
    public static void main(String[] args) {
        //nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

        int nums1[] ={1,2,3,0,0,0};
        int m =3;
        int nums2[] ={2,5,6};
        int n =3;

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=0; i<nums1.length;i++){
            if(i>m-1){
                nums1[i]= nums2[j];
                j++;
                
            }
        }

        Arrays.sort(nums1);
    }
}
