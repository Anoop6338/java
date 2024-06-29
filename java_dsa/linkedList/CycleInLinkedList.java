package linkedList;
// leetcode ques 141
// this program is used to detect any cycle in a linked list
public class CycleInLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.default1();
        System.out.println(hasCycle(ll.start1));
    }
    
    static boolean hasCycle(Node head) {
        Node p = head;
        Node q = head;
        
        while(q!=null && q.next!=null){
            p=p.next;
            q=q.next.next;
            if(q == p){
                return true;
            }
        }
        return false;
    }

    static void printing(Node start){
        Node t = start;
        System.out.print("start --> ");
        while(t != null){
            System.out.print(t.val+" --> ");
            t=t.next;
        }
        System.out.println("X");
    }
}
