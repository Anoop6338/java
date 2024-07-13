package String;

public class subString_of_k_size {
    public static void main(String[] args) {
        String s ="abcdefghijklmnopqrstuvwxyz";
        int k=25;
        extractSubString(s,k);
    }

    static void extractSubString(String s, int k){
        for(int i=0; i<=s.length()-k; i++){
            System.out.println(s.substring(i, i+k));
        }
    }
}
