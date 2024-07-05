package String;

public class duplicateLetter {
    public static void main (String args[]){
        String s = "abcbd";
        System.out.println(isDuplicate(s));
    }

    // complexity is O(n2)
    static boolean isDuplicate(String s){
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);

            for(int j= i+1; j<s.length();j++){
                char nextCh = s.charAt(j);
                if(ch == nextCh){
                    return false;
                }
            }
        }
        return true;
    }


    // TC - O(n)
    
}
