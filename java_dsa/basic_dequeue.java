import java.util.*;
public class basic_dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addFirst(30);
        dq.addFirst(40);
        dq.addFirst(50);
        System.out.println(dq);


        // dq.removeFirst();
        // dq.removeFirst();
        // dq.removeFirst();
        // dq.removeFirst();
        // System.out.println(dq);


        while(!dq.isEmpty()){
            System.out.println(dq.removeLast());
            System.out.println(dq);
        }
        

    }
    
}
