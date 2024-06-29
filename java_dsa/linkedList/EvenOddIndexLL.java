package linkedList;
// leetcode 328
//this program returns the list with off indexes element first and even indexes
public class EvenOddIndexLL {

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

        printing(ll.start);

        System.out.println("New list");
        printing(oddEvenList(ll.start));
    }

    static Node oddEvenList(Node start) {
        Node start2 = null;
        int count =1;
        Node t1 = start;
        Node t2 = start2;
        while(t1!=null){
            if(count%2!=0){
                Node nd = new Node(t1.val);
                if(start2==null){
                    start2 = nd;
                    t2= start2;
                    
                }
                else{
                    t2.next=nd;
                    t2=t2.next;
                }
            }
            t1=t1.next;
            count++;
        }
        count=1;
        t1=start;
        while(t1!=null){
            if(count%2==0){
                Node nd = new Node(t1.val);
                t2.next=nd;
                t2=t2.next;
            }
            t1=t1.next;
            count++;
        }
        return start2;
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

