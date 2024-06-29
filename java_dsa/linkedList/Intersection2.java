package linkedList;
// leetcode 160
public class Intersection2 {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.default2();
        printing(ll.start1);
        printing(ll.start2);
        printing(getIntersectionNode(ll.start1, ll.start2));
    }

    static Node getIntersectionNode(Node start1, Node start2) {

        int a = size(start1);
        int b = size(start2);

        // Node t1 = start1;
        // Node t2 = start2;

        while(a!=b){
            if(a>b){
                a--;
                start1 = start1.next;
            }
            else if(b>a){
                b--;
                start2=start2.next;
            }
        }

        while(start1 !=start2){
            start1 = start1.next;
            start2 = start2.next;
        }

        return start1;


    }

    static int size(Node start){
        Node t = start;
        int count = 0;
        while(t!=null){
            count++;
            t=t.next;
        }
        return count;
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
