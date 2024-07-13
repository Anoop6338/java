package String;

public class allSubString {
    public static void main(String[] args) {
        String s ="abcdefmnopqrst";
        all_SubString(s);
    }

    static void all_SubString(String s){
        for(int i=1;i<=s.length();i++){
            System.out.println("substring of size "+i);
            extractSubString(s, i);
            System.out.println();
        }
    }

    static void extractSubString(String s, int k){
        for(int i=0; i<=s.length()-k;i++){
            System.out.println(s.substring(i, i+k));
        }
    }
}
