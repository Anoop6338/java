package BST;

import java.util.ArrayList;
import java.util.List;

// leetcode 102
public class level_order_traversal {
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

        System.out.println(levelOrder(bst.root));
        
    }

    
    static List<List<Integer>> levelOrder(TNode root) {

        List<List<Integer>> mainList = new ArrayList<>();
        int h = height(root); 

        for(int i=0; i<h;i++){
            List<Integer> al = new ArrayList<>();
            mainList.add(nodes_at_level(root, i,al));
          
        }
        return mainList;
    }

    static List<Integer> nodes_at_level(TNode t, int level, List<Integer> al){
        if(t==null){
            
        }

        else{
            nodes_at_level(t.Left, level-1, al);
            if(level==0){
                al.add(t.val);
            }
            
            nodes_at_level(t.Right, level-1, al);
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
