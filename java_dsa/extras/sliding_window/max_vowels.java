package extras.sliding_window;
// leetcode 1456

public class max_vowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    static int maxVowels(String s, int k) {
        int max =0; 
        int l = s.length();

        for(int i=0; i<=l-k; i++){
            String sub = s.substring(i, i+k);

            int count = countVowels(sub);

            if(count>max ){
                max = count;
            }
        }
        return max;
    }

    static int countVowels(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
}
