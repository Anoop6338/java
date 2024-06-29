package BST;

import java.util.ArrayList;
import java.util.List;


// 637 leetcode
public class Average_levels_bst {
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

        System.out.println(averageOfLevels(bst.root));

    }

    static List<Double> averageOfLevels(TNode root) {
        List<Double> al = new ArrayList<>();
        int h = height(root);

        for(int i=0; i<h;i++){
            Double sum[]={0.0};
            Double num_of_nodes[] = {0.0};
            Double avg =0.0;
            traversal(root,  sum, num_of_nodes, i);
            avg = sum[0]/num_of_nodes[0];
            al.add(avg);
        }
        return al;

    }

    static void traversal(TNode t, Double[] sum, Double[] num_of_nodes, int level){
        if(t==null){
            return;
        }
        else{
            traversal(t.Left, sum, num_of_nodes, level-1);
            if(level==0){
                sum[0] += t.val;
                num_of_nodes[0]++;
            }
            traversal(t.Right, sum, num_of_nodes, level-1);
        }
    }

    static int height(TNode t){
        if(t==null){
            return 0;
        }
        else{
            int left_height = 1+ height(t.Left);
            int right_height =1+ height(t.Right);

            return Math.max(left_height, right_height);
        }
    }
}
