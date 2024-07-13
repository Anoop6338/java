package String;

public class checkPalindrome {
    public static void main(String[] args) {
        String s = "helleh";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();

        String rev = sb.toString();
        if(s.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
}
