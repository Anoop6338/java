package BST;

// leetcode 100
public class Same_tree {
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


        BinarySearchTrie bst2 = new BinarySearchTrie();
        bst2.add(50);
        bst2.add(40);
        bst2.add(30);
        bst2.add(10);
        bst2.add(20);
        bst2.add(65);
        bst2.add(60);
        bst2.add(75);
        bst2.add(80);

        System.out.println(isSameTree(bst.root, bst2.root));
    }

    static boolean isSameTree(TNode p, TNode q) {
        if(p==null && q==null){
            return true;
        }
        else if(p==null || q==null){
            return false;
        }
        else{
            return checkValues(p,q);
        }
    }

    static boolean checkValues(TNode p, TNode q){
        if(p==null && q==null){
            return true;
        }
        else if(p==null || q==null){
            return false;
        }
        else{
            
            if(p.val != q.val){
                return false;
            }
            return checkValues(p.Left, q.Left) && checkValues(p.Right, q.Right);

        }        
    }
}
