package recursion.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class subsetsOfArrayLeetCode78 {
    
    public static void main(String[] args) {
        int a[]={10,20,20};
        System.out.println(subsets(a));
    }

    static List<List<Integer>> subsets(int a[]){
        String s ="";
        int i = 0;

        List<List<Integer>> mainList = new ArrayList<>();
        results(a, s, i, mainList);
        return mainList;
    }

    static void results(int a[], String ans, int i, List<List<Integer>> mainList){
        if(i==a.length){

            // now conversion of strings to array
            mainList.add(convertToArray(ans));
        }
        else{
            //Pick
            int num = a[i];
            results(a, ans+ " " +num, i+1, mainList);

            // Don't pick
            results(a, ans, i+1, mainList);
        }
    }

    static List<Integer> convertToArray(String s){
        s=s.trim();     // trims the whote spaces in start and end

        if(s.equals("")){       // if the string is empty
            List<Integer> al = new ArrayList<>();
            return al;
        }
        else{       // use of tokenization

            StringTokenizer st = new StringTokenizer(s);

            int n = st.countTokens();
            List<Integer> al = new ArrayList<>();

            for(int i=0; i<n; i++){
                al.add( Integer.parseInt(st.nextToken()));        // converts "10" --> 10
            }
            return al;
        }
    }
}
