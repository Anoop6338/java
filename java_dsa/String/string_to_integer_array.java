package String;

import java.util.Arrays;
import java.util.StringTokenizer;

public class string_to_integer_array {
    public static void main(String[] args) {
        String s ="  10 20 30       -2    5 4  9 8 65   25 36   36  ";
        // String p ="     ";
        System.out.println(Arrays.toString(integer_array(s)));
    }

    static int[] integer_array(String s){
        if(s==""){
            return new int[] {};
        }
        else{
            StringTokenizer st = new StringTokenizer(s);
            int count = st.countTokens();
            int arr[] = new int[count];

            for(int i=0;i<=count-1; i++){
                arr[i]= Integer.parseInt(st.nextToken());
            }
            return arr;
        }

    }
}
