package linkedList;
// only to reverse between the given left and right numbers
public class ReverseBetween {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

        printing(ll.start);
        System.out.println();

        Node start2 =reverseBetween(ll.start,2,5);
        printing(start2);
    }

    static Node reverseBetween( Node start, int left, int right){
        Node start2 = null;
        Node t2 = start2;

        Node t = start;
        int count = 1;

        while(true){
            if(count < left){
                t=t.next;
                count++;
            }
            else if(count > right){
                break;
            }
            else{
                Node nd = new Node(t.val);
                if(t2==null){
                    start2 = nd;
                    t2=nd;
                }
                else{
                    t2.next = nd;
                    t2=t2.next;
                }
                t=t.next;
                count++;
            }
        }

        Node start3 = null;
        start3 = reverse(start2);

        Node t3 = start3;
        count =1;
        t=start;
        while(t!=null){
            if(count<left){
                count++;
                t=t.next;
            }
            else if(count >right){
                break;
            }
            else{
                t.val = t3.val;
                t=t.next;
                t3=t3.next;
                count++;
            }
        }
        return start;

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


    static void printing(Node startNode){
        Node t = startNode;
        while(t!=null){
            System.out.print(t.val+" --> ");
            t= t.next;
        }
        System.out.println("X");
    }
}
