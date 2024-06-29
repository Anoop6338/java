package linkedList;
// this program deletes the node given without accessing the start pointer...
// leetcode number 237
public class NoStartDeletion {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        
        ll.default1();
        printing(ll.start1);
        System.out.println("After deletion");
        deleteNode(ll.t);
        printing(ll.start1);
        
    }
    static void deleteNode(Node node) {
        Node p = node;
        Node q = node.next;
        p.val=q.val;
        p.next=q.next;

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
