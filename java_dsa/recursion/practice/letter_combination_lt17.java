package recursion.practice;

import java.util.ArrayList;
import java.util.List;

// leetcode 17
public class letter_combination_lt17 {
    public static void main(String[] args) {
        String digit = "23";
        letterCombinations(digit);
    }

    static List<String> letterCombinations(String digits) {
        List<String> al = new ArrayList<>();
        
        if(digits.equals("")){
            return al;
        }

        
    }
}
