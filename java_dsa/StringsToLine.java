//leetcode 806

import java.util.Arrays;

public class StringsToLine {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        String p = "bbbcccdddaaa";
        int a[] ={4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};

        System.out.println(Arrays.toString(numberOfLines(a, p)));
    }

    static int[] numberOfLines(int[] a, String s) {
        int i = 0;
        int count =0;
        int t=0;
        int output[] = new int[2];

        int p=0;
        while(p<s.length()){                // till the string ends
            char ch = s.charAt(p);
            int pos =0;

            char al='a';
            for(int r = 0; r<26; r++){      // finding the postion of alphabet
                if(al==ch){
                    pos = r;
                    break;
                }
                al++;
            }

            if(i+a[pos]>100){               // addition is greater than 100 don't do p++
                count++;
                i=0;
            }
            else if(i==100){            // case when the total width ==100

                count++;
                i=0;
                p++;
            }
            i = i + a[pos];
            t=i;
            p++;
            
            
        }
        count++;                // count increased to add the current line
        output[0] = count;
        output[1] = t;
        return output;
    }
}
