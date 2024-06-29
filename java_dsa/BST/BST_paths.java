package BST;

import java.util.ArrayList;
import java.util.List;

//leetcode 257
public class BST_paths {
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

        System.out.println(binaryTreePaths(bst.root));
    }
    static List<String> binaryTreePaths(TNode root) {
        ArrayList<String> al = new ArrayList<>();
        if(root!=null){                     // if root is  null it will return the empty list
            traversal(root, al, "");
        }
        return al;
    }

    static void traversal(TNode t, ArrayList<String> al, String ans){
        if(!ans.isEmpty()){     // add cureent nodes value to ans
            ans += "->";
        }
        ans+=t.val;


        if(t.Left==null && t.Right==null){      // check whether the node is leaf
            al.add(ans);
        }
        else{
            if(t.Left!=null)                // traverse left node
            traversal(t.Left, al, ans);

            if(t.Right!=null)               // traverse right node
            traversal(t.Right, al, ans);
        }
    }
}
