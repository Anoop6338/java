 package BST;
// leetcode 938

class range_of_bst_leetcode938 {
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

        System.out.println("sum : "+rangeSumBST(bst.root,30, 60));

    }

    static int rangeSumBST(TNode root, int low, int high) {
        int sum[] ={0};
        results(root, low, high, sum);
        return sum[0];
    }

    static void results(TNode t, int low, int high, int[] sum){
        if(t==null){
            return;
        }
        else{
            if(t.val<=high && t.val>=low ){
                sum[0]+=t.val;
            }
            results(t.Left, low, high, sum);
            results(t.Right, low, high, sum);
        }
    }
}