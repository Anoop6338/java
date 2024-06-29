import java.util.*;

public class basicStack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(20);
        st.push(30);
        st.push(50);
        st.push(60);

        System.out.println(st);
        System.out.println("size of stack " +st.size());

        // System.out.println(st.peek());
        // System.out.println(st);
        // st.pop();
        // st.pop();
        // System.out.println(st);
        // st.pop();
        // System.out.println(st);

        while(! st.isEmpty()){
            System.out.println(st.pop());
        }
        System.out.println("size of stack " +st.size());
    }
}