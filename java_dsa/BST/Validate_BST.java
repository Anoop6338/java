package BST;
// leetcode 98
import java.util.ArrayList;

public class Validate_BST {
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

        System.out.println(isValidBST(bst.root));
    }

    static boolean isValidBST(TNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        traversal(root, al);

        for(int i=0; i<al.size()-1;i++){
            if(al.get(i)>=al.get(i+1)){
                return false;
            }
        }
        return true;
    }

    static void traversal(TNode t, ArrayList<Integer> al){
        if(t==null){
            return;
        }
        else{
            traversal(t.Left, al);
            al.add(t.val);
            traversal(t.Right, al);
        }

    }
}
