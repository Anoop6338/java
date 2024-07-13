package String;

public class Remove_consecutive_letters {
    public static void main(String[] args) {
        String s = "shheee waasss goinnngggg to worrrk";
        System.out.println(removeLetters(s));
    }

    static String removeLetters(String s){
        StringBuffer sb = new StringBuffer(s);

        for(int i=0; i<sb.length()-2;i++){
            if(sb.charAt(i)!=sb.charAt(i+1)){
                // do nothing
            }
            else{
                sb.deleteCharAt(i);
                i--;        // very important why i did this
            }
        }


        String s2 = new String(sb);
        return s2;
    }
}
