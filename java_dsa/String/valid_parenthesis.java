package String;

import java.util.Stack;

public class valid_parenthesis {
    public static void main(String[] args) {
        String s = "}";
        System.out.println(isValid(s));

    }

    static boolean isValid(String s) {
        char ch0 = s.charAt(0);
        if(ch0=='}'|| ch0==']'|| ch0==')'){
            return false;
        }

        Stack<Character> st = new Stack<>();
        st.push('a');

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            System.out.println(ch);
            if(ch=='('){
                st.push(')');
            }
            else if( ch=='['){
                st.push(']');
            }
            else if(ch == '{'){
                st.push('}');
            }
            else if(ch==st.peek()){
                st.pop();
            }
            else if(ch=='}'|| ch==']'|| ch==')'){
                return false;
            }
            else{
                return false;
            }
        }
        st.pop(); //removes a
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}
