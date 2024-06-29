package linkedList;
// this program uses Node.java and MyLinkedList.java
public class testing {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(560);
        ll.add(30);
        ll.add(40);

        ll.deleteElementAt(2);
        // System.out.println("Previous list");
        ll.printList();
        // int val =20;

        // System.out.println("index = "+ll.indexOf(val));
        // System.out.println("size = "+ll.size());

        // int index =2;
        // System.out.println("value = " + ll.getElementAt(index));

        // // System.out.println("New list");
        // ll.addFront(50);
        // ll.addFront(60);
        // // ll.printList();

        // System.out.println();
        // ll.update(30, 35);
        // ll.printList();
    }
}
