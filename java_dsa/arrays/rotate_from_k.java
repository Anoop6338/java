package arrays;

import java.util.Arrays;

// initial array = {10,20,30,40,50,60,70,80,90,100}
//output array = {80,90,100,10,20,30,40,50,60,70};
public class rotate_from_k {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,80,90,100};
        int k = 3;
        System.out.println(Arrays.toString(reverse(a, k)));

        int a2[] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(Arrays.toString(reverse_2(a2, k)));

        int a3[] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(Arrays.toString(reverse_3(a3, k)));
    }

    static int[] reverse(int a[], int k){       // TC = O(K*N)
        int max = a.length-k;

        int i = a.length-1;
        while(i>=max){
            int temp = a[i];
            // System.out.println(temp);
            for(int j=a.length-1; j>=1; j--){
                a[j] = a[j-1];
            }
            a[0] = temp;
            // System.out.println(Arrays.toString(a));
            max++;
            if(i<max){
                break;
            }
        }
        return a;
    }


    static int[] reverse_2(int a[], int k){     //TC = O(N+K)
        int max = a.length-k;
        int b[] = new int[k];

        //a[] = {10,20,30,40,50,60,70,80,90,100}
        // b[] = {80,90,100}
        int index =0;
        for(int i=max; i<a.length; i++){            
            b[index] = a[i];
            index++;
        }

        //a[] = {10,20,30,40,50,60,70,80,90,100}  --->  a[] = {10,20,30,10,20,30,40,50,60,70}
        for(int i=a.length-1; i>=3; i--){
            a[i] = a[i-3];
        }
        // System.out.println(Arrays.toString(a));


        // b[] = {80,90,100}
        //a[] = {80,90,100,10,20,30,40,50,60,70}
        for(int i=0;i<b.length; i++){
            a[i] = b[i];
        }
        return a;
    }


    static int[] reverse_3(int a[], int k){     //TC = O(k+N-k) = O(N)
        int max = a.length-k;     // point to which array needs not to be rotated
        int b[] = new int[a.length];

        int index =0;
        for(int i=max; i<a.length; i++){
            b[index] = a[i];
            index++;
        }
        // System.out.println(Arrays.toString(b));

        int index_a = 0;
        for(int i=index; i<a.length; i++){
            b[i] = a[index_a];
            index_a++;
        }
        // System.out.println(Arrays.toString(b));

        return b;
    }

}
