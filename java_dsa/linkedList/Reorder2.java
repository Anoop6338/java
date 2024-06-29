package linkedList;
// leetcode 143
// this program returns the list in order--->   {L0 → L1 → … → Ln - 1 → Ln}   ---->    {L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …}
// Use of Dequeue to produce result  (Method 2)

import java.util.ArrayDeque;

public class Reorder2 {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        
        printing(ll.start);

        System.out.println("After reordering");

        reorder(ll.start);
        printing(ll.start);
    }

    static void reorder(Node start){

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        Node t = start;
        while(t!=null){
            dq.add(t.val);
            t=t.next;
        }

        t = start;
        while(t!=null){
            t.val = dq.removeFirst();
            t=t.next;
            if(t==null){
                break;
            }
            t.val = dq.removeLast();
            t=t.next;
        }
    }

    static void printing(Node startNode){
        Node t = startNode;
        while(t!=null){
            System.out.print(t.val+" --> ");
            t= t.next;
        }
        System.out.println("X");
    }
}
