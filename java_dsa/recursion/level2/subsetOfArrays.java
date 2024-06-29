package recursion.level2;

import java.util.Arrays;
import java.util.StringTokenizer;

public class subsetOfArrays {
    public static void main(String[] args) {
        int a[]={10,20,30};
        subsets(a);
    }

    static void subsets(int a[]){
        String s ="";
        int i = 0;
        results(a, s, i);
    }

    static void results(int a[], String ans, int i){
        if(i==a.length){
            // System.out.println(ans);

            // now conversion of strings to array
            System.out.println(Arrays.toString(convertToArray(ans)));
        }
        else{
            //Pick
            int num = a[i];
            results(a, ans+ " " +num, i+1);

            // Don't pick
            results(a, ans, i+1);
        }
    }

    static int[] convertToArray(String s){
        s=s.trim();     // trims the whote spaces in start and end

        if(s.equals("")){       // if the string is empty
            int a[] = new int[0];
            return a;
        }
        else{       // use of tokenization

            StringTokenizer st = new StringTokenizer(s);

            int n = st.countTokens();
            int a[] = new int[n];

            for(int i=0; i<n; i++){
                a[i] = Integer.parseInt(st.nextToken());        // converts "10" --> 10
            }
            return a;
        }
    }
}
