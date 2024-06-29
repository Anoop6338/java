package linkedList;
// leetcode 203
public class RemoveElement {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(6);
        ll.add(6);
        ll.add(6);
        ll.add(6);
        ll.add(6);

        printing(ll.start);
        printing(removeElements(ll.start, 6));
        
    }
    static Node removeElements(Node start, int val) {

        Node t1=start;

        if(t1== null){
            return null;
        }

        while(t1.next!=null){
            if(t1.next.val==val){
                t1.next=t1.next.next;
            }
            else{
                t1=t1.next;
            }
            
        }
        if(start.val==val){
            start=start.next;
        }
        return start;


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
