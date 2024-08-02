package String;

import java.util.*;

//leetcode 49
public class group_anagrams {
    public static void main(String[] args) {
        // String arr[] = {"eat","tea","tan","ate","nat","bat"};
        String arr[] = {""};
        groupAnagrams(arr);
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> mainList = new ArrayList<>();
        
        if(strs[0].equals("")){
            ArrayList<String> al = new ArrayList<>();
            for(int i=0;i<strs.length;i++){
                if(strs[i]==""){
                    al.add("");
                }
            }
            mainList.add(al);
            return mainList;
        }

        if( strs.length==1){
            ArrayList<String> al = new ArrayList<>();
            al.add(strs[0]);
            mainList.add(al);
            return mainList;
        }


        int length = strs.length;

        for(int i=0; i<length; i++){
            if(!strs[i].equals("!0!")){
                ArrayList<String> al = new ArrayList<>();
                al.add(strs[i]);

                for(int j=i+1; j<length; j++){
                    if(!strs[j].equals("!0!")){
                        if(checkAnagram(strs[i], strs[j])){
                            al.add(strs[j]);
                            strs[j]="!0!";
                            // System.out.println(Arrays.toString(strs));
                        }
                    }
                }
                mainList.add(al);
                System.out.println(al);
            }
            strs[i]="!0!";
        }
        return mainList;
    }

    static boolean checkAnagram(String s1, String s2){
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            
            if(hm1.get(ch)==null){
                hm1.put(ch, 1);
            }
            else{
                int val = hm1.get(ch);
                val++;
                hm1.put(ch, val);
            }
        }

        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            
            if(hm2.get(ch)==null){
                hm2.put(ch, 1);
            }
            else{
                int val = hm2.get(ch);
                val++;
                hm2.put(ch, val);
            }
        }

        if(hm1.equals(hm2)){
            return true;
        }
        return false;
    
    }
}
