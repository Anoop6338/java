package linkedList;
// this program returns whether the 2 linked list are equal or not.... i.e have same size and same number in each node.

public class equalLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.add(50);
        ll1.add(60);

        MyLinkedList ll2 = new MyLinkedList();
        ll2.add(10);
        ll2.add(20);
        ll2.add(30);
        ll2.add(40);
        ll2.add(50);
        ll2.add(60);

        printing(ll1.start);
        printing(ll2.start);
        System.out.println(equals(ll1.start,ll2.start ));
        

    }

    static boolean equals(Node start1, Node start2){
        if(isEmpty(start1) && isEmpty(start2)){     // checks if both the list are empty thus returns true
            return true;
        }
        else{
            int l1 = size(start1);
            int l2 = size(start2);

            if(l1!=l2){                             // if size of both list is different then return false
                return false;
            }
            else{
                Node t1 = start1;
                Node t2 = start2;

                while(t1!=null||t2!=null){          // checks value of nodes from both list
                    if(t1.val != t2.val){
                        return false;
                    }
                    t1=t1.next;
                    t2=t2.next;
                }
            }
        }
        return true;
    }

    static boolean isEmpty(Node start){
        if(start == null){
            return true;
        }
        return false;
    }

    static int size(Node start){
        int count =0;
        Node t =start;
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
