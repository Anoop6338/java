package linkedList;
// merge 2 sorted lists
public class MergeSortedList {
    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(50);
        ll1.add(70);

        MyLinkedList ll2 = new MyLinkedList();
        ll2.add(15);
        ll2.add(30);
        ll2.add(45);
        ll2.add(60);
        ll2.add(80);

        printing(ll1.start);
        printing(ll2.start);

        printing(merge(ll1.start, ll2.start));

    }
    static Node merge(Node start1, Node start2){
        Node start3 = null;

        Node t1 = start1;
        Node t2 = start2;
        Node t3 = start3;


        if(start1 == null && start2 == null){       //if both list are empty
            return null;
        }

        else if(start1 == null && start2 != null){      // if 1st list is empty
            return start2;
        }

        else if(start1 != null && start2 == null){      // if 2nd list is empty
            return start1;
        }

        else{                                           // normal case where both list has atleast one node
            while(true){
                if(t1.val<t2.val){
                    Node nd = new Node(t1.val);
    
                    if(start3 == null){ // adding 1st node
                        start3 = nd;
                        t3 = start3;
                    }
                    else{               // adding at last
                        t3.next = nd;
                        t3=t3.next;
                    }
    
                    if(t1.next==null){      // adding the number after t1 list is finished
                            while(t2!=null){
                                Node nd2 = new Node(t2.val);
                                    t3.next = nd2;
                                    t3=t3.next;
                                    t2= t2.next;
                            }
                            break;
                        }
                    t1 =t1.next;
                    
                }
                else{
                    Node nd = new Node(t2.val);
                    if(start3 == null){ // adding 1st node
                        start3 = nd;
                        t3 = start3;
                    }
                    else{               // adding at last
                        t3.next = nd;
                        t3=t3.next;    
                    }

                    if(t2.next==null){
                        while(t1!=null){        // adding the remaining list after t2 list is finished
                            Node nd2 = new Node(t1.val);
                                t3.next = nd2;
                                t3=t3.next;
                                t1= t1.next;
                        }
                        break;
                    }
                    t2= t2.next;
                }
            }
        }
        return start3;
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
