package String;

import java.util.HashMap;

public class countAnagrams {
    public static void main(String[] args) {
        String s ="abcdefbcamnohellocabworld";
        String w ="abc";
        System.out.println(anagramCount(s, w));
    }

    static int anagramCount(String s, String w){
        int k = w.length();
        int count=0;
        for(int i=0;i<=s.length()-k; i++){
            String sub = s.substring(i, i+k);

            if(checkAnagram(sub,w)){
                System.out.println(sub+" <----> "+w);
                count++;
            }
        }
        return count;
    }


    static boolean checkAnagram(String s1, String s2){      // use of hashmap for checking anagram.... you can also use charArray method
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i =0; i<s1.length();i++){
            char ch = s1.charAt(i);

            if(hm1.get(ch)==null){
                hm1.put(ch, 1);
            }
            else{
                int val = hm1.get(ch);
                val++;
                hm1.put(ch,val);
            }
        }


        for(int i =0; i<s2.length();i++){
            char ch = s2.charAt(i);

            if(hm2.get(ch)==null){
                hm2.put(ch, 1);
            }
            else{
                int val = hm2.get(ch);
                val++;
                hm2.put(ch,val);
            }
        }

        return hm1.equals(hm2);
    }
}
