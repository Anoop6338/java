package recursion.level2;

import java.util.Arrays;
import java.util.StringTokenizer;

//gfg --->      https://www.geeksforgeeks.org/print-subsets-given-size-set/
public class subset_of_K_size {
    
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int k =3;
        subsets(a,k);
    }

    static void subsets(int a[], int k){
        String s ="";
        int i = 0;
        results(a, s, i,k);
    }

    static void results(int a[], String ans, int i, int k){
        if(i==a.length){
            // System.out.println(ans);
            if(ans.length()==3*k){      // 3*k as we include spaces too
                // now conversion of strings to array
                System.out.println(Arrays.toString(convertToArray(ans)));
            }
            else{
                return;
            }
        }
        else{
            //Pick
            int num = a[i];
            results(a, ans+" " +num, i+1,k);

            // Don't pick
            results(a, ans, i+1,k);
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
