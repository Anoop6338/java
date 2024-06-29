package linkedList;

public class palindromeCheck {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(30);
        ll.add(20);
        ll.add(10);

        printing(ll.start);
        System.out.println(palindrome(ll.start));


    }
    static boolean palindrome(Node start1){
        
        if(isEmpty(start1)){     // checks if  list is empty thus returns true
            return true;
        }
        else{
            Node start2 = reverse(start1);
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
        return true;
    }

    static Node reverse( Node start){
        Node start2 = null;

        Node t =start;
        while (t!=null) {
            Node nd = new Node(t.val);
            nd.next = start2;
            start2 = nd;
           
            t=t.next;
        }
        return start2;
    }
    
    static boolean isEmpty(Node start){
        if(start == null){
            return true;
        }
        return false;
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
