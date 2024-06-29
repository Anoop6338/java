package linkedList;
// leetcode 143
// this program returns the list in order--->   {L0 → L1 → … → Ln - 1 → Ln}   ---->    {L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …}
// this program uses method 1 approach where we use 2 more list to generate result...
// first we reverse the list and store it in start2 
// then we combine start1 and start2 to produce start3... 1st element from start1 and 2nd element from start2
public class Reorder {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        
        printing(ll.start);

        System.out.println("After reordering");

        reorder(ll.start);
        printing(ll.start);
        
    }

    static void reorder(Node start1){       
        Node start2 = null;     
        Node start3 = null;
        int l = size(start1);

        Node t1 = start1;

        while(t1!=null){                        // reverse start1 list and store it in start2
            Node nd = new Node(t1.val);
            nd.next = start2;
            start2 = nd;
            
            t1=t1.next;
        }


        Node t2 = start2;
        Node t3 = start3;
        t1 = start1;
        int count = 0;
        
        while(true){                                // storing the nodes in start3 list
            Node nd = new Node(t1.val);             // node from start1 list
            if(start3 == null){
                start3 = nd;
                t3 = nd;
            }
            else{
                t3.next = nd;
                t3 = t3.next;
            }
            count++;
            t1=t1.next;

            if(count==l){                           // condition that will stop the program when list is completed ... worked in odd size of list
                break;
            }


            Node nd2 = new Node(t2.val);            // node from start2 list 
            t3.next = nd2;
            t3 = t3.next;
            t2 = t2.next;

            count++;

            if(count==l){                              // condition working for even size of list
                break;
            }

        }


        t1 = start1;
        t3 = start3;
        while(t3!=null){                    // copying the list back to start1 from start3 as we have to do changes in the original list
            t1.val = t3.val;
            t1=t1.next;
            t3=t3.next;
        }
    }

    static int size(Node start){
        Node t = start;
        int count = 0;
        while (t!=null) {
            count++;
            t=t.next;
        }
        return count;
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
