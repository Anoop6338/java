package String;

public class min_char_to_make_palindrome {
    public static void main(String[] args) {
        String s = "ABB";
        System.out.println(minCharsToPalindrome(s));
    }

    static int minCharsToPalindrome(String s){
        if(isPalindrome(s)){
            return 0;
        }

        else{
            String sub;

            for(int size=1;size<s.length();size++){
                sub = s.substring(0, size);
                String rev = new StringBuffer(sub).reverse().toString();

                if(isPalindrome(s+rev)){
                    System.out.println(rev);
                    return size;
                }
            }
            return 0;




        // mycode
        
            // int minChars =0;
            // StringBuffer sb = new StringBuffer();
            
            // for(int i=0; i<s.length();i++){
            //     StringBuffer s1 = new StringBuffer(s);
    
            //     char ch =s.charAt(i);
            //     minChars++;
            //     sb.append(ch);
            //     StringBuffer rev = new StringBuffer(sb);
            //     rev.reverse();
            //     s1.append(rev);

                
            //     String s2 = new String(s1);
            //     if(isPalindrome(s2)){
            //         System.out.println(rev);
            //         return minChars;
            //     }                
            // }
            // return minChars;
        }
        
    }

    static boolean isPalindrome(String s){
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
