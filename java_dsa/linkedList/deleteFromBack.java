package linkedList;

public class deleteFromBack {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

        printing(ll.start);        
        deleteFromLast(5, ll.start);
        printing(ll.start);
    }
    static void deleteFromLast(int k, Node start){
        int l = size(start);
        int index =l-k-1;
        
        if(index==0){
            start.val = start.next.val;
            start.next = start.next.next;;
        }
        else if(index<0 || index>=l){
        }
        else{
            deleteAt(index, start);
        }
        
    }

    static Node deleteAt(int index, Node start){
        if(isEmpty(start)){
            return start;
        }
        else{
            Node t = start;
            int count =0;
            while(t.next!=null){
                if(count == index){
                    t.next = t.next.next;
                }
                else{
                    t=t.next;
                }
                count++;
            }
        }
        return start;
    }
    static int size(Node start){         // returns size of the list i.e number of nodes in a LinkedList
        int count=0;
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


    static boolean isEmpty(Node start){      // returns whether the list is empty or not
        if(start==null){
            return true;
        }
        else{
            return false;
        }
    }

}
