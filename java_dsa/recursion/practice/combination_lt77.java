package recursion.practice;

import java.util.ArrayList;
import java.util.List;

// leetcode 77
public class combination_lt77 {
    public static void main(String args[]){
        int n=4;
        int k=2;
        combine(n, k);
    }

    static List<List<Integer>> combine(int n, int k) {
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }

        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        return ways(n, k, arr,al , mainList, "");  
    }

    static List<List<Integer>> ways(int n, int k, int arr[],List<Integer> al,  List<List<Integer>> mainList, String ans){
        if(k==0){
            mainList.add(new ArrayList<>(al));
            System.out.println(ans);
        }
        else if(n==0){
            // do nothing
        }
        else{
            int index = n-1;
            
            if(k-1>=0){
                al.add(arr[index]);
                ways(n-1, k-1, arr,al, mainList, ans+arr[index]+" ");
            }
            al.remove(al.size()-1);
            ways(n-1, k, arr,al, mainList, ans);
        }

        return mainList;
    }
}
