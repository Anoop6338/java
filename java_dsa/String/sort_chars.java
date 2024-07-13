package String;

import java.util.Arrays;

public class sort_chars {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(rearrange(s));

    }

    static String rearrange(String s){
        char a[] = s.toCharArray();
        Arrays.sort(a);
        String ans = new String(a);
        return ans;
    }
}
