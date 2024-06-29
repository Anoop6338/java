package String;
// variation of panagram

import java.util.HashSet;

public class missingLetters {
    public static void main(String[] args) {
        String s = "the uick brown fox jumps over the azy og";
        printMissingLetters(s);
        
    }

    static void printMissingLetters(String s){
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                hs.add(ch);
            }
        }

        for(char ch ='a'; ch<='z'; ch++){
            if(hs.contains(ch)){
                //do nothing
            }
            else{
                System.out.println(ch+" ");
            }
        }
    }
}
