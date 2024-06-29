package recursion.level2;

public class SubsetOfString {
    public static void main(String[] args) {
        String s = "ABC";
        subset(s, "", 0);

    }
    static void subset(String s , String ans, int i){
        if(i==s.length()){
            System.out.println(ans);
        }
        else{
            // Pick
            char ch = s.charAt(i);
            subset(s, ans+ch, i+1);

            // Don't pick
            subset(s, ans, i+1);
        }
    }
}
