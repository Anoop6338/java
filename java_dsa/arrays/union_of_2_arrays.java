package arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class union_of_2_arrays {
    public static void main(String[] args) {
        int a[] = {7,6,2,8,3};
        int b[] = {10,20,6,4,2};
        System.out.println(Arrays.toString(union(a, b)));
    }

    static int[] union(int a[], int b[]){
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        for(int i =0 ;i<a.length; i++){
            lhs.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            lhs.add(b[i]);
        }

        int num[] = new int[lhs.size()];

        int i=0;
        for(int p : lhs){
            num[i] = p;
            i++;
        }
        return num;
    }
}
