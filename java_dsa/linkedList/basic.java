package linkedList;

// this program is using Node.java as import in pakage of linkedList

public class basic {
    public static void main(String[] args) {
        Node start;

        Node nd1 = new Node(10);
        Node nd2 = new Node(20);
        Node nd3 = new Node(30);
        Node nd4 = new Node(40);

        start = nd1;
        nd1.next = nd2;
        nd2.next = nd3;
        nd3.next = nd4;
        nd4.next = null;

        Node t = start;
        while (t!=null) {
            System.out.println(t.val);
            t=t.next;
        }

    }
}
