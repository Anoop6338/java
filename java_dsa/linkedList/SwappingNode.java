package linkedList;
// LeetCode 1721
// Swap the kth element from begining with the kth element from end
public class SwappingNode {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

        printing(ll.start);

        printing(swapNodes(ll.start, 2));

    }
    static Node swapNodes(Node start, int k) {
        int l = size(start);
        System.out.println(l);
        Node p = null;
        Node q = null;

        int count =1;
        Node t = start;
        while(t!=null){
            if(count ==k){
                p=t;
                // System.out.println(p.val);
            }
            if(count==l-k+1){
                q=t;
                // System.out.println(q.val);
            }
            t=t.next;
            count++;
        }
        int temp = p.val;
        p.val = q.val;
        q.val = temp;

        return start;
    }

    static int size(Node start){
        int count =0;
        Node t = start;
        while(t!=null){
            count++;
            t=t.next;
        }
        return count;
    }

    
    static void printing(Node startNode){
        Node t = startNode;
        System.out.print("start --> ");
        while(t!=null){
            System.out.print(t.val+" --> ");
            t= t.next;
        }
        System.out.println("X");
    }
}
