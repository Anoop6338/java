package BST;

public class sizeofBSt {
    public static void main(String[] args) {
        BinarySearchTrie bst = new BinarySearchTrie();
        bst.add(50);
        bst.add(40);
        bst.add(30);
        bst.add(10);
        bst.add(20);
        bst.add(65);
        bst.add(60);
        bst.add(75);
        bst.add(80);
        bst.add(75);
        bst.add(15);
        bst.add(25);
        bst.add(85);
        bst.add(90);
        bst.add(100);

        System.out.println();
        System.out.println();

        int count[]={0};
        size_tail(bst.root, count);
        System.out.println("size by tail recursion"+count[0]);
        System.out.println();
        System.out.println();


        System.out.println("size by head recursion : "+size_head(bst.root));
        System.out.println();
        System.out.println();

    }
    static void size_tail(TNode t, int[] count){
        if(t==null){
            return;
        }
        else{
            count[0]++;
            size_tail(t.Left, count);
            size_tail(t.Right, count);
        }
    }

    static int size_head(TNode t){
        if(t==null){
            return 0;
        }
        else{
            return 1 + size_head(t.Left) + size_head(t.Right);
        }
    }
}
