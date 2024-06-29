package recursion.level2;

public class basic {
    public static void main(String[] args) {
        System.out.print("preorder   : ");
        display_preorder(3);
        System.out.println();

        System.out.print("inorder    : ");
        display_inorder(3);
        System.out.println();

        System.out.print("postorder  : ");
        display_postorder(3);
        System.out.println();

        System.out.print("order      : ");
        display(3);
        System.out.println();

        System.out.print("order2     : ");
        display2(4);
        System.out.println();
    }

    static void display_preorder(int n){
        if(n==0){
            System.out.print("x ");
        }
        else{
            System.out.print(n+" ");
            display_preorder(n-1);
            display_preorder(n-1);
        }
    }

    static void display_inorder(int n){
        if(n==0){
            System.out.print("x ");
        }
        else{
            display_inorder(n-1);
            System.out.print(n+" ");
            display_inorder(n-1);
        }
    }

    static void display_postorder(int n){
        if(n==0){
            System.out.print("x ");
        }
        else{
            display_postorder(n-1);
            display_postorder(n-1);
            System.out.print(n+" ");

        }
    }


    static void display(int n){
        if(n<0){
            System.out.print("x ");
        }
        else if (n==0) {
            System.out.print(0+" ");
        }
        else{
            System.out.print(n+" ");
            display(n-1);
            display(n-2);
        }
    }


    static void display2(int n){
        if(n<0){
            System.out.print("x ");
        }
        else if (n==0) {
            System.out.print(0+" ");
        }
        else{
            System.out.print(n+" ");
            display2(n-1);
            display2(n-2);
            display2(n-3);
        }
    }

    
}
