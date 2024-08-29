package BST;
//leetcode 112

import javax.swing.tree.TreeNode;

public class path_sum {
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

        System.out.println(hasPathSum(bst.root, 150));
    }

    static boolean hasPathSum(TNode t, int targetSum) {
        // Start the recursion to check for a path sum
        return checkSum(t, targetSum);
    }

    static boolean checkSum(TNode t, int targetSum) {
        if (t == null) {
            return false;  // No path found in a null subtree
        }

        // Check if we've reached a leaf node and the remaining targetSum equals the node's value
        if (t.Left == null && t.Right == null && targetSum == t.val) {
            return true;
        }

        // Continue searching in the left and right subtrees
        return checkSum(t.Left, targetSum - t.val) || checkSum(t.Right, targetSum - t.val);
    }

    
}
