package algorithm;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        String a[] ={"Masi", "Anoop","Kavita","Smridhi","Jatin","Amit"};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    
    static void sort(int[] a){

        for(int i=0; i<a.length-1; i++){
            // int min =Integer.MAX_VALUE;
            int min = a[i];
            // int index =0;
            int index = i;
            for(int j=i; j<=a.length-1; j++){
                if(a[j]<min){
                    min=a[j];
                    index =j;
                }
            }
            int temp = a[i];
            a[i] = a[index];
            a[index]=temp;
            
        }
    }

    static void sort(String[] a){
        for(int i=0; i<a.length-1; i++){
            String min = a[i];
            int index = i;
            for(int j=i; j<=a.length-1; j++){
                if(a[j].compareTo(min)<0){
                    min=a[j];
                    index =j;
                }
            }
            String temp = a[i];
            a[i] = a[index];
            a[index]=temp;
            
        }
    }
}
