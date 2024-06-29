package linkedList;

// Insert GCD (greatest common divisor) or HCF (Highest common factor) between two nodes
//leet code 2807
public class GCD {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(8);
        ll.add(6);
        ll.add(10);
        ll.add(3);

        printing(ll.start);
        printing(insertGreatestCommonDivisors(ll.start));
    }
    static Node insertGreatestCommonDivisors(Node start) {
        Node t = start;
        while(t!=null){
            int a = t.val;
            if(t.next==null){
                break;
            }
            int b = t.next.val;
            int num = greatestCommonDivisor(a, b);
            Node nd = new Node(num);
            nd.next=t.next;
            t.next=nd;

            t=t.next.next;
        }
        return start;
    }

    static int greatestCommonDivisor(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return greatestCommonDivisor(b, a%b);
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
