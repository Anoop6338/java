package BST;

import java.util.ArrayList;

// leetcode 129
public class Sum_root_to_leaf_no {
    public static void main(String[] args) {
        BinarySearchTrie bst = new BinarySearchTrie();
        bst.add(5);
        bst.add(4);
        bst.add(3);
        bst.add(1);
        bst.add(2);
        bst.add(6);
        bst.add(7);
        bst.add(8);

        System.out.println(sumNumbers(bst.root));
    }

    static int sumNumbers(TNode root) {
        ArrayList<String> al = new ArrayList<>();

        if(root==null){
            return 0;
        }
        traversal(root, al, "");
        System.out.println(al);
        int sum =0;
        for(int i=0; i<al.size(); i++){
            sum += Integer.parseInt(al.get(i));
        }
        return sum;
    }

    static void traversal(TNode t, ArrayList<String> al, String ans){
        ans += t.val;

        if(t.Left==null && t.Right== null){
            al.add(ans);
        }
        else{
            if(t.Left!=null){
                traversal(t.Left, al, ans);
            }
            if(t.Right!=null){
                traversal(t.Right, al, ans);
            }
        }
    }
}
