package String;
// the string should contains a-z alphabets
import java.util.HashSet;

public class panagram {
    public static void main(String[] args) {
        String s = "the uick brown fox jumps over the azy dog";
        System.out.println(printPanagram(s));
    }

    static boolean printPanagram(String s){
        HashSet<Character> hs = new HashSet<>();

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){     // this only adds  a-z 
                hs.add(ch);
            }
        }
        return (hs.size()==26);
    }
}
