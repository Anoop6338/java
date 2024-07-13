package String;

import java.util.*;

public class data_into_tabular_form {
    public static void main(String[] args) {
        String s ="1;anoop;96,2;rahul;89,3;smridhi;69,4;jatin;88";
        tabular_data(s);
    }

    static void tabular_data(String s){
        StringTokenizer st = new StringTokenizer(s,",");
        int count = st.countTokens();
        for(int i=1; i<=count;i++){
            String data = st.nextToken();
            System.out.println();

            StringTokenizer st2 = new StringTokenizer(data,";");
            int count2 = st2.countTokens();
            for(int j=1; j<=count2;j++){
                System.out.print(st2.nextToken()+"    ");
            }
        }
    }
}
