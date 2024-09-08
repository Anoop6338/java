package extras.sliding_window;

import java.util.HashMap;
// leetcode 567

public class permutation_in_string_updated {
        public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        // String s1 ="ab", s2 = "a";

        System.out.println(checkInclusion(s1, s2));

    }

    static boolean checkInclusion(String small, String large) {
        int k = small.length();
        int l = large.length();

        // if small string is greater than large string
        if(k>l){            
            return false;
        }

        // creation of hashmap for small string
        HashMap<Character, Integer> hm1 = new HashMap<>();
        for(int i=0; i<small.length(); i++){
            char ch = small.charAt(i);
            if(hm1.containsKey(ch)){
                int val = hm1.get(ch);
                val++;
                hm1.put(ch, val);
            }
            else{
                hm1.put(ch, 1);
            }
        }

        // creation of hashmap for 1st substring
        String sub = large.substring(0, k);
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i=0; i<sub.length(); i++){
            char ch = sub.charAt(i);
            if(hm2.containsKey(ch)){
                int val = hm2.get(ch);
                val++;
                hm2.put(ch, val);
            }
            else{
                hm2.put(ch, 1);
            }
        }

        // if we get equal hashmap in 1st attempt
        if(hm1.equals(hm2)){        
            return true;
        }

        // applying sliding window
        for(int i=1; i<=l-k; i++){
    
            // remove the effect of old char
            char old_ch = large.charAt(i-1);
            int val = hm2.get(old_ch);
            val--;
            hm2.put(old_ch, val);
            
            if(val==0){         // if the freq of char gets 0 remove that element
                hm2.remove(old_ch);
            }

            // add the effect of new char
            char new_ch = large.charAt(i+k-1);
            if(hm2.containsKey(new_ch)){
                val = hm2.get(new_ch);
                val++;
                hm2.put(new_ch, val);
            }
            else{
                hm2.put(new_ch, 1);
            }

            System.out.println(hm1 +"   "+ hm2);
            if(hm1.equals(hm2)){
                return true;
            }
        }

        return false;
    }
}
