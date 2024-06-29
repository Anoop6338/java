package algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] ={9,8,7,6,5,4,3,2,1};
        sort(a);
        System.out.println(Arrays.toString(a));

        String a2[] ={"Masi", "Anoop","Kavita","Smridhi","Jatin","Amit"};
        sort(a2);
        System.out.println(Arrays.toString(a2));
    }

    static void sort(int[] a){
        for(int i=1; i<a.length;i++){
            int temp = a[i];
            int j;
            for(j=i-1; j>=0; j--){
                if(a[j]>temp){
                    a[j+1]=a[j];
                }
                else{
                    break;
                }
            }
            a[j+1]=temp;
        }
    }

    static void sort(String[] a){
        for(int i=1; i<a.length;i++){
            String temp = a[i];
            int j;
            for(j=i-1; j>=0; j--){
                if(a[j].compareTo(temp)>0){
                    a[j+1]=a[j];
                }
                else{
                    break;
                }
            }
            a[j+1]=temp;
        }
    }
}
