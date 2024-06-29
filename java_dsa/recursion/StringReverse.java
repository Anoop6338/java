package recursion;

public class StringReverse {
    public static void main(String[] args) {
        String s ="hello";
        int l = s.length();
        reverse_tail(s, l-1, "");
        System.out.println(reverse_head(s, l-1));
        
    }
    static void reverse_tail(String s ,int i, String rev){
        if(i==-1){
            System.out.println(rev);
        }
        else{
            rev = rev + s.charAt(i);
            reverse_tail(s, i-1, rev);
        }
    }

    static String reverse_head(String s, int i){
        if(i==-1){
            return "";
        }
        else{
            return s.charAt(i) + reverse_head(s, i-1);
        }
    }
}
