package BST;

import java.util.ArrayList;

//leetcode 101
public class Symmetric_tree {
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

       
        

        System.out.println(isSymmetric(bst.root));

    }

    static boolean isSymmetric(TNode root) {
        ArrayList<Integer> al_left = new ArrayList<>();
        ArrayList<Integer> al_right = new ArrayList<>();
        int h = height(root);

        for(int i=0; i<h; i++){
            dfs(root.Left, al_left, i);
            dfs(root.Right, al_right, i);

            System.out.println("left for level "+i+" "+al_left);
            System.out.println("right for level "+i+" "+al_right);

            if(al_left.size()!=al_right.size()){
                return false;
            }

            for(int j=0; j<al_left.size(); j++){
                if(al_left.get(j)!=al_right.get(al_right.size()-j-1)){
                    return false;
                }
            }
            al_left.clear();
            al_right.clear();
        }

        return true;
    }

    static void dfs(TNode t, ArrayList<Integer> al, int level){
        if(t==null){
            al.add(null);

        }
        else{
            dfs(t.Left, al,level-1);
            if(level==0){
                al.add(t.val);
            }
            dfs(t.Right, al, level-1);
        }

    }

    static int height(TNode t){
        if(t==null){
            return 0;
        }
        else{
            int height_left = 1+ height(t.Left);
            int height_right = 1+ height(t.Right);

            if(height_left>height_right){
                return height_left;
            }
            else{
                return height_right;
            }
        }
    }


}
