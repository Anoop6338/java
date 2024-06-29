package algorithm;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        String a2[] ={"Jatin","Smridhi", "Kavita","Amit","Anoop"};
        sort(a2);
        System.out.println(Arrays.toString(a2));
    }

    static void sort(int[] a){
        for(int i= 0; i<a.length-1;i++){
            for(int j=0; j<a.length-1-i;j++){
                int temp = a[j];
                a[j]=a[j+1];
                a[j+1]= temp;
            }
        }
    }

    static void sort(String[] a){
        for(int i =0; i<a.length-1; i++){
            for(int j=0; j<a.length-1-i; j++){
                if(a[j].compareTo(a[j+1])>0){
                    String temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]= temp; 
                }
            }
        }
    }


}
