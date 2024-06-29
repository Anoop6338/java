package BST;
//leetcode 112

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
        boolean result = false;
        checkSum(t, targetSum, result);
        return result;
    }

    static void checkSum(TNode t, int targetSum, boolean result){
        if(t == null){
            return;
        }

        else{
            checkSum(t.Left, targetSum-t.val, result);
            if(targetSum == 0){
                result = true;
            }
            checkSum(t.Right, targetSum-t.val, result);
        }
    }

    
}
