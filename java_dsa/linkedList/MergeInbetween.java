package linkedList;
//leetcode 1669
public class MergeInbetween {
    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();
        ll1.add(0);
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        ll1.add(4);
        ll1.add(5);

        MyLinkedList ll2 = new MyLinkedList();
        ll2.add(31);
        ll2.add(32);
        ll2.add(33);

        printing(ll1.start);
        printing(ll2.start);
        printing(mergeInBetween(ll1.start, 3, 4, ll2.start));
        
    }

    static Node mergeInBetween(Node list1, int a, int b, Node list2) {
        Node l1 = list1;
        Node l2 = list1;

        Node p1 = list2;
        Node p2 = list2;
        while(p2.next!=null){           
            p2=p2.next;
        }

        int count =0;
        Node t1 = list1;
        while(t1.next!=null){
            if(count==a-1){
                l1 = t1;
            }
            if(count==b-1){
                t1 =t1.next;
                count++;
                l2=t1;
                break;
            }
            t1=t1.next;
            count++;
        }
        l1.next=p1;
        p2.next=l2.next;

        return list1;
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
