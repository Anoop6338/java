package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// leetcode 438
public class find_all_anangrams {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));

    }

    static List<Integer> findAnagrams(String s, String p) {
        List<Integer> al = new ArrayList<>();
        int k = p.length();
        for(int i=0; i<=s.length()-k;i++){
            String sub = s.substring(i, i+k);
            if(checkAnagram(sub, p)){
                al.add(i);
            }
        }
        return al;
    }

    static boolean checkAnagram(String s1, String s2){     // using character array and comparing the 2 arrays
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            return true;
        }
        return false;
    }
}
