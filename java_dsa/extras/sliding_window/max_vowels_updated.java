package extras.sliding_window;
// leetcode 1456

public class max_vowels_updated {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    static int maxVowels(String s, int k) {
        int max = 0; 
        int l = s.length();
        int count =0;

        String sub = s.substring(0, k);
        System.out.println(sub);
        for(int i=0; i<sub.length(); i++){
            char ch = sub.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }

        max = count;

        for(int i=1; i<=l-k; i++){
            // remove effect of old char
            char old_ch = s.charAt(i-1);
            if(old_ch=='a'|| old_ch=='e'||old_ch=='i'||old_ch=='o'||old_ch=='u'){
                count--;
            }

            // add the effect of new char 
            char new_ch = s.charAt(i+k-1);
            if(new_ch=='a'|| new_ch=='e'||new_ch=='i'||new_ch=='o'||new_ch=='u'){
                count++;
            }

            if(count>max ){
                max = count;
            }
        }
        return max;
    }
}
