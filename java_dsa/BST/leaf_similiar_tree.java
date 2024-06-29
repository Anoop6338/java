package BST;
//leetcode 872

import java.util.ArrayList;

public class leaf_similiar_tree {
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

        System.out.println(leafSimilar(bst.root, bst2.root));
    }

    static boolean leafSimilar(TNode root1, TNode root2) {
        ArrayList<Integer> al_left = new ArrayList<>();
        ArrayList<Integer> al_right = new ArrayList<>();

        leaf_nodes(root1, al_left);
        System.out.println(al_left);
        leaf_nodes(root2, al_right);
        System.out.println(al_right);

        if(al_left.equals(al_right)){
            return true;
        }
        return false;
    }

    static void leaf_nodes(TNode t, ArrayList<Integer> al){
        if(t==null){
            return;
        }
        else{
            leaf_nodes(t.Left, al);
            if(t.Left == null && t.Right==null){
                al.add(t.val);
            }
            leaf_nodes(t.Right, al);
        }
    }
}
