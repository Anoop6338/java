package linkedList;

public class MyLinkedList {
    Node start;



    //for NoStartDeletion and cyclic linkedList from this 
    Node start1;
    Node t;

    void default1(){

        Node nd1=new Node (10);
        Node nd2=new Node (20);
        Node nd3=new Node (30);
        Node nd4=new Node (40);
        Node nd5=new Node (50);
        nd1.next=nd2;
        nd2.next=nd3;
        nd3.next=nd4;
        nd4.next=nd5;
        nd5.next=nd3;
        start1=nd1;
        t=nd3;
    }
    //for NoStartDeletion and cyclic linkedList to this 


Node start2;

    void default2(){
        Node nd1=new Node (10);
        Node nd2=new Node (20);
        Node nd3=new Node (30);
        Node nd4=new Node (40);
        Node nd5=new Node (50);


        Node nd6 = new Node(60);
        Node nd7 = new Node(70);
        Node nd8 = new Node(80);

        nd1.next=nd2;
        nd2.next=nd3;
        nd3.next=nd4;
        nd4.next=nd5;
        nd5.next=null;
        
        nd6.next = nd7;
        nd7.next = nd8;
        nd8.next = nd3;
        start2 = nd6;
        start1=nd1;
        t=nd3;
    }

    boolean isEmpty(){      // returns whether the list is empty or not
        if(start==null){
            return true;
        }
        else{
            return false;
        }
    }

    void add(int val){      // adds the new nodes into the list
        if(isEmpty()){
            Node nd = new Node(val);
            start = nd;
        }
        else{
            Node t= start;
            while(t.next!=null){
                t=t.next;
            }
            Node nd = new Node(val);
            t.next = nd;
        }
    }

    int indexOf(int val){       // returns index if found else returns -1
        if(isEmpty()){
            return -1;
        }
        else{
            int count =0;
            Node t = start;

            while(t!=null){
                if(t.val == val){
                    return count;
                }
                t=t.next;
                count++;
            }
        }
        return -1;
    }

    void printList(){       // prints the list
        Node t = start;
        while(t!=null){
            System.out.println(t.val);
            t=t.next;
        }
    }

    int size(){         // returns size of the list i.e number of nodes in a LinkedList
        int count=0;
        Node t = start;
        while(t!=null){
            count++;
            t=t.next;
        }
        return count;
    }

    int getElementAt(int index){        // returns the element at given index
        int l = size();
        if(index<0 || index>=l){
            return -1;
        }
        else{
            int count=0;
            Node t= start;

            while (t!=null) {
                if(count==index){
                    return t.val;
                }
                count++;
                t=t.next;
            }
        }
        return -1;
    }

    void addFront(int val){         // add the node in the front of the list
        Node nd = new Node(val);
        nd.next= start;
        start = nd;
    }

    void update(int old_val, int new_val){      // update the old_val with new_val
        Node t = start;
        
        while(t!=null){
            if(t.val == old_val){
                t.val = new_val;
                // break;        // can be used if 1st old_val needs to be changed
            }
            t= t.next;
        }
    }

    void addElementAt(int index, int val){
        Node t = start;
        int count = 0;
        while (t.next!=null) {
            if(count == index-1){
                Node nd = new Node(val);
                nd.next = t.next;
                t.next=nd;
            }
            t=t.next;
            count++;
            System.out.println(count);
        }
    }

    void deleteElementAt(int index){
        Node t = start;
        int count =0;
        while(t.next!=null){
            if(count == index-1){
                t.next =t.next.next;
            }
            t=t.next;
            count++;
        }
    }

    
}
