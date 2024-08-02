package String;

// import java.util.HashMap;

//leetcode 387
public class uniqueCharacter {
    public static void main(String[] args) {
        String s = "leetcolde";
        System.out.println("answer "+firstUniqChar(s));
    }

// using array
    static int firstUniqChar(String s){
        int map[] = new int[26];
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(map[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }

/* 
// using hashmap
    static int firstUniqChar(String s){
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(hm.get(ch)==null){
                hm.put(ch, 1);
            }
            else{
                int val = hm.get(ch);
                val++;
                hm.put(ch, val);
            }
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hm.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
*/

/* 
    static int firstUniqChar(String s) {    // time complexity - O(n^2)
        for(int i=0; i<s.length();i++){
            boolean flag = true;
            for(int j=0;j<s.length();j++){
                if(j==i){
                    continue;
                }
                if(s.charAt(j)==s.charAt(i)){
                    flag = false;
                    // break;
                }

            }

            if(flag==true){
                return i;
            }

        }
        return -1;
    }
        */
}
