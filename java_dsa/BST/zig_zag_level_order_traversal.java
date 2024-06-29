package BST;

import java.util.ArrayList;
import java.util.List;

//leetcode 103
public class zig_zag_level_order_traversal {
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

        System.out.println(zigZaglevelOrder(bst.root));
    
}


static List<List<Integer>> zigZaglevelOrder(TNode root) {

    List<List<Integer>> mainList = new ArrayList<>();
    int h = height(root); // stores the height of tree from height()

    for(int i=0; i<h;i++){
        List<Integer> al = new ArrayList<>();
        mainList.add(nodes_at_level(root, i,al, i%2==1));       //  here i%2==1 shows odd levels where we need to traverse right -> left
      
    }
    return mainList;
}

static List<Integer> nodes_at_level(TNode t, int level, List<Integer> al, boolean reverse){
    if(t==null){
        
    }

    else{
        if(reverse){                                             // traverse right -> left
            nodes_at_level(t.Right, level-1, al, reverse);
            if(level==0){               //if reached on that level add the value to list
                al.add(t.val);
            }
            nodes_at_level(t.Left, level-1, al, reverse);

        }
        else{                                                     // traverse left -> right
            nodes_at_level(t.Left, level-1, al, reverse);
            if(level==0){               //if reached on that level add the value to list
                al.add(t.val);
            }
            
            nodes_at_level(t.Right, level-1, al, reverse);
        }
       
    }
    return al;
}

static int height(TNode t){         // returns the height of the tree
    if(t==null){
        return 0;
    }
    else{
        int left_height =1+ height(t.Left);
        int right_height =1+ height(t.Right);

        if(left_height>right_height){
            return left_height;
        }
        else{
            return right_height;
        }
    }

}


}
