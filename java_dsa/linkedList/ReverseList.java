package linkedList;

public class ReverseList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        printing(ll.start);
        System.out.println();

        Node start2 =reverse(ll.start);
        printing(start2);

    }

    static Node reverse( Node start){
        Node start2 = null;

        Node t =start;
        while (t!=null) {
            Node nd = new Node(t.val);
            nd.next = start2;
            start2 = nd;
           
            t=t.next;
        }
        return start2;
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
