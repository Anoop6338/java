package String;

import java.util.Arrays;
import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "CAB";

        System.out.println("Using method 1 - "+checkAnagram1(s1, s2));
        System.out.println("Using method 2 - "+checkAnagram2(s1, s2));

    }

    static boolean checkAnagram1(String s1, String s2){     // using character array and comparing the 2 arrays
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            return true;
        }
        return false;
    }

    
    static boolean checkAnagram2(String s1 , String s2){
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i=0; i<s1.length();i++){
            char ch = s1.charAt(i);

            if(hm1.get(ch)== null){
                hm1.put(ch, 1);
            }
            else{
                int val = hm1.get(ch);
                val++;
                hm1.put(ch, val);
            }
        }

        for(int i=0; i<s2.length();i++){
            char ch = s2.charAt(i);

            if(hm2.get(ch)== null){
                hm2.put(ch,1);
            }
            else{
                int val = hm2.get(ch);
                val++;
                hm2.put(ch, val);
            }
        }

        System.out.println(hm1);
        System.out.println(hm2);


        return hm1.equals(hm2);
    }

}
