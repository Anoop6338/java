package BST;

import java.util.ArrayList;

public class kth_smallest_num {
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

        ArrayList<Integer> al = new ArrayList<>();
        int k =3;
        kth_smallest(bst.root, al);
        System.out.println(al);
        System.out.println(al.get(k-1));

    }

    static void kth_smallest(TNode t, ArrayList<Integer> al){
        if(t==null){
            return;
        }
        else{
            kth_smallest(t.Left,al);
            al.add(t.val);
            kth_smallest(t.Right, al);
        }
    }
}
