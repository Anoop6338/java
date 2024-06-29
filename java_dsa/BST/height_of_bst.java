package BST;

public class height_of_bst {
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

        System.out.println("height of tree is  : "+getHeight(bst.root));
    }
    static int getHeight(TNode t){
        if(t==null){
            return 0;
        }
        else{
            int left_height = 1+ getHeight(t.Left);
            int right_height = 1+ getHeight(t.Right);

            if(left_height>right_height){
                return left_height;
            }
            else{
                return right_height;
            }
            
        }
    }
}
