package BST;

public class smallest_no_in_bst {
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

        System.out.println("size is : "+smallest(bst.root));
      
    }
    static int smallest(TNode t){
        while(t.Left!=null){
            t=t.Left;
        }
        return t.val;
    }
}
