package linkedList;

public class CycleInLinkedList2 {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.default1();

        System.out.println(detectCycle(ll.start1).val);
        
    }

    static Node detectCycle(Node head) {
        Node p = head;
        Node q = head;

        if(head==null || head.next==null){
            return null;
        }

        while(q!=null && q.next!=null){

            p=p.next;
            q=q.next.next;
            if(p==q){
                p=head;
                while(p!=q){
                    p=p.next;
                    q=q.next;
                }
                return p;
            }           
        }

        return null;
    }
}
