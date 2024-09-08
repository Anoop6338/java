package extras.sliding_window;

import java.util.Arrays;
import java.util.HashMap;

// leetcode 567
// gets SUBMITTED but Time to run is very long
public class permutation_in_string {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));

    }

    static boolean checkInclusion(String small, String large) {
        int k = small.length();
        int l = large.length();

        for(int i=0; i<=l-k; i++){
            String sub = large.substring(i, i+k);
            // System.out.println(sub);

            if(checkAnagram(small, sub)){
                // System.out.println(small+"  "+sub);
                return true;
            }
        }
        return false;
    }

    static boolean checkAnagram(String s1, String s2){
        char a1[] = s1.toCharArray();
        char a2[] = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }


    // you can also use hashmap for comparision
    static boolean checkAnagram_hashmap(String s1, String s2){
        HashMap<Character, Integer> hm1 = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);

            if(hm1.containsKey(ch)){
                int val  = hm1.get(ch);
                val++;
                hm1.put(ch, val);
            }
            else{
                hm1.put(ch, 1);
            }
        }


        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);

            if(hm2.containsKey(ch)){
                int val  = hm2.get(ch);
                val++;
                hm2.put(ch, val);
            }
            else{
                hm2.put(ch, 1);
            }
        }

        return hm1.equals(hm2);
    }
}
