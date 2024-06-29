package BST;
// checks whether the given number exists or not
//leetcode 700
public class search_num {
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

        System.out.println(contains(bst.root, 656));

        System.out.println(contains_recursion(bst.root, 60));
    }

    static boolean contains(TNode t, int val){
        while(t!=null){
            if(t.val==val){
                return true;
            }
            else if( val<t.val){
                t=t.Left;
            }
            else{
                t=t.Right;
            }
        }
        return false;
    }


    // through recursion
    static boolean contains_recursion(TNode t, int val){
        if(t==null){
            return false;
        }
        else if(t.val==val){
            return true;
        }
        else{
            if(val<t.val){
                return contains_recursion(t.Left, val);
            }
            else{
                return contains_recursion(t.Right, val);
            }
        }

    }
}
