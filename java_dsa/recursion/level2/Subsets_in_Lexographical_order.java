package recursion.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Subsets_in_Lexographical_order {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(subsets(s));

    }

    static List<String> subsets (String s){
        TreeSet<String> main_ans = new TreeSet<>();
        result(s, "", 0, main_ans);

        List<String> al = new ArrayList<>();
        al.addAll(main_ans);

        return al;
    }



    static void result(String s , String ans, int i, TreeSet<String> main_ans){
        if(i==s.length()){
            main_ans.add(ans);
            // System.out.println(ans);
        }
        else{
            // Pick
            char ch = s.charAt(i);
            result(s, ans+ch, i+1, main_ans);

            // Don't pick
            result(s, ans, i+1, main_ans);
        }
    }
}
