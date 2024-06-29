package BST;
// leetcode 543

public class diameter_of_binary_tree {
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

        System.out.println(diameterOfBinaryTree(bst.root));
    }

    static int diameterOfBinaryTree(TNode root) {
        int maxSum[]={0};
        height(root,maxSum);
        return maxSum[0];
    }

    static int height(TNode t, int[] maxSum){
        if(t==null){
            return 0;
        }
        else{
            int left_height = height(t.Left, maxSum);
            int right_height = height(t.Right, maxSum);

            maxSum[0] = Math.max(maxSum[0], left_height + right_height);        // stores the current max diameter

            return Math.max(left_height, right_height)+1;   // as we need to include only one of them with the current node
        }
    }
}
