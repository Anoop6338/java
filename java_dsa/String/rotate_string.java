package String;
// leetcode 796
public class rotate_string {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString2(s, goal));
    }

    static boolean rotateString1(String s, String goal) {       // better approach as (abcdeabcde) contains all the possible strings
        
        String str = s+s;
        return(s.length()==goal.length() && str.contains(goal));

    }

    static boolean rotateString2(String s, String goal) {       // my code
        StringBuffer sb = new StringBuffer(s);

        while(true){
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
            System.out.println(ch);
            System.out.println(sb.toString());
            if(sb.toString().equals(goal)){
                return true;
            }
            if(sb.toString().equals(s)){
                return false;
            }
        }

    }
}
