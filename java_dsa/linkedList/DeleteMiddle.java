package linkedList;

public class DeleteMiddle {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

        printing(ll.start);

        System.out.println("after deletion");
        printing(deleteMiddle(ll.start));

    }


    static Node deleteMiddle(Node start) {
        int l = size(start);
        int index = l/2;
        deleteAt(start, index);

        return start;
    }
    static int size(Node start){
        Node t = start;
        int count=0;
        while(t!=null){
            t=t.next;
            count++;
        }
        return count;
    }

    static void deleteAt(Node start, int index){
        Node t = start;
        
        int count =0;
        while(t!=null){
            if(count==index){
                Node q = t.next;
                t.val = q.val;
                t.next = q.next;
            }
            t=t.next;
            count++;
        }
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

