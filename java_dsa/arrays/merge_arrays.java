package arrays;

import java.util.Arrays;

public class merge_arrays {
    public static void main(String[] args) {
        int a[] = {7,8,2,3,10};
        int b[] = {20,8,30,6};
        System.out.println(Arrays.toString(merge(a, b)));
    }

    static int[] merge(int a[], int b[] ){
        int num [] = new int[a.length+b.length];

        int i=0;
        for(i=0; i<a.length ;i++){
            num[i] = a[i];
        }
        
        for(int j=0; j<b.length ;j++){
            num[i] = b[j];
            i++;
        }

        return num;
    }
}
