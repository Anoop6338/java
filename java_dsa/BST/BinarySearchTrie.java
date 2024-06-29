package BST;

public class BinarySearchTrie {
    TNode root;

    void add(int val){
        TNode t = root;
        TNode nd = new TNode(val);

        if(isEmpty()){      // adding 1st element
            root =nd;
            System.out.println(val+" is added as first node");
            
        }
        else{               // adding more element
            while(true){
                if(t.val == val) {  // duplicate number
                    System.out.println("Duplicate val : "+val);
                    break;
                }  
                
                else if(t.val > val){    //left node
                    if(t.Left==null){
                        t.Left = nd;
                        System.out.println(val+" is added to left of "+t.val);
                        break;
                    }
                    else{
                        t=t.Left;
                    }
                }

                else{                   // Right node
                    if(t.Right==null){
                        t.Right = nd;
                        System.out.println(val+" is added to right of "+t.val);

                        break;
                    }
                    else{
                        t=t.Right;
                    }
                }
            }
        }
    } 

    boolean isEmpty(){
        if(root == null){
            return true;
        }
        else{
            return false;
        }
    }

    void print(){

    }
}
