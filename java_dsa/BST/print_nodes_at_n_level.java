package BST;
// printing nodes at the nth level
public class print_nodes_at_n_level {
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

        print_at_level(bst.root,2);
    }

    static void print_at_level(TNode t, int level){
        if(t==null){
            return;
        }
        else{
            print_at_level(t.Left, level-1);
            
            if(level==0){
                System.out.println(t.val);
            }

            print_at_level(t.Right, level-1);
        }
    }
}
