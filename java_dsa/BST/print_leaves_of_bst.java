package BST;

public class print_leaves_of_bst {
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
      

        print_leaves(bst.root);
    }

    static void print_leaves(TNode t){ 
        if(t==null){
            return;
        }
        else if(t.Left ==null && t.Right==null){
            System.out.println(t.val);
        }
        else{
            print_leaves(t.Left);
            print_leaves(t.Right);
        }
    }
}
