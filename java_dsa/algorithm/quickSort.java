package algorithm;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int a[] ={7,6,2,10,8,4,1,3,9,5};
        QuickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    static void QuickSort(int a[], int L, int U){
        if(L>=U){

        }
        else{
            int pos = partition(a, L, U);

            QuickSort(a, L, pos-1);
            QuickSort(a, pos+1, U);
        }

    // can also be written as
    
        // if(L<U){
        //     int pos = partition(a, L, U);

        //     QuickSort(a, L, pos-1);
        //     QuickSort(a, pos+1, U);
        // }
    }


    static int partition(int[] a, int L, int U){
        int i=L-1;
        int j=L;
        int pivot = a[U];
        for(j=L; j<=U-1; j++){
            if(a[j]<pivot){     // if smaller number is found by j then it is swapped by bigger number conatined by i+1
                i++;    
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        // swap i+1 with pivot
        int temp = a[U];        
        a[U]= a[i+1];
        a[i+1] = temp;

        return i+1;

    }
}

