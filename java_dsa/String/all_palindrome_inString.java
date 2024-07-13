package String;

import java.util.HashSet;

// print all the unique palindrome in a string
public class all_palindrome_inString {
    public static void main(String[] args) {
        String s ="ABCBADCBCB";
        all_palindromes(s);
    }

    static void all_palindromes(String s){
        HashSet<String> hs = new HashSet<>(); 

        for(int k=1;k<=s.length();k++){
            for(int j=0;j<=s.length()-k;j++){
                String sub = s.substring(j, j+k);
                
                if(isPalindrome(sub)){
                    hs.add(sub);
                }
            }
        }

        System.out.println(hs);
        System.out.println("total number of palindrome - "+ hs.size());
    }

    static boolean isPalindrome(String s){
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
