package linkedList;

public class binaryToDecimal {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(1);
        ll.add(0);
        ll.add(1);

        printing(ll.start);
        System.out.println(getDecimalValue(ll.start));
        
    }
    static int getDecimalValue(Node start) {
        Node t= start;
        String str="";
        while(t!=null){
            str = str + t.val;
            t=t.next;
        }
        int sum = Integer.parseInt(str,2);
        return sum;
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
