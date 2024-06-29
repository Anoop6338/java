package linkedList;
// reverse a linked list without using extra list
public class reverseList2 {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

        printing(ll.start);
        Node rev = reverse(ll.start);
        
        printing(rev);
    }
    static Node reverse(Node start){
        if(start==null || start.next==null){ // size 0 or 1 ... return same list
            return start;
        }
        else{
            Node t1 = null;
            Node t2 = start;
            Node t3 = start.next;
    
            while(true){
                t2.next = t1;
                t1=t2;
                t2=t3;
                if(t2==null){
                    break;
                }
                t3=t3.next;
            }
            start = t1;
           
            return start;
        }
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
