package BST;

// leetcode 226
public class InvertBST {
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

        invertTree(bst.root);
    }

    static TNode invertTree(TNode root) {
        if(root==null){     // checks is the root is null i.e no tree is there
            return null;
        }
        return invert(root);
    }

    static TNode invert(TNode t){
        if(t==null){
            return null;        // base case , if the node is null
        }
        TNode left = invert(t.Left);        // stores the left child
        TNode right = invert(t.Right);      // stores the right child

        t.Left = right;         // inversion  new left child
        t.Right = left;         // inversion  new right child
        
        return t;
    }
}
